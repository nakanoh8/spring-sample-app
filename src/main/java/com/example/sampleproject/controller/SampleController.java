package com.example.sampleproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.sampleproject.model.Weather;
import com.example.sampleproject.service.WeatherService;

@Controller
public class SampleController {
    // @RequestMapping("/sample")
    // public String sample() {
    //     return "sample";
    // }
    // @RequestMapping("/sample_2")
    // public String sample_2() {
    //     return "sample_2";
    // }
    @Autowired
    WeatherService weatherService;
    
    @RequestMapping("/sample_sample")
    public String sample(Model model) {
    
    model.addAttribute("sample", "Hello World!"); // Hello World!の表示
    
    // 気象データの取得
    List<Weather> weatherDataList = weatherService.findAllWeatherData();
    model.addAttribute("weatherDataList", weatherDataList);
    
    return "sample";
  }

}