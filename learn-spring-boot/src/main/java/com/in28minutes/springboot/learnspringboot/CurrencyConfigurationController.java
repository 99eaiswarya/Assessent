package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


// /Courses
//course:id,name,author
@RestController
public class CurrencyConfigurationController {
    @Autowired
    private CurrencyServiceConfiguration configuration;
    @RequestMapping("/currency-configuration")
    public  CurrencyServiceConfiguration retrieveAllCourses(){
        return configuration;
    }

}