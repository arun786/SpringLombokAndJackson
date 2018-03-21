/**
 * 
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

/**
 * @author Adwiti
 *
 */
@Data
public class Person {

	@JacksonXmlProperty(localName = "Name")
	private String name;
	@JacksonXmlProperty(localName = "Age")
	private String age;
	@JacksonXmlProperty(localName = "Phone", namespace = "http://www.arun786.xsd")
	private Phone phone;
	//@JacksonXmlProperty(localName = "Addresses", namespace = "https://www.arun786.xsd")
	//private Addresses address;

	@Data
	@JsonPropertyOrder({ "areaCode", "phoneNumber" })
	public class Phone {
		@JacksonXmlProperty(localName = "Areacode")
		private String areaCode;
		@JacksonXmlProperty(localName = "PhoneNumber")
		private String phoneNumber;
	}

	/*@Data
	public class Addresses {
		@JacksonXmlProperty(localName = "Address")
		@JacksonXmlElementWrapper(useWrapping = false)
		private List<Address> addresses;
	}

	@Data
	public class Address {
		@JacksonXmlProperty(localName = "Line1")
		private String line1;
		@JacksonXmlProperty(localName = "Street")
		private String street;
		@JacksonXmlProperty(localName = "State")
		private String state;
	}*/
}
