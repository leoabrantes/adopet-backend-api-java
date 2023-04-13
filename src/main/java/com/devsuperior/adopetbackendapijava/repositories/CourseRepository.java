package com.devsuperior.adopetbackendapijava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Course;

public interface CourseRepository extends JpaRepository <Course, Long> {

}
