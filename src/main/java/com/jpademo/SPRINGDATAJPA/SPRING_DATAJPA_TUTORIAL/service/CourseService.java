package com.jpademo.SPRINGDATAJPA.SPRING_DATAJPA_TUTORIAL.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpademo.SPRINGDATAJPA.SPRING_DATAJPA_TUTORIAL.model.Courses;
import com.jpademo.SPRINGDATAJPA.SPRING_DATAJPA_TUTORIAL.repository.CoursesRepository;


@Service
public class CourseService {
	
	@Autowired
	CoursesRepository courseRepository;
	public List<Courses> getlist() {
		List<Courses> courses=new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}

	public Object getcourse_fromlist(int id) {
		return courseRepository.findById(id);

	}

	public void addcourse(Courses course) {
		courseRepository.save(course);
	}

	public void updatecourse(int id, Courses course) {
		courseRepository.save(course);

	}

	public void deletecourse(int id) {
		courseRepository.deleteById(id);

	}

}
