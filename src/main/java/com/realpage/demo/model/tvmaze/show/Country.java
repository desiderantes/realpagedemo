package com.realpage.demo.model.tvmaze.show;

import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

public class Country extends RepresentationModel<Country> implements Serializable {
    private String code;
    private String name;
    private String timezone;

}
