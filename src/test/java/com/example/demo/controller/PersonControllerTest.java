/**
 * 
 */
package com.example.demo.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Person;
import com.example.demo.service.IPersonService;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author Adwiti
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonControllerTest {

	@Mock
	private IPersonService iPersonService;

	@InjectMocks
	private PersonController personController;
	private Person person;

	@Before
	public void setUp() {
		person = new Person();
		person.setName("Arun");
		person.setAge("15");

		Person.Phone phone = person.new Phone();
		phone.setAreaCode("480");
		phone.setPhoneNumber("2321632");
		person.setPhone(phone);
	}

	@Test
	public void getPersonDetails() throws JsonProcessingException {
		when(iPersonService.getPersonDetails(person)).thenReturn(Arrays.asList(person));
		ResponseEntity<List<Person>> persons = personController.getPersonDetails(person);
		assertEquals(1, persons.getBody().size());
		assertEquals("Arun", persons.getBody().get(0).getName());
		assertEquals("15", persons.getBody().get(0).getAge());
		assertEquals("480", persons.getBody().get(0).getPhone().getAreaCode());
		assertEquals("2321632", persons.getBody().get(0).getPhone().getPhoneNumber());
	}
}
