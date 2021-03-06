package nshin.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nshin.spring.vo.SungJuk;

@Repository("sjdao02")
public class SungJukDAO02Impl implements SungJukDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertSungJuk(SungJuk sj) {
		int cnt = sqlSession.insert("sungjuk.insertSungjuk",sj);
		if (cnt > 0) System.out.println("성적 등록 성공");
		// insert(namespace.id)
	}
	
	@Override
	public List<SungJuk> selectAllSungJuk() {
		return sqlSession.selectList("sungjuk.selectSungjuk");
	}

	@Override
	public SungJuk selectOneSungJuk(int sjno) {
		return sqlSession.selectOne("sungjuk.selectOneSungjuk", sjno);
		// , 뒤에 parameter type( 매개변수 넘겨줘야 하니까 )
		
	}

	@Override
	public void updateSungJuk(SungJuk sj) {
		int cnt = sqlSession.update("sungjuk.updateSungjuk", sj);
		if(cnt>0) System.out.println("수정완료");
	}

	@Override
	public void deleteSungJuk(int sjno) {
		int cnt = sqlSession.delete("sungjuk.deleteSungjuk", sjno);
		if (cnt>0) System.out.println("삭제완료");
	}
	
}
