package com.hanbit.oop.serviceImpl;


public class LoginService {
	public static final String USER_ID="bum";
	public static final String USER_PASS="1";
	public String login(String id,String pass){	
		String result;
		if(!id.equals(USER_ID)){
			result ="ID not found\n";
		}else if(!pass.equals(USER_PASS)){
			result =" PASS miss match\n";
		}else{
			result = "login success\n";
		}
		return result;
		
	}
}
