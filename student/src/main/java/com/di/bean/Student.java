package com.di.bean;

public class Student {
	private int sNo;
	private String studentName;
	private String standard;
	private String address;
	
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public int getsNo() {
		return sNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStandard() {
		return standard;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", studentName=" + studentName + ", standard=" + standard + ", address="
				+ address + "]";
	}
	
	
	
	

}
