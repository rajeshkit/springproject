package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Course;
import com.example.Employee;
import com.example.Student;

@Component
public class Department {
    @Autowired
    Course course;  
    @Autowired
    Student student;
    @Autowired
    Employee employee;
    public void show(){
        course.display();
        student.display();
        employee.display();
    }

}
