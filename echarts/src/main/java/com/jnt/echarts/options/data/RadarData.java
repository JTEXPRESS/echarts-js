package com.jnt.echarts.options.data;

import java.io.Serializable;

public class RadarData implements Serializable {
    private Object value;
    private String name;

    public RadarData(String name, Object value) {
        this.value  = value;
        this.name   = name;
    }

    public Object value() { return this.value; }

    public RadarData value(Object value) {
        this.value = value;
        return this;
    }
}
