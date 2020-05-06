package com.realpage.demo.model.tvmaze;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@Data
public class Crew extends RepresentationModel<Crew> implements Serializable {
    private String type;
    private Person person;
}
