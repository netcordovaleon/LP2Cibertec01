package com.cibertec.springproject.rest;

import com.cibertec.springproject.model.Client;
import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.services.IClientServices;
import com.cibertec.springproject.services.IPetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    IClientServices _clientServices;

    @Autowired
    public ClientController(IClientServices clientServices) {
        this._clientServices=clientServices;
    }

    @GetMapping("/client")
    public List<Client> getAll() {
        return _clientServices.GetClients();
    }
}
