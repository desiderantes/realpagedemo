package com.realpage.demo.model.tvmaze;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

@Data
public class Episode extends RepresentationModel<Episode> implements Serializable {
    private OffsetDateTime airstamp;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate airdate;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime airtime;
    private int id;
    private Image image;
    private String name;
    private Integer number;
    private Integer runtime;
    private Integer season;
    private String url;
    private String summary;

}
