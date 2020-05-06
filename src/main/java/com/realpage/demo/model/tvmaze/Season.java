package com.realpage.demo.model.tvmaze;

import com.realpage.demo.model.tvmaze.show.Network;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Season extends RepresentationModel<Season> implements Serializable {
    private int id;
    private String url;
    private int number;
    private String name;
    private int episodeOrder;
    private LocalDate premiereDate;
    private LocalDate endDate;
    private Network network;
    private String webChannel;
    private Image image;
    private String summary;
}