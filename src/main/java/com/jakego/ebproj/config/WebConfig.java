package com.jakego.ebproj.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    // DTO <-> Entity를 위해
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }







}
