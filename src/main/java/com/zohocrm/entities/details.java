package com.zohocrm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")

public class details {
	
	@Id
	
	private int id;
	
	private String emo_Name;
	
	private String company;
	
	
	private String Email;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmo_Name() {
		return emo_Name;
	}


	public void setEmo_Name(String emo_Name) {
		this.emo_Name = emo_Name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}
	

}
