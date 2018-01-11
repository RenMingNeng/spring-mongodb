package cn.com.mongodb.service;

import cn.com.mongodb.model.User;

public interface IUserService {

	/**
	 * 保存用户信息
	 * @param u 用户对象
	 * @return 返回 成功-失败
	 * @throws Exception 异常
	 */
	public boolean add(User u) throws Exception;
}
