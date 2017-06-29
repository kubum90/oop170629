package com.hanbit.oop.service;

public class MemberService {
	private String id, password, name, ssn, gender, age, login, loginId;
	
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
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAge() {
		return age;
	}
	public void setJoin(){
		//String pName =this.name;
		//String pId=this.id;
		//String ppw = this.password;
		String join = name+id+password+"";
	}
	public String getJoin(){
		return "";
	}
	
	
	public String setLogin(String id, String pw) {
		String loginResult = "";
		if (id.equals(this.id) && pw.equals(password)) {
			loginResult = toString();
		} else {
			loginResult = "로그인 실패..";
		}
		return loginResult;
	}
	public String getLogin() {
		return login;
	}
	public String toString() {
		return "WELCOME " + name + " (" + gender + "," + age + "세)";
	}
}
