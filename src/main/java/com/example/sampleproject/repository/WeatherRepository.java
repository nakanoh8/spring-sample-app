package com.example.sampleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.sampleproject.model.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer> {
    
    List<Weather> findByName(String name);
}