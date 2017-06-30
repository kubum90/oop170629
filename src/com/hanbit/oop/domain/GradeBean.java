package com.hanbit.oop.domain;
public class GradeBean {
	private int eng2,math2,kor2;
	private String name,major;
	public void setKor(int kor2){
		this.kor2= kor2;
	}
	public void setEng(int eng2){
		this.eng2 = eng2;
	}
	public void setMath(int math2){
		this.math2 = math2;
	}
	public int getKor(){
		return kor2;
	}
	public int getEng(){
		return eng2;
	}
	public int getMath(){
		return math2;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setmajor(String major){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
}
