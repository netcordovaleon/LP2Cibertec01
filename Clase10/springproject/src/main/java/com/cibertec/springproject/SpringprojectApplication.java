package com.cibertec.springproject;

import com.cibertec.springproject.configSoap.ReniecClient;
import com.cibertec.springproject.wsdl.GetPersonInformationByDniResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringprojectApplication.class, args);
	}
/*
	@Bean
	CommandLineRunner lookup(ReniecClient reniecClient) {
		return args -> {
			String dni = "12345678";

			if (args.length > 0) {
				dni = args[0];
			}
			GetPersonInformationByDniResponse response = reniecClient.GetPersonByDNI(dni);
			System.err.println(response.getGetPersonInformationByDniResult().getName());
		};
	}*/

}
