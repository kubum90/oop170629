package com.hanbit.oop.controller;
import javax.swing.JOptionPane;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.serviceImpl.GradeServiceImpl;
import com.hanbit.oop.sevice.GradeService;
public class GradeController {
	public static void main(String[] args) {
		GradeService gradeService = new GradeServiceImpl();
		GradeBean gradeBean = new GradeBean();
		while (true) {
			switch (JOptionPane.showInputDialog("0.exit 1.Grade Calc")) {
			case "0":
				JOptionPane.showMessageDialog(null, "System EXIT");
				return;
			case "1":
				gradeBean.setName(JOptionPane.showInputDialog("name??"));
				gradeBean.setmajor(JOptionPane.showInputDialog("major??"));
				gradeBean.setKor(Integer.parseInt(JOptionPane.showInputDialog("kor???")));
				gradeBean.setMath(Integer.parseInt(JOptionPane.showInputDialog("math???")));
				gradeBean.setEng(Integer.parseInt(JOptionPane.showInputDialog("eng????")));
				//JOptionPane.showMessageDialog(null,gradeService.getGrade(gradeService.calcAvg(gradeService.calcTotal(gradeBean))));
				JOptionPane.showMessageDialog(null, gradeService.getGrade(gradeService.calcAvg(gradeService.calcTotal(gradeBean))));
				break;
			}
		}
	}
}