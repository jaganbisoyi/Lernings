package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>() ;
	private static int usersCount = 3;
	
		static {
			users.add(new User(1,"Adam",new Date()));
			users.add(new User(2,"Eve",new Date()));
			users.add(new User(3,"Jack",new Date()));
		}
	public List<User> findAll(){
		return users;
	}
	public User save(User user) {
		
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		
		User user = null;
		for (User user2 : users) {
			if(user2.getId() == id)
				user = user2;
		}
		return user;
		
	}
	
		
}
