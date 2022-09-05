package com.jnt.echarts.options.data;

import java.io.Serializable;

public class RangeData implements Serializable {
    private Object color;
    private String label;
    private Integer start;
    private Integer end;

    public RangeData() {}

    public RangeData(Integer start, Integer end) {
        this.start  = start;
        this.end    = end;
    }

    public Object color() { return this.color; }

    public RangeData color(Object color) {
        this.color = color;
        return this;
    }

    public String label() { return this.label; }

    public RangeData label(String label) {
        this.label = label;
        return this;
    }

    public Integer start() { return this.start; }

    public RangeData start(Integer start) {
        this.start = start;
        return this;
    }

    public Integer end() { return this.end; }

    public RangeData end(Integer end) {
        this.end = end;
        return this;
    }
}
