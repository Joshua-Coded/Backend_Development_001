package com.alana.jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private long id;
	private String name;
	private String email;
	
	public User(long id, String name, String email) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
}
