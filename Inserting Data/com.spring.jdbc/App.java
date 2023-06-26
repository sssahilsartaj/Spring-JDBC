package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello! Program is started....." );
        
        // spring jdbc => JdbcTemplate object
        ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
              
        // insertion operation
        Student student = new Student();
        student.setId(104);
        student.setName("Md Imran");
        student.setCity("Bihar");
        
        
        int result =  studentDao.insert(student);
        System.out.println("Insertion added.." + result);
    }
}
