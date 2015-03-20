package com.luox2014.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ClientTest {
public final static String CHINESE = "Chinese";
public final static String AMERICAN = "American";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Human human = null;
human = new Factory().getHuman("CHINESE");
human.eat();
human.walk();
human = new Factory().getHuman("AMERICAN");
human.eat();
human.walk();*/
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/bean.xml");
		Human human = null;
		human = (Human) ctx.getBean("Chinese");
		human.eat();
		human.walk();
	}

}
