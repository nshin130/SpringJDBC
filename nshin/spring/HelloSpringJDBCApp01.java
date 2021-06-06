package nshin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import nshin.spring.service.SungJukService;

public class HelloSpringJDBCApp01 {

	// 스프링 JDBC를 이용한 프로젝트
	// 기존 JDBC API이용시 문제점
	// JDBC는 데이터 베이스에 접근하기 위한 자바 표준 API
	// 하지만 JDBC는 표준 API를 사용하면서 발생하는 문제는
	
	// 1. Connection/PreparedStatement/ResultSet 객체관리
	// 2. 복잡한 예외/SQLException 처리 문제 - 원인 파악 모호
	// 3. DriverManager / JNDI를 이용한 Connection 객체 취득문제
	
	// 하지만, 스프링 프레임워크의 JDBC 기능을 이용하면 위 문제 대부분 해결됨
	
	// persistance layer 개발의 주요 API
	// JDBC : 자바 표준 API
	// JDA : J2EE응용프로그램 제작시 persistance layer개발을 위한 표준 API
	// Hibernate :ORM 기반 persistnace layer개발 API
	// myBatis : SQL mapping 기반 persistance layer개발 API
	 
	// spring JDBC template.support 클래스
	// jdbc.core.JdbcTemplate
	// jdbc.core.JdbcSimpleTemplate
	// jdbc.core.namedparam.NamedParameterJdbcTemplate
	// orm.hibernate.HibernateTemplate
	// orm.mybatis.SqlMapClientTemplate
	
	// 필요 라이브러리
	// spring-jdbc
	// spring-tx
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc01.xml");
		
		SungJukService sjsrv = (SungJukService) ctx.getBean("sjsrv");
		
		// 성적 데이터 생성후 디비에 저장
		//sjsrv.newSungJuk();
		
		//성적 데이터 조회
		//sjsrv.readAllSungJuk();
		
		//성적 데이터 상세 조회
		//sjsrv.readOneSungJuk(3);
		
		//성적 데이터 수정
		//sjsrv.modifySungJuk();
		
		//성적 데이터 삭제
		sjsrv.removeSungJuk();
	}

}
