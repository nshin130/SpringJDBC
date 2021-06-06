package nshin.spring.service;

import java.util.List;

import nshin.spring.vo.Book;

public interface BookService {
	
	void newBook();
	//void readAllBook();
	//void readOneBook();
	//void modifyBook();
	//void removeBook();

	List<Book> readBook();
	Book readOneBook();
	void modifyBook(Book b);
	void removeBook(int bookid);
}
