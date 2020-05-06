package com.realpage.demo.model.tvmaze;

import com.realpage.demo.model.tvmaze.show.Network;
import com.realpage.demo.model.tvmaze.show.Rating;
import com.realpage.demo.model.tvmaze.show.Schedule;
import com.realpage.demo.model.tvmaze.show.WebChannel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Show extends RepresentationModel<Show> implements Serializable {
    protected List<CastMember> cast;
    protected Externals externals;
    protected List<String> genres;
    protected long id;
    protected Image image;
    protected String language;
    protected String name;
    protected Network network;
    protected LocalDate premiered;
    protected Rating rating;
    protected Integer runtime;
    protected Schedule schedule;
    protected String status;
    protected String summary;
    protected String type;
    protected Integer updated;
    protected String url;
    protected WebChannel webChannel;

}
