package com.spring.orm.SpringOrm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.SpringOrm.entities.Student;

public class StudentDao {
	
	HibernateTemplate template;
	
	public int insert(Student student) {
		
		Integer i= (Integer)this.template.save(student);
		return i;
	}

}
