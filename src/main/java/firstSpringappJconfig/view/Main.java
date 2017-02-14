package firstSpringappJconfig.view;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import firstSpringappJconfig.model.Member;
import firstSpringappJconfig.service.MemberService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		MemberService service = appContext.getBean("memberService", MemberService.class);
		
		List<Member> memberList = service.getAllMembers();
		
		for (Member member : memberList) {
			System.out.println(member);
		}
		
	}

}
