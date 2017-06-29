package com.hanbit.oop.controller;

import java.util.Scanner;
import com.hanbit.oop.service.BmiService;
import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.GradeReportService;
import com.hanbit.oop.service.GradeService;
import com.hanbit.oop.service.LeapYearService;
import com.hanbit.oop.service.LoginService;
import com.hanbit.oop.service.TimeService;

public class AppController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BmiService bs = new BmiService();
		LeapYearService s3 = new LeapYearService();
		GradeReportService grs = new GradeReportService();
		TimeService ts = new TimeService();
		LoginService ls = new LoginService();
		CalcService cs = new CalcService();
		GradeService g = new GradeService();
		while (true) {
			System.out.println("0.end 1.LeapYear 2.bmi 3.GradeReportService 4.Time 5.Login 6.Calc 7.BmiService");
			switch (s.next()) {
			case "0":
				System.out.println("end");
				return;
			case "1":
				System.out.println("연도를 입력하세요");
				double year = s.nextDouble();
				String result = s3.main(year);
				System.out.println(result);
				break;
			case "2":
				System.out.print("신장: ");
				double height = s.nextDouble();
				System.out.print("몸무게: ");
				double weight = s.nextDouble();
				String bmi = cs.calcBmi(height, weight);
				System.out.println("나의 체질량지수(bmi) : " + bmi);
				break;
			case "3":
				System.out.print("이름\n");
				String name = s.next();
				System.out.print("국어점수\n");
				int kor = s.nextInt();
				System.out.print("영어점수\n");
				int eng = s.nextInt();
				System.out.print("수학점수\n");
				int math = s.nextInt();
				String result1 = grs.grade(kor, eng, math, name);
				System.out.print("*******************************************\n");
				System.out.print(" 이름\t  총점\t 평균\t등급\n");
				System.out.print("-------------------------------------------\n");
				System.out.println(result1);
				System.out.print("*******************************************");
				break;
			case "4":
				System.out.println("초를 입력 해 주세요");
				int sec = s.nextInt();
				String timeset = ts.time(sec);
				System.out.println(timeset);
				break;
			case "5":
				System.out.print("로그인\n");
				System.out.print("ID 입력하세요\n");
				String id = s.next();
				System.out.print("PW 입력하세요\n");
				String pass = s.next();
				String login = ls.login(id, pass);
				System.out.print(login);
				break;
			case "6":
				System.out.println("name?");
				String name2 = s.next();
				g.setName(name2);
				System.out.println("major?");
				String major = s.next();
				g.setmajor(major);
				
				System.out.println("국어점수?");
				int kor2 = s.nextInt();
				g.setKor(kor2);
				System.out.println("영어점수?");
				int eng2 = s.nextInt();
				g.setEng(eng2);
				System.out.println("수학점수?");
				int math2 = s.nextInt();
				g.setMath(math2);
				g.setGrade();
				
				System.out.println(g.toString());
				break;
			case "7" : 
				System.out.println("신장을 입력하세요");
				System.out.println("weight");
				double weight2 = s.nextDouble();
				System.out.println("체중을 입력하세요");
				System.out.println("height");
				double height2 = s.nextDouble();
				bs.setWeight(weight2);
				bs.setHeight(height2);
				bs.setBmi();
				bs.setState();
				
				System.out.println(bs.getState());
				
				break;
			}
		}
	}
}