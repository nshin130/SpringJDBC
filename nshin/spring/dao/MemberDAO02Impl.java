package nshin.spring.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import nshin.spring.vo.Member;


@Repository("mdao02") // db관련 이니까 repository
public class MemberDAO02Impl implements MemberDAO {
	
	@Autowired // 실제 db관련 작업을 위해서
	private SqlSession sqlSession;
	

	@Override
	public void insertMember(Member m) {
		int cnt = sqlSession.insert("member.insertMember", m);
		if (cnt > 0) System.out.println("회원 등록 성공");
	}

	@Override
	public List<Member> selectAllMember() {
		return sqlSession.selectList("member.selectMember"); 
	}

	@Override
	public Member selectOneMember(int mno) {
		return sqlSession.selectOne("member.selectOneMember", mno);
	}

	@Override
	public void updateMember(Member m) {
		int cnt = sqlSession.update("member.updateMember", m);
		if ( cnt > 0) System.out.println("updated");
		
	}

	@Override
	public void deleteMember(int mno) {
		int cnt = sqlSession.delete("member.deleteMember", mno);
		if (cnt > 0) System.out.println("deleted");
		
		
	}




	

}
