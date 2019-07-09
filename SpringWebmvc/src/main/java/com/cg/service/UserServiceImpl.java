/**
 * 
 */
package com.cg.service;

import com.cg.dao.UserDao;

/**
 * @author trainee
 *
 */
public class UserServiceImpl implements UserService {
	
	private UserDao dao;

	public String viewMessage() {
		return dao.getMessage();
		
	}
	
	void setDao(UserDao dao)
	{
		this.dao=dao;
	}

}
