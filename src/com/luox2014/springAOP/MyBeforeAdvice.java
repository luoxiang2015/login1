package com.luox2014.springAOP;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class MyBeforeAdvice implements MethodBeforeAdvice {
/**
 * 前置通知  
 */
	
	@Override
	public void before(Method arg0, Object[] arg1, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		String customer = (String) arg1[0];
		System.out.println("欢迎光临 "+customer+" ！");
	}
	

}
