package firstSpringappJconfig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import firstSpringappJconfig.model.Member;
import firstSpringappJconfig.repository.MemberRepository;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	private MemberRepository memberRepository;
	
	public MemberServiceImpl(){
		
	}
	
	public MemberServiceImpl(MemberRepository memberRepository){
		System.out.println("Hello From the Constructor!");
		this.memberRepository = memberRepository;
	}
	
	/* (non-Javadoc)
	 * @see firstSpringappJconfig.service.MemberService#setMemberRepository(firstSpringappJconfig.repository.MemberRepository)
	 */
	
	@Autowired
	public void setMemberRepository(MemberRepository memberRepository){
		System.out.println("Hello From the Setter!");
		this.memberRepository = memberRepository;
		
	}

	@Override
	public List<Member> getAllMembers() {
		return memberRepository.getAllMembers();
	}
	
	

}
