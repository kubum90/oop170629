package com.hanbit.oop.serviceImpl;

public class BmiService {
	private double height2, weight2, bmi;
	private String result;

	public void setHeight(double height2) {
		this.height2 = height2;
	}

	public void setWeight(double weight2) {
		this.weight2 = weight2;
	}

	public double getHeight() {
		return height2;
	}

	public double getWeight() {
		return weight2;
	}

	public void setBmi() {
		this.bmi = weight2 / (height2 * height2);
	}

	public double getBmi() {
		return bmi;
	}

	public void setState() {
		if (bmi <= 18.5) {
			result = "저체중";
		}
		else if (bmi >= 18.5 && bmi <= 24.9) {
			result = "정상";
		} else if (bmi >= 25.0 && bmi <= 29.9) {
			result = "과체중";
		} else if (bmi >= 30) {
			result = "비만";
		}
	}
	public String getState(){
		return result;
	}
}
