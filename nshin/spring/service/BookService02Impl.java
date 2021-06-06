package nshin.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nshin.spring.dao.BookDAO;
import nshin.spring.vo.Book;

@Service("bsrv02")
public class BookService02Impl implements BookService {
	
	@Autowired
	private BookDAO bdao02; 

	@Override
	public void newBook() {
		Book b = new Book(259, "Spring5 basic", "더조은", 35000);
		int cnt = bdao02.insertBook(b);
		if (cnt > 0) System.out.println("book has been added");
	}

	@Override
	public List<Book> readBook() {
		StringBuffer sb = new StringBuffer();
		List<Book> bs = bdao02.selectBook();
		
		for (Book b : bs) sb.append(b);
		
		System.out.println(sb.toString());
		
		return null;
		
	}

	@Override
	public Book readOneBook() {
		Book b = bdao02.selectOneBook(999);
		System.out.println(b);
		 
		return null;
	}

	@Override
	public void modifyBook(Book b) {
		int cnt = bdao02.updateBook(b);
		if(cnt > 0) System.out.println("updated");
	}

	@Override
	public void removeBook(int bookid) {
		int cnt = bdao02.deleteBook(bookid);
		if (cnt > 0) System.out.println("deleted");
		
	}

}
