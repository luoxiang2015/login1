package com.luox2014.action;

import com.luox2014.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class Login1Action extends ActionSupport {
private User user;

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	if("a".equals(user.getUser_account())&&"1".equals(user.getUser_password())){
		return "success";	
	}else{
		return "error";
	}
	
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
}
