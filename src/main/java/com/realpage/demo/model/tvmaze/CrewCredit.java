package com.realpage.demo.model.tvmaze;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@Data
public class CrewCredit extends RepresentationModel<CrewCredit> implements Serializable {
    private String type;
}
