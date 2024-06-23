package com.cibertec.springproject.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ReniecConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.cibertec.springproject.client");
        return marshaller;
    }

    @Bean
    public ReniecClient reniecClient(Jaxb2Marshaller marshaller) {
        ReniecClient client = new ReniecClient();
        client.setDefaultUri("http://localhost:55547/Service.svc");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
