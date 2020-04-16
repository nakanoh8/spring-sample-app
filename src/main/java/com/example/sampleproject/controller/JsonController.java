package com.example.sampleproject.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sampleproject.model.Weather;
import com.example.sampleproject.service.WeatherService;

@Controller
@ResponseBody // ←ポイントです！！
public class JsonController {
    @Autowired
    WeatherService weatherService;

    /**
	 * Weather情報json返却
	 */
	@RequestMapping(value = "/GetWeather", method = { RequestMethod.GET})
	// public ResponseEntity<List<Weather>> Index(@RequestParam("Key") Optional<String> key){ // ←ポイントです
    public ResponseEntity<List<Weather>> Index(){
		// Hogeテーブルのデータ取得
		List<Weather> weatherDataList = null;
		// if(key.isPresent()) {
		// 	weatherDataList = weatherService.findAllWeatherData();
        // }
        weatherDataList = weatherService.findAllWeatherData();
 
		return ResponseEntity.ok(weatherDataList);// ←ポイントです！！
	}

}