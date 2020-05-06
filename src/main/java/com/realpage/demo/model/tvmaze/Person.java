package com.realpage.demo.model.tvmaze;

import com.realpage.demo.model.tvmaze.show.Country;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Person extends RepresentationModel<Person> implements Serializable {
    private int id;
    private Image image;
    private String name;
    private String url;
    private Country country;
    private LocalDate birthday;
    private LocalDate deathday;
    private String gender;

}
