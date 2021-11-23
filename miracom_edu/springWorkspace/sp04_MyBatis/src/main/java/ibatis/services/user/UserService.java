package ibatis.services.user;

import java.util.List;

import ibatis.services.domain.User;

/*
 * ServiceLayer
 * ::
 * Data 가공과 관련된 레이어...
 * ::
 *5개의 비즈니스 로직의 템플릿 중에서...
 *addUser, removeUser, updateUser, getUser, getUserList
 *1) Service 레이어와 가장 직결된 메소드는?? getUser, getUserList
 *2) Service 레이어와 가장 관련이 없는 메소드는??removeUser
 */
public interface UserService {
	void addUser(User user) throws Exception;
	void updateUser(User user) throws Exception;

	User getUser(String userId) throws Exception;
	List<User> getUserList(User user) throws Exception;

}
