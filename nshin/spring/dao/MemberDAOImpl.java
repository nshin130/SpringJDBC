package nshin.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import nshin.spring.vo.Member;


@Repository("mdao") // db관련 이니까 repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired // 실제 db관련 작업을 위해서
	private JdbcTemplate jdbcTemplate;

	
	@Override
	public void insertMember(Member m) {
		String sql = " insert into member (userid, passwd, name, email) values (?,?,?,?) ";
		
		Object[] params = new Object[] {
				m.getUserid(), m.getPasswd(), m.getName(), m.getEmail() };
		
		int cnt = jdbcTemplate.update(sql,params);
		if (cnt > 0) System.out.println("Data has been updated.");
	}

	@Override
	public List<Member> selectAllMember() {
		String sql = " select mno, userid, name, joindate from member order by mno desc ";
		RowMapper<Member> mapper = new MemberMapper();
		// parameter type: member <>안에 내용
		
		return jdbcTemplate.query(sql, mapper);
	}
	
	// 멤버데이터를 출력하기 위한 RowMapper 클래스
	private class MemberMapper implements RowMapper<Member> {
		@Override
		public Member mapRow(ResultSet rs, int num) throws SQLException {
			
			int mno = rs.getInt("mno");
			String userid = rs.getString("userid");
			String name = rs.getString("name");
			String joindate = rs.getString("joindate").substring(0,10);
			Member m = new Member (mno, userid, "", name, "", joindate);
			
			return m;
		}
		
	}

	@Override
	public Member selectOneMember(int mno) {
		String sql = " select * from member where mno = ? ";
		Object[] params = new Object[] {mno};
		
		RowMapper<Member> mapper = new MemberOneMapper();
		
		return jdbcTemplate.queryForObject(sql, params, mapper);
	}
	
	private class MemberOneMapper implements RowMapper<Member> {

		@Override
		public Member mapRow(ResultSet rs, int num) throws SQLException {
			
			int mno = rs.getInt("mno");
			String userid = rs.getString("userid");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String joindate = rs.getString("joindate");
			
			Member m = new Member(mno, userid, "", name, email, joindate);
			
			return m;
		}
		
	}

	@Override
	public void updateMember(Member m) {
		String sql = " update member set passwd=?, name=?, email=? where mno=? ";
		
		Object[] params = new Object[] { m.getPasswd(), m.getName(), m.getEmail(), m.getMno() };
		
		int cnt = jdbcTemplate.update(sql, params);
		if (cnt > 0) System.out.println("information has been updated");
	}

	@Override
	public void deleteMember(int mno) {
		String sql = " delete from member where mno = ? ";
		
		Object[] params = new Object[] {mno};
		
		int cnt = jdbcTemplate.update(sql,params);
		if (cnt > 0) System.out.println("it has been deleted");
		
	}




	

}
