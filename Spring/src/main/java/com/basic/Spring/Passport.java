package com.basic.Spring;

public class Passport {
	int no;
	String validyear;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(int no, String validyear) {
		super();
		this.no = no;
		this.validyear = validyear;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getValidyear() {
		return validyear;
	}
	public void setValidyear(String validyear) {
		this.validyear = validyear;
	}
	@Override
	public String toString() {
		return "Passport [no=" + no + ", validyear=" + validyear + "]";
	}
	

}
