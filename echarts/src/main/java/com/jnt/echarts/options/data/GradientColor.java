package com.jnt.echarts.options.data;

public class GradientColor {
    private Object color;
    private Double offset;

    public GradientColor(Double offset, Object color) {
        this.offset = offset;
        this.color  = color;
    }

    public Object color() { return this.color; }

    public GradientColor color(Object color) {
        this.color = color;
        return this;
    }

    public Double offset() { return this.offset; }

    public GradientColor offset(Double offset) {
        this.offset = offset;
        return this;
    }
}
