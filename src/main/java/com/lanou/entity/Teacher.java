package com.lanou.entity;

public class Teacher {

	private Integer tId;
	private String tName;
	
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(Integer tId, String tName) {
		super();
		this.tId = tId;
		this.tName = tName;
	}
	
	public Teacher(String tName) {
		super();
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + "]";
	}
	
	
	
}
