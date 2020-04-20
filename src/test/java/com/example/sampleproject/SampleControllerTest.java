package com.example.sampleproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.example.sampleproject.controller.SampleController;
import com.example.sampleproject.model.Weather;
import com.example.sampleproject.repository.WeatherRepository;
import com.example.sampleproject.service.WeatherService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SampleControllerTest {

    private static String GREET = "hoge";

    @Mock
    private WeatherRepository weatherRepository;
    @Mock
    private WeatherService weatherService;
    @InjectMocks
    private SampleController sampleController;
    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void 順番の担保() {
        Weather weather = new Weather();
        // weather.setId(1);
        // weather.setLocation_id(1);
        // weather.setName("東京");
        // weather.setTemperature(15);
        // weather.setHumidity(55);
        // weather.setDate_time(2019/04/10 00:00:00);

        when(weatherRepository.findById(anyObject())).thenReturn(Optional.ofNullable(weather));
        when(weatherService.greeting(anyObject())).thenReturn("hello");
    }

}