package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        ApplicationContext context =  new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        
//           insertion
//        Student student = new Student();
//        student.setId(104);
//        student.setName("Md Imran");
//        student.setCity("Bihar");
//        
//        
//        int result =  studentDao.insert(student);
//        System.out.println("Insertion added.." + result);
        
//           updation
//        Student student = new Student();
//        student.setCity("Mujjafarpur");
//        student.setName("Imran");
//        student.setId(104);
//        
//        int update = studentDao.update(student);
//        System.out.println("Data Updated.." + update);
        
//           deletion
//        int delete = studentDao.delete(104);
//        System.out.println("Data Deleted..."+delete);
        
//        //   Select on row
//        Student student = studentDao.getStudent(102);
//        System.out.println(student);
          
          // select list of rows
        List<Student> allStudents = studentDao.getAllStudents();
        for(Student s:allStudents) {
        	System.out.println(s);
        }
    }
}
