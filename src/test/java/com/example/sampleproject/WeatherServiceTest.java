package com.example.sampleproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.sampleproject.service.WeatherService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherServiceTest {

    private WeatherService weatherService;

    @BeforeEach
    public void setUp(){
        weatherService = new WeatherService();
    }

    @Test
    public void greeting_レコードを全件取得する(){
    }

    @Test
    public void greeting_あいさつがないとき() {
        assertEquals("Say something...", weatherService.greeting(null));
    }

    @Test
    public void greeting_あいさつがあるとき() {
        assertEquals("hello", weatherService.greeting("something"));
    }

}