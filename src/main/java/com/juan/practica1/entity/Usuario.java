package com.juan.practica1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String login;
	private String password;
	private String email;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Usuario(int id, String login, String password, String email) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.email = email;
	}
	
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
