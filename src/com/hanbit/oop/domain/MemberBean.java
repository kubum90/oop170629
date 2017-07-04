package com.hanbit.oop.domain;

public class MemberBean {
	private String id, password,name,ssn;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return String.format("이름:%s 아이디:%s 비밀번호:%s 주민번호:%s", name,id,password,ssn);
	}
}