package nshin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import nshin.spring.service.MemberService;

public class MemberJdbcApp02 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc02.xml");

		MemberService msrv = (MemberService) ctx.getBean("msrv02");
		
		// 회원등록 (id pswd name email)
		//msrv.newMember();
		
		// 회원전체조회 (번호 아이디 이름 가입일)
		//msrv.readAllMember();
		
		// 회원상세조회 (번호기준으로 특정회원 상세조회)
		//msrv.readOneMember(11);
		
		// 회원수정 (번호기준 비번 이름 이메일 수정)
		//msrv.modifyMember();
		
		// 회원삭제 (번호 기준 회원정보 삭제)
		msrv.removeMember();
	}

}
