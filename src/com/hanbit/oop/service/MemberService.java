package com.hanbit.oop.service;
import javax.swing.JOptionPane;
import com.hanbit.oop.domain.MemberBean;
public class MemberService {
	MemberBean session;
	public MemberService(){
		session = new MemberBean();		
	}
	public String getGender(MemberBean member) {
		String gender="";
		char ch = member.getSsn().charAt(7);
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
		return gender;
	}
	
	//삼항연산자 만들기
	public String getAge(MemberBean member) {
		int age=0;
		int year=Integer.parseInt(member.getSsn().substring(0,2));
		if(17-year>=0){
			age=(2017-(year+2000)+1);
			
		}else{
			age=(2017-(year+1900)+1);
		}
		return String.valueOf(age);
		
		
	}
	public String join(MemberBean member){
		session=member;
		String result="welcome"+session.getId();
		//session에다가 회원가입시 입력한 정보를 저장하는 소스
		return result;
	}
	public String login(MemberBean member) {
		//session = member;
		return (session.getId().equals(member.getId())&&session.getPassword().equals(member.getPassword()) ? "SUCCESS" : "로그인 실패");
	}
	public String toString(){
		return "로그인 됐습니다. 환영합니다! " +session.getId()+"님";
	}

}