package controller;

import java.util.List;

import com.mustang.framework.annotation.Autowired;
import com.mustang.framework.annotation.RequestMapping;
import com.mustang.framework.bean.View;
import com.mustang.framework.constant.RequestMethod;

import domain.User;
import service.IUserService;

/**
 * UserController
 *
 * @author: xMustang
 * @since: 1.0
 */
public class UserController {
	@Autowired
	private IUserService userService;

	/**
	 * 获取用户列表
	 *
	 * @return
	 */
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public View getUserList() {
		List<User> allUser = userService.getAllUser();
		return new View("index.jsp").addModel("userList", allUser);
	}
}
