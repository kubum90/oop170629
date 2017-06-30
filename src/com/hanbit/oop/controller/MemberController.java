package com.hanbit.oop.controller;
import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;
import javax.swing.*;

public class MemberController {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		MemberBean member = new MemberBean();
		while(true){
			switch (JOptionPane.showInputDialog("0.종료 1.join 2.login")) {
			case "0":
			JOptionPane.showMessageDialog(null, "시스템 종료");
			return;
			case "1":
			member.setName(JOptionPane.showInputDialog("name"));
			member.setId(JOptionPane.showInputDialog("ID"));
			member.setPassword(JOptionPane.showInputDialog("PASS"));
			member.setSsn(JOptionPane.showInputDialog("SSN"));
			JOptionPane.showMessageDialog(null, ms.join(member));
			break;
			case "2":
			member = new MemberBean();
			member.setId(JOptionPane.showInputDialog("ID?"));
			member.setPassword((JOptionPane.showInputDialog("password?")));
			JOptionPane.showMessageDialog(null, ms.login(member));
			break;
			default:
			break;
			}
		}
	}
}
