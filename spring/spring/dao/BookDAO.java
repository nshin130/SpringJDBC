package nshin.spring.dao;

import java.util.List;

import nshin.spring.vo.Book;

public interface BookDAO {

	int insertBook(Book b);
	List<Book> selectBook();
	Book selectOneBook(int bookid);
	int updateBook(Book b);
	int deleteBook(int bookid);
	
	
	
	
	
	
	
}
