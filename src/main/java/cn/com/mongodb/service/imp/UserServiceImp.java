package cn.com.mongodb.service.imp;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.mongodb.dao.IUserDao;
import cn.com.mongodb.model.User;
import cn.com.mongodb.service.IUserService;

/**
* @Description: 用户业务实现类
* @author Y.Jin
* @date 2017年1月18日 下午2:43:32
 */
@Service
public class UserServiceImp implements IUserService {

	@Autowired
	IUserDao<User> dao;
	
	public boolean add(User u) throws Exception {
		u.setId(new Random().nextInt(100000));
		return dao.save(u);
	}
	
}
