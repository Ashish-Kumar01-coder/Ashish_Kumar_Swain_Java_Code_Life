package com.kodewala.practise.Bank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String path = "com\\kodewala\\practise\\Bank\\resources\\applicationContext.xml";
        ClassPathXmlApplicationContext with = new ClassPathXmlApplicationContext(path);
        Withdraw w = (Withdraw) with.getBean("withdraw");
        System.out.println("Current amount : " + w.getCurrentAmount());
        System.out.println("Withdraw Amount : " + w.getWithDrawAmount());
        System.out.println("Rest amount : " + w.withdrawAmount1());
    }
}
