package aspect;

import java.lang.reflect.Method;

import com.mustang.framework.annotation.Aspect;
import com.mustang.framework.proxy.AspectProxy;

import lombok.extern.slf4j.Slf4j;

/**
 * EfficientAspect
 *
 * @author: xMustang
 * @since: 1.0
 */
@Slf4j
@Aspect(pkg = "com.xmustang.controller", cls = "UserController")
public class EfficientAspect extends AspectProxy {

	private Long begin;

	/**
	 * 切入点判断
	 *
	 * @param method
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	public boolean intercept(Method method, Object[] params) throws Throwable {
		return method.getName().equals("getUserList");
	}

	public void before(Method method, Object[] params) throws Throwable {
		log.debug("-------begin----------");
		begin = System.currentTimeMillis();
	}

	public void after(Method method, Object[] params) throws Throwable {
		log.debug(String.format("time:%dms", System.currentTimeMillis() - begin));
		log.debug("--------end-----------");
	}

}
