package com.example.Contact;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class ContactApplication {

	public static void main(String[] args) throws JsonProcessingException {
		Contact[] contacts = {
				new Contact(1,"Mahmoud","ali","apple"),
				new Contact(2,"ahmed","Mohamed","google"),
				new Contact(3,"omar","saleh","microsoft"),
		};
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);
		String jsonformate = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(contacts);
		System.out.println(jsonformate);
	}

}
