package com.example.sampleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.sampleproject.model.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer> {}