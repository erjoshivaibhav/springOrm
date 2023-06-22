package com.spring.orm.SpringOrm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.SpringOrm.entities.Student;

public class StudentDao {
	
	HibernateTemplate template;
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDao(HibernateTemplate template) {
		super();
		this.template = template;
	}

	@Transactional
	public int insert(Student student) {
		
		Integer i= (Integer)this.template.save(student);
		return i;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
