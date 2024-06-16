package com.cibertec.springproject.services.Impl;

import com.cibertec.springproject.dto.ClientAndPetDTO;
import com.cibertec.springproject.model.Client;
import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.repository.IClientRepository;
import com.cibertec.springproject.repository.IPetRepository;
import com.cibertec.springproject.services.IClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServices  implements IClientServices {

    IPetRepository _petRepository;
    IClientRepository _clientRepository;
    @Autowired
    public ClientServices(
            IClientRepository clientRepository,
            IPetRepository petRepository
    ) {
        this._clientRepository = clientRepository;
        this._petRepository = petRepository;
    }

    @Override
    public List<Client> GetClients() {
        return _clientRepository.findAll();
    }


    @Override
    public Client SaveClient(Client client) {
        Client clientSaved =  _clientRepository.save(client);
        return clientSaved;
    }

    @Override
    public Client SaveClientAndPet(ClientAndPetDTO clientAndPetDTO)  {

        Client clientToSave = new Client();
        clientToSave.setName(clientAndPetDTO.getClientDto().getName());
        clientToSave.setDocumentType(clientAndPetDTO.getClientDto().getDocumentType());
        clientToSave.setDocumentNumber(clientAndPetDTO.getClientDto().getDocumentNumber());
        clientToSave.setStatus(true);

        Client clientSaved = _clientRepository.save(clientToSave);

        clientAndPetDTO.getPetsDto().forEach(petDTO -> {
            Pet petToSave = new Pet();
            petToSave.setName(petDTO.getName());
            petToSave.setAge(petDTO.getAge());
            petToSave.setHeight(petDTO.getHeight());
            petToSave.setWeight(petDTO.getWeight());
            petToSave.setColor(petDTO.getColor());
            petToSave.setStatus(true);
            petToSave.setClient(clientSaved);
            _petRepository.save(petToSave);
        });

        return  clientSaved;
    }
}
