package com.devsuperior.adopetbackendapijava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository <Topic, Long> {

}
