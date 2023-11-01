package com.springboot.web.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Owner {
	@Id
	private int owner_id;
	private String name;
	private String email;
	private String password;
	private String contactno;
	public Owner() {
		super();
		
	}
	public Owner(int owner_id, String name, String email, String password, String contactno) {
		super();
		this.owner_id = owner_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactno = contactno;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Owner [owner_id=" + owner_id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contactno=" + contactno + "]";
	}
	
	
}
