package service;

import java.util.List;
import java.util.Map;

import domain.User;

/**
 * IUserService
 *
 * @author: xMustang
 * @since: 1.0
 */
public interface IUserService {
	List<User> getAllUser();

	User GetUserInfoById(Integer id);

	boolean updateUser(int id, Map<String, Object> fieldMap);
}
