package com.basic.Spring;

public class faculty {
	int fid;
	String name ;
	String course;
	public faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public faculty(int fid, String name, String course) {
		super();
		this.fid = fid;
		this.name = name;
		this.course = course;
	}
	
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "faculty [fid=" + fid + ", name=" + name + ", course=" + course + "]";
	}

}
