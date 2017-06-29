package com.hanbit.oop.service;
public class GradeService {
	//field
	private int kor2,eng2,math2,total,avg;
	private String grade,name,major;
	public void setKor(int kor2){
		this.kor2=kor2;
	}
	public void setEng(int eng2){
		this.eng2 = eng2;
	}
	public void setMath(int math2){
		this.math2 = math2;
	}
	public int getKor(){
		return kor2;
	}
	public int getEng(){
		return eng2;
	}
	public int getMath(){
		return math2;
	}
	public void setTotal(){
		this.total=kor2 + eng2 + math2;
	}
	public int getTotal(){
		return total;
	}
	public void setAvg(){
		this.avg=total/3;
	}
	public int getAvg(){
		return avg;
	}
	public void setGrade() {
		setTotal();
		setAvg();
		switch (avg / 10) {
		case 10:
		case 9:
			grade = "A학점 장학금 대상입니다.";
			break;
		case 8:
			grade = "B학점 3학점 이수";
			break;
		case 7:
			grade = "C학점 2학점 이수.";
			break;
		case 6:
			grade = "D학점 1학점 이수";
			break;
		case 5:
			grade = "F학점 재 수강";
			break;
		default:
			grade = "학사 경고";
			break;
		}
	}
	public String getGrade(){
		return this.grade;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setmajor(String major){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
	public String toString(){
		return "============================================\n"
				+"이름    전공                 성적\n"
				+"------------------------------------------"
				+"name"+"\t"+major+"/t"+grade+"\n"
				+"=========================================";
	}
}