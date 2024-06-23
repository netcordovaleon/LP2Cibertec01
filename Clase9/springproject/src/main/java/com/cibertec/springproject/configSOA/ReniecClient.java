package com.cibertec.springproject.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class ReniecClient extends WebServiceGatewaySupport {

    public PersonaModel getPersonByDni(String dni){

        ObjectFactory fact = new ObjectFactory();
        JAXBElement<String> dniReq = fact.createString(dni);
        GetPersonInformationByDni request = new GetPersonInformationByDni();
        request.setDni(dniReq);

        PersonaModel response = (PersonaModel) getWebServiceTemplate()
                .marshalSendAndReceive(request);
        return response;
    }

}
