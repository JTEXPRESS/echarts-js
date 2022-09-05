package com.jnt.echarts.options.series.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Event implements Serializable {
    private List<Evolution> evolution;
    private String name;
    private Integer weight;

    public Event() {}

    public Event(String name) { this.name = name; }

    public Event(String name, Integer weight) {
        this.name   = name;
        this.weight = weight;
    }

    public List<Evolution> evolution() {
        if (this.evolution == null)  this.evolution = new ArrayList<>();
        return this.evolution;
    }

    public Event evolution(List<Evolution> evolution) {
        this.evolution = evolution;
        return this;
    }

    public Event evolution(Evolution... values) {
        if (values == null || values.length == 0) return this;
        this.evolution().addAll(Arrays.asList(values));
        return this;
    }

    public String name() { return this.name; }

    public Event name(String name) {
        this.name = name;
        return this;
    }

    public Integer weight() { return this.weight; }

    public Event weight(Integer weight) {
        this.weight = weight;
        return this;
    }
}
