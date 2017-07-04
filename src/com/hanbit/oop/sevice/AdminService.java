package com.hanbit.oop.sevice;

import com.hanbit.oop.domain.MemberBean;

public interface AdminService {
	public void addMember(MemberBean member);
	public MemberBean[] getMembers(); //목록을 가져와서 보여주기
	public int countMembers();
	public MemberBean findById(String id);
	public MemberBean[] findByName(String name);
	public void updatePass(MemberBean member);
}
