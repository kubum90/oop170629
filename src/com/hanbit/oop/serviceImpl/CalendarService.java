package com.hanbit.oop.serviceImpl;

public class CalendarService {
	private int year,month,day;
	private String date;
	//필드는 값을 할당하지 않는다
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.year=month;
	}
	public void setDate(String date){
		this.date=date;
	}
	public void setDay(int day){
		this.day=day;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public String getDate(){
		return date;
	}
	public int getDay(){
		return day;
	}
	public String toString(){
		return year+"년 "+"month"+"월 "+day+"일";
	}
}
