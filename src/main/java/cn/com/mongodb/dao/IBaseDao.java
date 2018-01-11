package cn.com.mongodb.dao;

import java.util.List;
import java.util.Map;

public interface IBaseDao<T> {

	/**
	 * 保存对象
	 * @param t 属性对象
	 * @return 返回成功或者失败
	 * @throws Exception 异常
	 */
	public boolean save(T t) throws Exception;
	
	/**
	 * 查询对象列表
	 * @param t 对象属性
	 * @param params 
	 * @return
	 */
	public List<T> find(Class<?> cls,Map<String,Object> params);
}
