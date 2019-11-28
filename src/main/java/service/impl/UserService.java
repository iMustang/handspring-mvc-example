package service.impl;

import java.util.ArrayList;
import java.util.List;

import domain.User;
import service.IUserService;

/**
 * UserService
 *
 * @author: xMustang
 * @since: 1.0
 */
public class UserService implements IUserService {
	@Override
	public List<User> getAllUser() {
		List<User> userList = new ArrayList<>();
		userList.add(new User(1, "tom", 21));
		userList.add(new User(2, "alic", 12));
		userList.add(new User(3, "bob", 32));
		return userList;
	}
}
