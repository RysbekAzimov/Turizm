package com.example.Turizm.repository;

import com.example.Turizm.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TourRepository extends JpaRepository<Tour,Long> {

    List<Tour> findByLocationAndNameAndCostBetween(String location, String name, Long costFrom, Long costTo);

    List<Tour> findByLocationAndName(String location, String name);

    List<Tour> findByCostBetween(Long costFrom, Long costTo);
}
