package com.w2m.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.w2m.model.entity.Ship;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Integer> {

}