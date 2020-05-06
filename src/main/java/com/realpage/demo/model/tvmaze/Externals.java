package com.realpage.demo.model.tvmaze;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@Data
public class Externals extends RepresentationModel<Externals> implements Serializable {
    private int tvrage;
    private int thetvdb;
    private String imdb;
}
