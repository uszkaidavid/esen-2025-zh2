package com.esen.cardealership.data;

import com.esen.cardealership.model.Car;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Egészítsd ki a hiányzó kódrészletekkel!
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class DataLoader {

    @Value("classpath:data/cars.json")
    private Resource carsResource;

    @PostConstruct
    public void loadData() {
        var objectMapper = new ObjectMapper();
        var carsType = new TypeReference<List<Car>>(){};

        try {
            var carsJson = StreamUtils.copyToString(carsResource.getInputStream(), StandardCharsets.UTF_8);
            var cars = objectMapper.readValue(carsJson, carsType);

            log.info("Loaded car entities into the database");

        } catch (IOException e) {
            log.error("Cannot load car data into database", e);
        }
    }
}
