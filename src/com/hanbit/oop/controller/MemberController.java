package com.hanbit.oop.controller;
import java.util.Scanner;
import com.hanbit.oop.service.MemberService;
public class MemberController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MemberService ms = new MemberService();
		while(true){
			System.out.println("0.종료 1.join 2.login");
			switch (s.next()) {
			case "0":
			System.out.println("System 종료");
			return;
			case "1":
			System.out.println("이름?");
			String name = s.next();
			System.out.println("id?");
			String id = s.next();
			System.out.println("password?");
			String password = s.next();
			System.out.println("ssn?");
			String ssn = s.next();
			System.out.println("회원가입 성공!!");
			break;
			case "2":
			System.out.println("id?");
			String loginId = s.next();
			System.out.println("password?");
			String loginPass = s.next();
			ms.setLogin(loginId, loginPass);
			
			
			//.......
			System.out.println(ms.getLogin());
			break;
			default:
			break;
			}
		}
	}
}
