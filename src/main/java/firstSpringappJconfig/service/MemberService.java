package firstSpringappJconfig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import firstSpringappJconfig.model.Member;
import firstSpringappJconfig.repository.MemberRepository;

public interface MemberService {

	
	public List<Member> getAllMembers();
	
}