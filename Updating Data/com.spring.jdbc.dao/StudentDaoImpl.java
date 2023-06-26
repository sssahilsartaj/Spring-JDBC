package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
  
  @Override
	public int update(Student student) {
		// update query
		String query = "update student set name=?, city=? where id=?";
		int update = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return update;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
