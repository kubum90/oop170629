package com.hanbit.oop.serviceImpl;

public class GradeReportService {
	public String grade(int kor, int eng, int math,String name) {
		String grade;
		int total = 0, avg = 0;
		total = kor + eng + math;
		avg = total / 3;
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else if (avg >= 50) {
			grade = "E";
		} else {
			grade = "F";
		}
		String abc = "총점:"+total+" 평균:"+avg+" 등급:"+grade+"이름:"+name;
		return abc;
	}
}
