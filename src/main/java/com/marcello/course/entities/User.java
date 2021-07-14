package com.marcello.course.entities;

import java.io.Serializable;
import java.util.Objects;



public class User implements Serializable  {
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private String name; 
	private String tel;
	private String email;
	private String password;
	
	
	public User() {
	}




	public User(Long id, String name, String tel, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.password = password;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	


	public String getTel() {
		return tel;
	}




	public void setTel(String tel) {
		this.tel = tel;
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


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
