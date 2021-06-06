package nshin.spring.service;

import nshin.spring.vo.Member;

public interface MemberService {
	
	void newMember();

	void readAllMember();
	
	void readOneMember(int mno);
	
	void modifyMember();
	
	void removeMember();

	

}
