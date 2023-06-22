package com.spring.orm.SpringOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.SpringOrm.dao.StudentDao;
import com.spring.orm.SpringOrm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       StudentDao dao=context.getBean("studentDao",StudentDao.class);
       
       Student s1= new Student(123,"Vaibhav Joshi","Udaipur");
       dao.insert(s1);
    }
}
