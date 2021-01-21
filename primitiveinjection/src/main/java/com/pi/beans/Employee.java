package com.pi.beans;

public class Employee {
	private int eNo;
	private String eName;
	private String designation;
	private String address;
	private int salary;
	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + ", designation=" + designation + ", address=" + address
				+ ", salary=" + salary + "]";
	}
	
	
}
