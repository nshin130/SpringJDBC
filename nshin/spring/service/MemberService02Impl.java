package nshin.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nshin.spring.dao.MemberDAO;
import nshin.spring.vo.Member;

@Service("msrv02") //스프링에 의해 관리되기위해 이름을 붙임 (서비스기때문에 서비스)
public class MemberService02Impl implements MemberService {

	@Autowired 
	private MemberDAO mdao02; 
	
	@Override
	public void newMember() {
		Member m = new Member("abc987","9876xyz","jay","abcd123@abc.com");
		
		mdao02.insertMember(m);
		System.out.println("registered.");
	}

	@Override
	public void readAllMember() {
		StringBuffer sb = new StringBuffer();
		List<Member> ms = mdao02.selectAllMember();
		
		for (Member m: ms) sb.append(m);
		//member의 toString이 호출됨
		
		System.out.println(sb);
		
	}

	@Override
	public void readOneMember(int mno) {
		Member m = mdao02.selectOneMember(mno);
		
		System.out.println(m);
		
	}

	@Override
	public void modifyMember() {
		Member m = new Member (6, null, "1234555", "Travis", "Travis@abc.com", null);
		
		mdao02.updateMember(m);
		
	}

	@Override
	public void removeMember() {
		mdao02.deleteMember(7);
		
	}



}
