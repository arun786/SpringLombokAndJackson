/**
 * 
 */
package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.XmlConverter;
import com.example.demo.model.Person;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author Adwiti
 *
 */
@RestController
public class PersonController {

	@PostMapping("/person")
	public ResponseEntity<String> getPersonDetails(@RequestBody Person person) throws JsonProcessingException {
		System.out.println(person);
		String name = XmlConverter.convertBeantoXML(person);
		System.out.println(name);
		return new ResponseEntity<>(name,HttpStatus.OK);
	}

}
