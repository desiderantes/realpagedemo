package com.realpage.demo.model.tvmaze;


import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@Data
public class Image extends RepresentationModel<Image> implements Serializable {
    private String medium;
    private String original;
}
