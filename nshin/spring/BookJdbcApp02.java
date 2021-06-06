package nshin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import nshin.spring.service.BookService;
import nshin.spring.vo.Book;

public class BookJdbcApp02 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc02.xml");
		
		BookService bsrv = (BookService) ctx.getBean("bsrv02");
		
		// 책 등록
		//bsrv.newBook();
		// 책 조회
		//bsrv.readBook();
		// 책 상세조회
		//bsrv.readOneBook();
		// 책 수정
		//Book b = new Book(999, "spring basic2", "더나은", 30000);
		//bsrv.modifyBook(b);
		// 책 제거
		bsrv.removeBook(50);

	}

}
