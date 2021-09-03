package com.gl.itadmin.services;
import java.util.Random;

import com.gl.itadmin.beans.Employee;

public class EmployeeService {

	/*Method to generate password*/
	
	public String generatePassword(){
	Random rand = new Random();
	final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
	StringBuilder stb = new StringBuilder();
	
	for (int i=0;i<10; i++)
	{
		int randomIndex = rand.nextInt(chars.length());
		stb.append(chars.charAt(randomIndex));
		
	}
	String finalPassword = stb.toString();
	return finalPassword;
}
/* Method to generate Email Address*/
	
	public String generateEmailAddress(Employee employee,int departmentNumber){
		/* Array to save department, 0th place is given null as we start numbering from 1*/
		
		String[]departments ={"Null", "Technical", "Admin", "HR", "Legal"};
		String department = departments[departmentNumber];
		
		return employee.getFirstName()+employee.getLastName()+"@"+department+".gliitr.com";
	}
	
	/*Method to show credentials of employee*/
	
	public String showCredentials(Employee employee,int departmentNumber){
		
		String Message = "Dear "+ employee.getFirstName()+"your  credential are generated as follows";
		
		String email =generateEmailAddress(employee,departmentNumber);
		String password = generatePassword();
	
		return Message+"\n email--->" +email + "\n Password--->"+password;
		
	}
}
