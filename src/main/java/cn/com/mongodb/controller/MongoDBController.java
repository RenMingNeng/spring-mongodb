package cn.com.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.mongodb.model.User;
import cn.com.mongodb.service.IUserService;

@RestController
@RequestMapping(value="mongodb")
public class MongoDBController {

	@Autowired
	IUserService service;
	
	public MongoDBController(){
		System.out.println("init MongoDBController...");
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(User u){
		try {
			service.add(u);
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
		return "success";
	}
	
	@RequestMapping(value="_ttt",method=RequestMethod.GET)
	public String _t_t_t(){
		return "success";
	}
}
