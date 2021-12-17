 package com.jpademo.SPRINGDATAJPA.SPRING_DATAJPA_TUTORIAL.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	
	@Id
	int id;
	String course_name;
	String author;
	public Courses() {
		super();
	}

	public Courses(int id, String course_name, String author) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.author = author;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", course_name=" + course_name + ", author=" + author + "]";
	}

}
