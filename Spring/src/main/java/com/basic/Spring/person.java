package com.basic.Spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class person {

	int id;
	String name ;
	int age;
	List<String>phno;
	Set<String> hobbies;
	Map<String ,String> cards;
	private Passport pass;
	Address add;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(int id, String name, int age, List<String> phno, Set<String> hobbies, Map<String, String> cards,
			Passport pass, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.hobbies = hobbies;
		this.cards = cards;
		this.pass = pass;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getPhno() {
		return phno;
	}
	public void setPhno(List<String> phno) {
		this.phno = phno;
	}
	public Set<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Map<String, String> getCards() {
		return cards;
	}
	public void setCards(Map<String, String> cards) {
		this.cards = cards;
	}
	public Passport getPass() {
		return pass;
	}
	public void setPass(Passport pass) {
		this.pass = pass;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", age=" + age + ", phno=" + phno + ", hobbies=" + hobbies
				+ ", cards=" + cards + ", pass=" + pass + ", add=" + add + "]";
	}
	
}
