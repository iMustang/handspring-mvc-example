package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mustang.framework.annotation.Autowired;
import com.mustang.framework.annotation.RequestMapping;
import com.mustang.framework.bean.Data;
import com.mustang.framework.bean.Param;
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
	 * 用户列表
	 *
	 * @return
	 */
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public View getUserList() {
		List<User> userList = userService.getAllUser();
		return new View("index.jsp").addModel("userList", userList);
	}

	/**
	 * 用户详情
	 *
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public Data getUserInfo(Param param) {
		String id = (String) param.getParamMap().get("id");
		User user = userService.GetUserInfoById(Integer.parseInt(id));

		return new Data(user);
	}

	@RequestMapping(value = "/userEdit", method = RequestMethod.GET)
	public Data editUser(Param param) {
		String id = (String) param.getParamMap().get("id");
		Map<String, Object> fieldMap = new HashMap<>();
		fieldMap.put("age", 911);
		userService.updateUser(Integer.parseInt(id), fieldMap);

		return new Data("Success.");
	}
}
