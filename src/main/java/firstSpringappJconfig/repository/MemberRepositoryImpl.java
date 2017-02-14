package firstSpringappJconfig.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import firstSpringappJconfig.model.Member;

@Repository("memberRepository")
public class MemberRepositoryImpl implements MemberRepository {

	@Override
	public List<Member> getAllMembers() {
		
		List<Member> memberList = new ArrayList<Member>();
		
		Member member1 = new Member("Niko","Brah", "niko@bla.de", "abc123");
		Member member2 = new Member("John","Rambo", "john@bla.de", "abc123");
		Member member3 = new Member("James","Bond", "james@bla.de", "abc123");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		return memberList;
		
	}

}
