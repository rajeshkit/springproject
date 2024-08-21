package com.demo.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.rest.model.Photos;
@Service
public class PhotosService {
    @Autowired
    RestTemplate restTemplate;
    
    public List<Photos> getAllPhotos(){
       
      List<Photos> photos=restTemplate.getForObject(
            "https://jsonplaceholder.typicode.com/photos",List.class);
        
        return photos;
    }

}
