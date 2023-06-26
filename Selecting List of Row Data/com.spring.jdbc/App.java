package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

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

        // select list of rows
        List<Student> allStudents = studentDao.getAllStudents();
        for(Student s:allStudents) {
        	System.out.println(s);
        }
    }
}
