/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPersonDAO;
import com.example.demo.model.Person;

/**
 * @author Adwiti
 *
 */
@Service
public class PersonService implements IPersonService {
	@Autowired
	private IPersonDAO IPersonDAO;

	@Override
	public List<Person> getPersonDetails(Person person) {
		return IPersonDAO.getPersonDetails(person);
	}

}
