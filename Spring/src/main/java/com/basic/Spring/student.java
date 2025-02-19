package com.basic.Spring;

public class student {
	int id;
	String name;
	faculty fac;
	Address1 add;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int id, String name, faculty fac, Address1 add) {
		super();
		this.id = id;
		this.name = name;
		this.fac = fac;
		this.add = add;
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
	public faculty getFac() {
		return fac;
	}
	public void setFac(faculty fac) {
		this.fac = fac;
	}
	public Address1 getAdd() {
		return add;
	}
	public void setAdd(Address1 add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", fac=" + fac + ", add=" + add + "]";
	}
	
}
