package com.tcs.SpringCoreApp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     //  Loan l=new Loan(101,"ICICI",70890.00);  //DI
      // System.out.println(l.getLoanId()+"  "+l.getName()+"  "+l.getAmount());
       
       //IOc -old 
   // BeanFactory factory=new XMLBeanFactory(new FileSystemResource("E:\edureka\SpringCoreApp1\src\main\resources\applicationContext.xml"));
    	
    	//IOC  - read meta data of POJO/ beans 
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       
    	Loan l1=(Loan) context.getBean("l");   // dependency injection  - setter injection
    	System.out.println(l1.getLoanId()+"  "+l1.getName()+"  "+l1.getAmount()+l1.getCustomer().id +"  "+l1.getCustomer().name );
    	
    	Loan l2=(Loan) context.getBean("l");   // dependency injection  - setter injection
    	System.out.println(l1.getLoanId()+"  "+l1.getName()+"  "+l1.getAmount());
    	
    	System.out.println(l1.hashCode()+"  "+l2.hashCode());
    	
    	Account a1=(Account) context.getBean("ap");  //dependency injection - construtcor injection
       System.out.println(a1.accno+"  "+a1.branch);
       context.close();
       
    }
}
