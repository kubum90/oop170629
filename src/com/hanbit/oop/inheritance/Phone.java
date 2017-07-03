package com.hanbit.oop.inheritance;

public class Phone {
	protected String name,phoneNo,brand,call;
	public final static String KIND ="집 전화";
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo(){
		return phoneNo;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
/*	public void setKind(String kind){
		this.kind=kind;
	}
	public String getKind(){
		return kind;
	}*/
	public void setCall(String call){
		this.call=call;
	}
	public String getCall(){
		return call;
	}
	public String toString(){
		return String.format("%s에게 %s %s를 이용해 %s 번호로 %s 라고 인사했다.", name,brand,KIND,phoneNo,call);
 	}
}
