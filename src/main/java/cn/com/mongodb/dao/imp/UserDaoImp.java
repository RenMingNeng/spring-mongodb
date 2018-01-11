package cn.com.mongodb.dao.imp;

import org.springframework.stereotype.Repository;

import cn.com.mongodb.dao.IUserDao;
import cn.com.mongodb.model.User;

@Repository
public class UserDaoImp extends BaseDaoImp<User> implements IUserDao<User> {

}
