/**
 * 
 */
package com.example.demo.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * @author Adwiti
 *
 */
public class XmlConverter {
	
	public static String convertBeantoXML(Object person) throws JsonProcessingException{
		XmlMapper xmlMapper = new XmlMapper();
		return xmlMapper.writeValueAsString(person);
	}

}
