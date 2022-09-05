package com.jnt.echarts.options.series.gauge;

import java.io.Serializable;

public class Pointer implements Serializable {
    private Object length;
    private Object width;
    private String color;

    public Object length() { return this.length; }

    public Pointer length(Object length) {
        this.length = length;
        return this;
    }

    public Object width() { return this.width; }

    public Pointer width(Object width) {
        this.width = width;
        return this;
    }

    public String color() { return this.color; }

    public Pointer color(String color) {
        this.color = color;
        return this;
    }

    public Object getLength() { return length; }

    public void setLength(Object length) { this.length = length; }

    public Object getWidth() { return width; }

    public void setWidth(Object width) { this.width = width; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}
