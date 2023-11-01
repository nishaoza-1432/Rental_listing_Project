package com.springboot.web.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tenant {
	@Id
	private int tenant_id;
	private String name;
	private String email;
	private String password;
	private int contactno;
	public Tenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tenant(int tenant_id, String name, String email, String password, int contactno) {
		super();
		this.tenant_id = tenant_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactno = contactno;
	}
	public int getTenant_id() {
		return tenant_id;
	}
	public void setTenant_id(int tenant_id) {
		this.tenant_id = tenant_id;
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
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Tenant [tenant_id=" + tenant_id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contactno=" + contactno + "]";
	}
}
