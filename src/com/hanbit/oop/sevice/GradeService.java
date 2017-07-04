package com.hanbit.oop.sevice;

import com.hanbit.oop.domain.GradeBean;

public interface GradeService {
	public int calcTotal(GradeBean g);
	public int calcAvg(int total);
	public String getGrade(int avg);
}
