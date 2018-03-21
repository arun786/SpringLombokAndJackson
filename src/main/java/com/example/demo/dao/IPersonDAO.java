/**
 * 
 */
package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Person;

/**
 * @author Adwiti
 *
 */
public interface IPersonDAO {
	public List<Person> getPersonDetails(Person person);
}
