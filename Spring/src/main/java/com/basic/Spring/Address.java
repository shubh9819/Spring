package com.basic.Spring;

public class Address {
int roomno;
String city;
int pincode;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int roomno, String city, int pincode) {
	super();
	this.roomno = roomno;
	this.city = city;
	this.pincode = pincode;
}
public int getRoomno() {
	return roomno;
}
public void setRoomno(int roomno) {
	this.roomno = roomno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [roomno=" + roomno + ", city=" + city + ", pincode=" + pincode + "]";
}

}
