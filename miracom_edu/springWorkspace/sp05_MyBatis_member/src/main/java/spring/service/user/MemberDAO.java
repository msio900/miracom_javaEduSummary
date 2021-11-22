package spring.service.user;


public interface MemberDAO {
	int registerMember(MemberVO memberVO) throws Exception;
	int deleteMember(String memberVO) throws Exception;
	int updateMember(MemberVO memberVO) throws Exception;
	List<string> showAllMember(MemberVO user) throws Exception;
}
