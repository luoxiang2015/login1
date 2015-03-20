package com.luox2014.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/bean.xml");
BuyBook1 b = (BuyBook1) ctx.getBean("newBuyBook");
b.BuyBook("张三", "java");
	}

}
