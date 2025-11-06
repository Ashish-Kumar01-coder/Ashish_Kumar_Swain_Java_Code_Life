package com.kodewala.practise.SchoolDetails;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String path ="com\\kodewala\\practise\\SchoolDetails\\resource\\applicationContext.xml";
        ClassPathXmlApplicationContext appc = new ClassPathXmlApplicationContext(path);
        SchoolDetails sc = (SchoolDetails) appc.getBean("sch");
        System.out.println(sc.getTeacherName() + " " + sc.getTeacherId() + " " + sc.getStudentName() + " " + sc.getStudenttId());
    }
}
