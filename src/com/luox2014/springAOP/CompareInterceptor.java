package com.luox2014.springAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Compare Interceptor  比较拦截
 * @author Administrator
 *
 *arg0 是测试方法里面的参数集合
 */
public class CompareInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		String customer_name = arg0.getArguments()[0].toString();
		if("张三".equals(customer_name)){
			/**
			 *  //如果顾客是张三时,执行目标方法,
			 */
			result = arg0.proceed();
			
		}else{
			System.out.println("该顾客是买书不给钱的    "+customer_name+"  不许入内！");
		}
		
		return result;
	}

}
