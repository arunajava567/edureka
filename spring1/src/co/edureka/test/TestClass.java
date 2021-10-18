package co.edureka.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import co.edureka.User;

public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=(User)context.getBean("user");		
		System.out.println( user.getCar().getName()+" "+user.getCar().getPerDayCost());
		
	}
	
}
