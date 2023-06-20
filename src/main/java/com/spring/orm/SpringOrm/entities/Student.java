package com.spring.orm.SpringOrm.entities;

import javax.persistence.*;

import org.hibernate.annotations.Entity;


@Entity
@Table(name = "student_table")
public class Student {
	
	@Id
	@Column(name = "studentId")
	private int studentId;
	
	@Column(name = "studentName")
	private String studentName;
	
	@Column(name = "studentCity")
	private String studentCity;
	

}
