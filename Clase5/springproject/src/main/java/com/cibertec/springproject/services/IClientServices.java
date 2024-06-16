package com.cibertec.springproject.services;

import com.cibertec.springproject.client.GetPersonInformationByDniResponse;
import com.cibertec.springproject.dto.ClientAndPetDTO;
import com.cibertec.springproject.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IClientServices {
    List<Client> GetClients();
    Client SaveClient(Client client);
    Client SaveClientAndPet(ClientAndPetDTO clientAndPetDTO);
    GetPersonInformationByDniResponse GetClientByDNI(String dni);
}
