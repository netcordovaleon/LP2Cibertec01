package com.cibertec.springproject.services.Impl;

import com.cibertec.springproject.model.Client;
import com.cibertec.springproject.repository.IClientRepository;
import com.cibertec.springproject.services.IClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServices implements IClientServices {

    IClientRepository _clientRepository;

    @Autowired
    public ClientServices(IClientRepository clientRepository){
        _clientRepository = clientRepository;
    }

    @Override
    public List<Client> GetClients() {
        return _clientRepository.findAll();
    }
}
