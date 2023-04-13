package com.devsuperior.adopetbackendapijava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Course;
import com.devsuperior.dslearnbds.entities.Lesson;

public interface LessonRepository extends JpaRepository <Lesson, Long> {

}
