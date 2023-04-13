package com.devsuperior.adopetbackendapijava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository <Resource, Long> {

}
