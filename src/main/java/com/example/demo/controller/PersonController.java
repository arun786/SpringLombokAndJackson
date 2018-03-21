/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.XmlConverter;
import com.example.demo.model.Person;
import com.example.demo.service.IPersonService;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author Adwiti
 *
 */
@RestController
public class PersonController {

	@Autowired
	private IPersonService iPersonService;

	@PostMapping("/person")
	public ResponseEntity<List<Person>> getPersonDetails(@RequestBody Person person) throws JsonProcessingException {
		System.out.println(person);
		String name = XmlConverter.convertBeantoXML(person);
		System.out.println(name);
		return new ResponseEntity<>(iPersonService.getPersonDetails(person), HttpStatus.OK);
	}

}
