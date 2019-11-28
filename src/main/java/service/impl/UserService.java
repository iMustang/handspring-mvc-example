package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mustang.framework.annotation.Transactional;
import com.mustang.framework.helper.DatabaseHelper;

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

	/**
	 * 根据id获取用户信息
	 */
	public User GetUserInfoById(Integer id) {
		String sql = "SELECT * FROM user WHERE id = ?";
		return DatabaseHelper.queryEntity(User.class, sql, id);
	}

	/**
	 * 修改用户信息
	 */
	@Transactional
	public boolean updateUser(int id, Map<String, Object> fieldMap) {
		return DatabaseHelper.updateEntity(User.class, id, fieldMap);
	}
}
