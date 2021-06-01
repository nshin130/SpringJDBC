package nshin.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nshin.spring.dao.MemberDAO;
import nshin.spring.vo.Member;

@Service("msrv") //스프링에 의해 관리되기위해 이름을 붙임 (서비스기때문에 서비스)
public class MemberServiceImpl implements MemberService {

	@Autowired 
	private MemberDAO mdao; 
	
	@Override
	public void newMember() {
		Member m = new Member("abc987","9876xyz","jay","abcd123@abc.com");
		
		mdao.insertMember(m);
		System.out.println("registered.");
	}

	@Override
	public void readAllMember() {
		StringBuffer sb = new StringBuffer();
		List<Member> ms = mdao.selectAllMember();
		
		for (Member m: ms) sb.append(m);
		//member의 toString이 호출됨
		
		System.out.println(sb);
		
	}

	@Override
	public void readOneMember(int mno) {
		Member m = mdao.selectOneMember(mno);
		
		System.out.println(m);
		
	}

	@Override
	public void modifyMember() {
		Member m = new Member (10, null, "123456", "Jade", "abc987@abc.com", null);
		
		mdao.updateMember(m);
		
	}

	@Override
	public void removeMember() {
		mdao.deleteMember(10);
		
	}



}
