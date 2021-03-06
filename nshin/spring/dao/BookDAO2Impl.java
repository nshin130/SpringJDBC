package nshin.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nshin.spring.vo.Book;

@Repository("bdao02")
public class BookDAO2Impl implements BookDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertBook(Book b) {
		return sqlSession.insert("book.insertBook",b);
	}

	@Override
	public List<Book> selectBook() {
		return sqlSession.selectList("book.selectBook");
		
		
	}

	@Override
	public Book selectOneBook(int bookid) {
		return sqlSession.selectOne("book.selectOneBook",bookid);
	}

	@Override
	public int updateBook(Book b) {
		return sqlSession.update("book.updateBook",b);
	}

	@Override
	public int deleteBook(int bookid) {
		
		return sqlSession.delete("book.deleteBook",bookid);
	}




	
}
