package com.kodewala.practise.Spring_core_xml_context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String path ="com\\kodewala\\practise\\Spring_core_xml_context\\resources\\applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
     // accessing the bean from the ioc container.
     		Account account = (Account) applicationContext.getBean("acc");
     		System.out.println(account.getAccountNumber() + " " + account.getType() + " " + account.getIfsc());
       
    }
}
