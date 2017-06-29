package com.hanbit.oop.service;

public class LeapYearService {
	public String main(double year) {
		String result;
		//System.out.print("연도를 입력하세요\n");
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				result = "평년";
				if (year % 400 == 0) {
					result = "윤년";
				}
			}
			result = "윤년";
		} else {
			result = "평년";
		}
		return result;
	}
}