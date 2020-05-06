package com.realpage.demo.model.tvmaze;

import lombok.Data;

import java.io.Serializable;

@Data
public class Character implements Serializable {
    private int id;
    private Image image;
    private String name;
    private String url;
}
