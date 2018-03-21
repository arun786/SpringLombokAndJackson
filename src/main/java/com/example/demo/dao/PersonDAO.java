/**
 * 
 */
package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

/**
 * @author Adwiti
 *
 */
@Repository
public class PersonDAO implements IPersonDAO {

	@Override
	public List<Person> getPersonDetails(Person person) {
		return Arrays.asList(person);
	}

}
