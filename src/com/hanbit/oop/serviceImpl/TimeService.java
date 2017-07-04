package com.hanbit.oop.serviceImpl;
public class TimeService {
	public String time(int sec){
		int hour;
		int minute;
		int second;
		minute = sec /60;   	
		hour = minute /60;
		second = sec%60;
		minute=minute%60;
		String timeset= hour+"시간 "+minute+"분 "+second+"초";
		return timeset;
		}
	}