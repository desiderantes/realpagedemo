package com.realpage.demo.model.tvmaze;


import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@Data
public class CastMember extends RepresentationModel<CastMember> implements Serializable {
    protected Character character;
    protected Person person;
}
