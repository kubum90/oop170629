package com.hanbit.oop.service;
public class BmiService {
	public String execute(double height,double weight) {
		double result = 0;
		String bmi = "";
		result = weight / (height * height);
		if (result <= 18.5) {
			bmi = "저체중";
		} // else if(result >= 18.5 && result <=24.9){
		  else if (result >= 18.5 && result <= 24.9) {
			bmi = "정상";
		} else if (result >= 25.0 && result <= 29.9) {
			bmi = "과체중";
		} else if (result >= 30) {
			bmi = "비만";
		}
		return bmi;
	}
}
