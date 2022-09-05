package com.jnt.echarts.options.data;

import java.io.Serializable;

public class PieData implements Serializable {
    private Object value;
    private String name;

    public PieData(String name, Object value) {
        this.value  = value;
        this.name   = name;
    }

    public Object value() { return this.value; }

    public PieData value(Object value) {
        this.value = value;
        return this;
    }

    public String name() { return this.name; }

    public PieData name(String name) {
        this.name = name;
        return this;
    }
}
