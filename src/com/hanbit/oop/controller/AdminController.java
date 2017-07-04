package com.hanbit.oop.controller;
import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;
import com.hanbit.oop.sevice.AdminService;

public class AdminController {

	private static String sList;

	public static void main(String[] args) {
		String sCount=JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요");
		int count = Integer.parseInt(sCount);
		AdminService service = new AdminServiceImpl(count);//생성자에다가 count 줌.
		MemberBean member = null;
		while (true) {
			switch (JOptionPane.showInputDialog("0.exit 1.add 2.count 3.list 4.findById 5.findByName 6.UPDATE")) {
			case "0":
				return;
			case "1":
				//회원가입
				member = new MemberBean();
				member.setId(JOptionPane.showInputDialog("id??"));
				member.setName(JOptionPane.showInputDialog("name??"));
				member.setPassword(JOptionPane.showInputDialog("pass??"));
				member.setSsn(JOptionPane.showInputDialog("ssn??"));
				service.addMember(member);
				JOptionPane.showMessageDialog(null,"가입완료");
				break;
			case "2":
				//count
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;
			case "3":
				//getMembers()
				MemberBean[] list = service.getMembers();
				for(int i=0; i<list.length;i++){
					sList += list[i].toString();
				}
				JOptionPane.showMessageDialog(null, sList);
				break;
			case "4":
				//find id
				String findId = JOptionPane.showInputDialog("찾을 아이디");
				member = service.findById(findId);
				JOptionPane.showMessageDialog(null, member.toString());
				break;
			case "5":
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				MemberBean[] members = service.findByName(name);
				String result="";
				if(members.length==0){
					result="조회할 이름이 없음.";
				}else{
					for(int i=0;i<members.length;i++){
						result+=members[i].toString()+"\n";
					}
				}
				JOptionPane.showMessageDialog(null,result);
				break;
			case "6":
				
				break;
			}
		}
	}
}
