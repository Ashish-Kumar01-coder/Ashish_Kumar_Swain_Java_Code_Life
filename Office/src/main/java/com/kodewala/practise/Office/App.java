package com.kodewala.practise.Office;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String path = "com\\kodewala\\practise\\Office\\resource\\applicationContext.xml";
        ClassPathXmlApplicationContext appc = new ClassPathXmlApplicationContext(path);
        Employee emp = (Employee) appc.getBean("employee");
        System.out.println(emp.getManagerName() + " " + emp.getManagerSalary() + " " + emp.getCompanyName() + " " + emp.getCompanyNeytWorth() );
    }
}
