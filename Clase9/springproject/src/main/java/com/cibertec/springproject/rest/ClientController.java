package com.cibertec.springproject.rest;

import com.cibertec.springproject.client.GetPersonInformationByDniResponse;
import com.cibertec.springproject.client.PersonaModel;
import com.cibertec.springproject.dto.ClientAndPetDTO;
import com.cibertec.springproject.model.Client;
import com.cibertec.springproject.services.IClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {


    IClientServices _clientServices;

    @Autowired
    public ClientController(IClientServices clientServices) {
        this._clientServices=clientServices;
    }


    @PostMapping("/client")
    public Client SaveClient (@RequestBody Client request) {
        return _clientServices.SaveClient(request);
    }

    @PostMapping("/client/pet")
    public Client SaveClientAndPet (@RequestBody ClientAndPetDTO request) {
        return _clientServices.SaveClientAndPet(request);
    }

    @GetMapping("/client/dni")
    public PersonaModel GetPersonByDNI(String dni) {
        return _clientServices.GetClientByDNI(dni);
    }

}
