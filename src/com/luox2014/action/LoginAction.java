package com.luox2014.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String account;
    private String password;
	@Override
    public String execute() throws Exception {
    	// TODO Auto-generated method stub
    	if("a".equals(account)&&"1".equals(password)){
    		System.out.println(account);
    		return "success";
    	}else{
    		return "error";
    	}
    	
    	
    }

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
