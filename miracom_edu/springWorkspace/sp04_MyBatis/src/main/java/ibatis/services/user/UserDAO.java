package ibatis.services.user;

import java.util.List;

import ibatis.services.domain.User;

/*
 * 비즈니스로직의 Template 기능을 담고 있는 모듈...
 * 
 * 비즈니스 로직의 갯수는?
 * 비즈니스 로직의 메소드 이름은?
 * -->
 * mybatis-userservice-mapping10.xml
 * 문서의 쿼리문 tag 갯수	 --> 비즈니스로직의 메소드 갯수
 * 문서의 쿼리문 tag id	 --> 비즈니스로직의 메소드 이름
 * 
 * 비즈니스 로직의 메소드 선언시
 * parameterType은 메소드 인자값 참고
 * resultMap은 메소드의 리턴 타입 참고
 */
public interface UserDAO {
	int addUser(User user) throws Exception;
	int updateUser(User user) throws Exception;
	int removeUser(String userId) throws Exception;
	User getUser(String userId) throws Exception;
	List<User> getUserList(User user) throws Exception;
}
