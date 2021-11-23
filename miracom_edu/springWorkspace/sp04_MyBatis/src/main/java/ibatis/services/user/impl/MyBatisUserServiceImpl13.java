package ibatis.services.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ibatis.services.domain.User;
import ibatis.services.user.UserDAO;
import ibatis.services.user.UserService;
/*
 * 바로 뒤에 레이어...UserDAO를 DI(Dependent Injection)하면 됨.
 * 
 * Annotation
 * Service Layer Bean :: Component
 * 
 * 		@Compononent
 * 			|
 * 		Service Layer Component
 * 		@Service
 */

@Service
public class MyBatisUserServiceImpl13 implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void addUser(User user) throws Exception {
		userDAO.addUser(user);
	}

	@Override
	public void updateUser(User user) throws Exception {
		userDAO.updateUser(user);
		
	}

	@Override
	public User getUser(String userId) throws Exception {
		return userDAO.getUser(userId);
	}

	@Override
	public List<User> getUserList(User user) throws Exception {
		return userDAO.getUserList(user);
	}

}
