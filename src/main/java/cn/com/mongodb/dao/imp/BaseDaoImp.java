package cn.com.mongodb.dao.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import cn.com.mongodb.dao.IBaseDao;

public class BaseDaoImp<T> implements IBaseDao<T> {


	@Autowired 
	private MongoTemplate mongoTemplate;
	@Autowired
	private MongoOperations mongoOperations;
	
	public boolean save(T t) throws Exception {
		try{
			mongoTemplate.save(t);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public List<T> find(Class<?> cls, Map<String, Object> params) {
		Query query = new Query();
		return (List<T>) mongoTemplate.find(query, cls);
	}

}
