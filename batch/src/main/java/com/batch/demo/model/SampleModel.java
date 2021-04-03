package com.batch.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SampleModel {
	
	 private Integer employeeID; 
     private String empFirstName;
     private String empLastName;
     private String empStreetAddress;
     private String empCity;
     private String empState;
     private String empZipCode     ;
     private String empAreaCode    ;  
     private String empPhoneNumber;
     private String empDOB;
     private String managerID;
     
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpStreetAddress() {
		return empStreetAddress;
	}
	public void setEmpStreetAddress(String empStreetAddress) {
		this.empStreetAddress = empStreetAddress;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	public String getEmpZipCode() {
		return empZipCode;
	}
	public void setEmpZipCode(String empZipCode) {
		this.empZipCode = empZipCode;
	}
	public String getEmpAreaCode() {
		return empAreaCode;
	}
	public void setEmpAreaCode(String empAreaCode) {
		this.empAreaCode = empAreaCode;
	}
	public String getEmpPhoneNumber() {
		return empPhoneNumber;
	}
	public void setEmpPhoneNumber(String empPhoneNumber) {
		this.empPhoneNumber = empPhoneNumber;
	}
	public String getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}
	public String getManagerID() {
		return managerID;
	}
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}
     
	
	
    
}
