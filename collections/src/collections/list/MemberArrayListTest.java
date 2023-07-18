package collections.list;

import collections.member.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberList = new MemberArrayList();
		
		//Member 객체 생성
		Member m1 = new Member(101, "이순신");
		Member m2 = new Member(102, "안산");
		Member m3 = new Member(103, "추신수");
		Member m4 = new Member(102, "김연아");
		
		//회원을 추가
		memberList.addMember(m1);
		memberList.addMember(m2);
		memberList.addMember(m3);
		memberList.addMember(m4);
		
		//System.out.println(m1);
		
		//회원 목록 조회
		memberList.showOne(102);
		
		memberList.showAllMember();
		System.out.println("========================");
		//회원 삭제
		memberList.removeMember(102); //앞에 있는 것부터 삭제
		memberList.showAllMember();
		
	}

}
