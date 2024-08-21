package com.example;

import org.springframework.stereotype.Component;

@Component
public class Course {
    int courseId=122;
    String courseName="Spring Framework";
    public void display(){
        System.out.println(courseId+" "+courseName);
        
    }

}
