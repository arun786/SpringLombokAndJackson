/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Person;

/**
 * @author Adwiti
 *
 */
public interface IPersonService {
	public List<Person> getPersonDetails(Person person);
}
