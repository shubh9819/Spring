package com.basic.Spring;

public class annotaions {
String name;
int age;
public annotaions() {
	super();
	// TODO Auto-generated constructor stub
}
public annotaions(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void printThrowException() {
	System.out.println("Exception raised");
	throw new IllegalArgumentException();
	
}
public String hello(String name) {
	try {
		Thread.sleep(500);
	}catch(InterruptedException e){
		e.printStackTrace();
		
	}
	return "hello,"+name+"!";
	
}

}
