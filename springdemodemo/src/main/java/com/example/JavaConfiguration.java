package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example","com.controller"})
public class JavaConfiguration { //Java Bean Configuration  file
    @Bean  
    public Employee employee(){ // Bean Definition
        return new Employee();
    }
    @Bean
    public Employee employee1(){// Bean Definition
        return new Employee();
    }
    @Bean
    public Student student(){// Bean Definition
        return new Student();
    }
}
