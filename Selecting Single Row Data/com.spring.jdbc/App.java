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

        // Select single row
        Student student = studentDao.getStudent(101);
        System.out.println(student);
    }
}
