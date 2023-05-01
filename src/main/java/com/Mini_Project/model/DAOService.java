package com.Mini_Project.model;

import java.sql.ResultSet;

//Abstraction
public interface DAOService {
	public void connectDB();
	public boolean verifylogin(String email, String password);
	public void saveRegistration(String name,String city,String email,String mobile);
	public ResultSet getAllReg();
	public void deleteRegistration(String email);
	public void updateRegistration(String email, String mobile);
}
