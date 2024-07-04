package com.example.demo.apirest;

import com.example.demo.modelos.PersonaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    @GetMapping("/personas")
    public List<PersonaModel> GetPersons() {
        List<PersonaModel> personas = new ArrayList<>();
        PersonaModel item1 = new PersonaModel();
        item1.setId(1);
        item1.setName("Luis");
        item1.setLastName("Cordova");
        personas.add(item1);
        return personas;
    }
}
