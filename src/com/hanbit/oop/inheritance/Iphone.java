package com.hanbit.oop.inheritance;

public class Iphone extends CellPhone{
	protected String data;
	public final static String BRAND="아이폰";
	public final static String KIND="스마트폰";
	// KIND 는 스마트폰이라고 오버라이딩 치자.
	// 
	public void setData(String data){
		this.data=data;
		setPortable(true);
	}
	public String getData(){
		return data;
	}
	@Override
	public String toString(){
		//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로 
		//아이폰을 사용해서 문자를 전송했다.
		return String.format("%s이기 때문에 %s한 상태로 %s에게 %s번호로 %s을 사용해서 %s를 전송했다.",
				KIND,
				move,
				name,phoneNo,BRAND,data);
	}
}
