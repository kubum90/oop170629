package com.hanbit.oop.service;

//아이디 비밀번호 ,,,welcome 이름 남
public class MemberService {
	private String name, gender, ssn,age, id, password, loginID, loginPW, result;
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginPW(String loginPW) {
		this.loginPW = loginPW;
	}
	public String getLoginPW() {
		return loginPW;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
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
	public void setAge() {
		int year=Integer.parseInt(ssn.substring(0,2));
		if(17-year>=0){
			this.age=String.valueOf(2017-(year+2000)+1);
		}else{
			this.age=String.valueOf(2017-(year+1900)+1);
		}
	}
	public String getAge() {
		return age;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	/*public void setLogin() {
		if (!id.equals(this.id)) {
			result = "Your ID does not exist";
		} else if (!password.equals(this.password)) {
			result = "Your PW is wrong";
		} else {
		}
	}*/

/*	public String getLogin() {
		return login;
	}*/
	public void setGender() {
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1':
		case '3':
			gender = "남";
			break;
		case '2':
		case '4':
			gender = "여";
			break;
		case '5':
		case '6':
			gender = "외국인";
			break;
		default:
			gender = "잘못된 입력입니다.";
		}
	}
	
	public String getGender() {
		return gender;
	}
	public void setResult(){
		this.result=result;
	}
	public String getResult(){
		return result;
	}
	public void setBranch() {
		getId();
		getPassword();
		if (getId().equals(loginID)&&getPassword().equals(loginPW)) {
			result=toString();
		} else{
			result="아이디 또는 비밀번호를 확인해주세요.";
		}
	}
	public String getBranch() {
		return result;
	}
	public String toString() {
		return "welcome 이름::" + this.name + "  아이디::" + this.id + "  성별 ::" + this.gender + " 나이::"+age;
	}
}