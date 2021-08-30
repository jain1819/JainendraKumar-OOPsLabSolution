package com.gl.itadmin.demo;

import java.util.Scanner;
import com.gl.itadmin.services.EmployeeService;
import com.gl.itadmin.beans.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = scr.next();
		System.out.println("Enter last name");
		String lastName = scr.next();
		System.out.println("Enter department name in form of choice \n 1. Technical \n 2. Admin \n 3.Human resource \n 4. Legal ");
		int  departmentNumber= scr.nextInt();
	
	
	Employee emp = new Employee(firstName,lastName);
	
	
	EmployeeService empServ = new EmployeeService();
	
	String EmployeeDetails = empServ.showCredentials(emp, departmentNumber);
	System.out.println(EmployeeDetails);
	}

}
