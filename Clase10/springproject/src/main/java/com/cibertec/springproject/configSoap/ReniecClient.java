package com.cibertec.springproject.configSoap;

import com.cibertec.springproject.wsdl.ObjectFactory;

import jakarta.xml.bind.JAXBElement;
import com.cibertec.springproject.wsdl.GetPersonInformationByDni;
import com.cibertec.springproject.wsdl.GetPersonInformationByDniResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;





public class ReniecClient extends WebServiceGatewaySupport {


    public GetPersonInformationByDniResponse GetPersonByDNI(String dni) {

        ObjectFactory fact = new ObjectFactory();
        JAXBElement<String> param = fact.createString(dni);
        GetPersonInformationByDni request = new GetPersonInformationByDni();
        request.setDni(param);

        GetPersonInformationByDniResponse response = (GetPersonInformationByDniResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:55547/Service.svc", request);

        return response;

    }
}
