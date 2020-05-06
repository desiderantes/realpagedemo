package com.realpage.demo.model.tvmaze.show;


import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

public class Network extends RepresentationModel<Network> implements Serializable {
    private Country country;
    private int id;
    private String name;

}
