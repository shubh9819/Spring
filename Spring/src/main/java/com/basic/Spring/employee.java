package com.basic.Spring;

public class employee {
	int id ;
	String name;
	String mail;
	int sal;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int id, String name, String mail, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", mail=" + mail + ", sal=" + sal + "]";
	}

}
