package com.luox2014.util;

import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.luox2014.bean.User;

/**
 * 编写工具类ExoprtDB.java,将hbm生成ddl
 * 到这里就可以生成User表了，但是如果直接运行ExoprtDB.java文件是不能生成User表的。
 * 因为在mysql数据中还没有建立数据库Hibernate-first。
 * 所以在mysql控制台中通过create database hibernate-first; 
 * use hibernate-first;之后再执行ExoprtDB.java文件就可以生成表了。
 * @author Administrator
 *
 */
public class ExoprtDB {
public  void test1() {
	//默认读取 hibernate.cfg.xml
	Configuration cfr = new Configuration().configure();
	SchemaExport export = new SchemaExport(cfr);
	export.create(true, true);
}
public void addHibernate(){
	//读取配置文件
	Configuration cfr = new Configuration().configure();
	SessionFactory factory = cfr.buildSessionFactory();
	Session session  = null;
	
	try {
		session = factory.openSession();
		//开启事务
		session.beginTransaction();
		User user = new User();
		user.setUser_id(UUID.randomUUID().toString());
		user.setUser_account("zhangsan");
		user.setUser_password("123456");
		session.save(user);
		//提交事务
		session.getTransaction().commit();
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//事务回滚
		session.getTransaction().rollback();
	}finally{
		//关闭session
		if(session != null){
			if(session.isOpen()){
				session.close();		
			}
		}
	}
	
	/**
	 * 通过上面的代码我们可以看出，在代码中没有涉及到任何有关JDBC的代码，
	 * 作为开发人员只需要写好相应的实体类，然后通过配置就可以实现了表的建立以及向表中实现数据的插入。
在代码中有许多Hibernate的核心对象，例如Configuration、SessionFactory、Session等等
	 */
	
	
	
}
	//查询
public void query(){
	Configuration cfr = new Configuration().configure();
	SessionFactory factory = cfr.buildSessionFactory();
	Session session = null;
	session = factory.openSession();
    Query q = session.createSQLQuery("select * from t_user").addEntity(User.class);	
	User user1  = (User) q.list().get(0);
	System.out.println(user1.getUser_account());
	session.close();
}
	//删除
   public void delete(){

		Configuration cfr  = new Configuration().configure();
		   SessionFactory factory  = cfr.buildSessionFactory();
		   Session session = null;
	   try {
		   session = factory.openSession();     
		   session.beginTransaction();
		   Query q =session.createSQLQuery("select * from t_user where t_user.user_id=1").addEntity(User.class);
		   session.delete(q.list().get(0));
		   session.getTransaction().commit();
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		session.getTransaction().rollback();
	}  finally{
		session.close();
	}
   }
   //修改
   public void update(){
	   Configuration cfr = new Configuration().configure();
	   SessionFactory factory = cfr.buildSessionFactory();
	   Session session = null;
	   try {
		session= factory.openSession();
		   session.beginTransaction();
		   User user = new User();
		   user.setUser_id("2");
		   user.setUser_account("wanger");
		   user.setUser_password("456123");
		   session.update(user);
		   session.getTransaction().commit();
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		session.getTransaction().rollback();
	}finally{
		session.close();
	}
	   
   }
}
