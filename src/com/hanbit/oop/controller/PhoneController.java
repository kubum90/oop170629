package com.hanbit.oop.controller;
import javax.swing.JOptionPane;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.Iphone;
import com.hanbit.oop.inheritance.Phone;
public class PhoneController {
	public static void main(String[] args) {
		Phone p = new Phone();
		CellPhone nokia=new CellPhone();
		Iphone iPhone = new Iphone();
		AndroidPhone android = new AndroidPhone();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.집 전화 2.스마트폰 3.아이폰 4.안드로이드")) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				p.setName(JOptionPane.showInputDialog("name?"));
				p.setBrand(JOptionPane.showInputDialog("brand?"));
				
				p.setPhoneNo(JOptionPane.showInputDialog("phoneNo?"));
				p.setCall(JOptionPane.showInputDialog("call?"));
				JOptionPane.showMessageDialog(null, p.toString());
				break;
			default :
				break;
			case "2":
				nokia.setName(JOptionPane.showInputDialog("Name?"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("PhoneNo?"));
				nokia.setBrand(JOptionPane.showInputDialog("Brand?"));
				nokia.setPortable(true);
				nokia.setCall(JOptionPane.showInputDialog("Call Message?"));
				JOptionPane.showMessageDialog(null, nokia.toString());
				break;
			case "3":
				iPhone.setName(JOptionPane.showInputDialog("Name?"));
				iPhone.setPhoneNo(JOptionPane.showInputDialog("PhoneNo?"));
				iPhone.setData(JOptionPane.showInputDialog("data??"));
				//iPhone.setPortable(true);
				JOptionPane.showMessageDialog(null, iPhone.toString());
				break;
			case "4":
				android.setName(JOptionPane.showInputDialog("name??"));
				android.setSize(JOptionPane.showInputDialog("size??"));
				android.setPhoneNo(JOptionPane.showInputDialog("phoneNo??"));
				android.setApp(JOptionPane.showInputDialog("app??"));
				android.setData(JOptionPane.showInputDialog("data??"));
				JOptionPane.showMessageDialog(null, android.toString());
				
			}
		}
	}
}