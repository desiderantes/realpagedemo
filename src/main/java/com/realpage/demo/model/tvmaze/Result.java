package com.realpage.demo.model.tvmaze;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private Double score;
    private T show;
}
