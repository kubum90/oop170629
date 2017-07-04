package com.hanbit.oop.serviceImpl;
public class CalcService {
	public String calcBmi(double height , double weight) {
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
	public String calcPlus(String a, String b) {
		return String.valueOf((Integer.parseInt(a)+Integer.parseInt(b)));
	}
	public String calcMinus(String a, String b) {
		return String.valueOf((Integer.parseInt(a)-Integer.parseInt(b)));
	}
	public String calcMulti(String a, String b) {
		return String.valueOf((Integer.parseInt(a)*Integer.parseInt(b)));
	}
	public String calcDiv(String a, String b) {
		return String.valueOf((Integer.parseInt(a)/Integer.parseInt(b)));
	}
	public String calcTax(String salary) {
		String result="";
		return result;
	}
	public String calcTime(String time) {
		String result="";
		return result;
	}
}
