package com.demo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest.model.Photos;
import com.demo.rest.service.PhotosService;

@RestController
public class PhotosController {
    @Autowired
    PhotosService photosService;
    @GetMapping("/")
    public List<Photos> getAllPhotos(){
      
        return  photosService.getAllPhotos();
    }

}
