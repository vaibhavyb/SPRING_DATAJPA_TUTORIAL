package com.jpademo.SPRINGDATAJPA.SPRING_DATAJPA_TUTORIAL.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpademo.SPRINGDATAJPA.SPRING_DATAJPA_TUTORIAL.model.Courses;

public interface CoursesRepository extends CrudRepository<Courses,Integer>{
	

}
