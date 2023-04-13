package com.devsuperior.adopetbackendapijava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Course;
import com.devsuperior.dslearnbds.entities.Offer;

public interface OfferRepository extends JpaRepository <Offer, Long> {

}
