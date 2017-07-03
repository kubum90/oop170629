package com.hanbit.oop.inheritance;

public class AndroidPhone extends Iphone{
	// BRAND 갤럭시 노트
	// data 를 오버라이딩 해서 카톡 메세지라고 출력시킴.
	private String size;
	private final static String KIND="스마트 폰";
	private final static String BRAND="갤럭시 노트";
	private String app;
	public void setApp(String app){
		this.app=app;
	}
	public String getApp(){
		return app;
	}
	
	public void setSize(String size){
		setPortable(true);
		this.size=size;
	}
	public String getSize(){
		return size;
	}
	@Override
	public String toString(){
		//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로 
		//갤럭시노트 6인치를 사용해서 안녕이라고 어플을 전송했다.
		return String.format("%s이기 때문에 %s한 상태로 %s에게 %s번호로 %s %s인치를 사용해서 %s라고 %s을 전송했다.",
				KIND,
				move,
				name,phoneNo,BRAND,size,data,app);
	}
}
