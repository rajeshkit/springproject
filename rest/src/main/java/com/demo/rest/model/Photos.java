package com.demo.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photos {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;

}
