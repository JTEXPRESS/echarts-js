package com.jnt.echarts.options.data;

import java.io.Serializable;

public class MapData implements Serializable {
    private Object value;
    private String name;
    private Boolean selected;

    public MapData(String name, Object value) {
        this.name   = name;
        this.value  = value;
    }

    public MapData(String name, Object value, Boolean selected) {
        this.name       = name;
        this.value      = value;
        this.selected   = selected;
    }

    public Object value() { return this.value; }

    public MapData value(Object value) {
        this.value = value;
        return this;
    }

    public String name() { return this.name; }

    public MapData name(String name) {
        this.name = name;
        return this;
    }

    public Boolean selected() { return this.selected; }

    public MapData selected(Boolean selected) {
        this.selected = selected;
        return this;
    }
}
