package com.hanbit.oop.serviceImpl;
import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.sevice.AdminService;
public class AdminServiceImpl implements AdminService{
	int count;
	MemberBean member;
	MemberBean[] list;
	public AdminServiceImpl(int limit){
		count = 0;
		member =  new MemberBean();
		list = new MemberBean[limit];
	}
	//생성자 처리가 이 문제의 핵심
	@Override
	public void addMember(MemberBean member) {
		list[count] = member;
		for(int i=0; i<(count+1); i++){
		}
		count++;
		System.out.println(count);
	}
	@Override
	public int countMembers() {
		return count;
	}
	@Override
	public MemberBean[] getMembers() {
		return list;
	}
	@Override
	public MemberBean findById(String id) {
		member = new MemberBean();
		for(int i=0; i<list.length; i++){
			if(id.equals(list[i].getId())){
				member = list[i];
			}
		}
		return member;
	}
	@Override
	public MemberBean[] findByName(String name) {
		int x = 0;
		for(int i=0; i<list.length;i++){
			if(name.equals(list[i].getName())){
				x++;
			}
		}
		MemberBean[] members=new MemberBean[x];
		int j=0;
		for(int i=0; i<list.length;i++){
			if(name.equals(list[i].getName())){
				members[j]=list[i];
				j++;
			}
			if(x==j){
				break;
			}
		}
		return members;
	}
	@Override
	public void updatePass(MemberBean member) {
		
	}
}