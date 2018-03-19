/**
 * 
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
 * @author Adwiti
 *
 */
@Data
//@JacksonXmlRootElement(localName = "Person", namespace = "http://www.arun786.xsd")
public class Person {

	@JacksonXmlProperty(localName = "Name")
	private String name;
	@JacksonXmlProperty(localName = "Age")
	private String age;
	@JacksonXmlProperty(localName = "Phone", namespace = "http://www.arun786.xsd")
	private Phone phone;

	@Data
	@JsonPropertyOrder({ "areaCode", "phoneNumber" })
	public class Phone {
		@JacksonXmlProperty(localName = "Areacode")
		private String areaCode;
		@JacksonXmlProperty(localName = "PhoneNumber")
		private String phoneNumber;
	}

}
