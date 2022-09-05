package com.jnt.echarts.options.style;

import java.io.Serializable;

public class ShadowStyle implements Serializable {
    private Object width;
    private String type;
    private String color;

    public Object width() { return this.width; }

    public ShadowStyle width(Object width) {
        this.width = width;
        return this;
    }

    public String type() { return this.type; }

    public ShadowStyle type(String type) {
        this.type = type;
        return this;
    }

    public String color() { return this.color; }

    public ShadowStyle color(String color) {
        this.color = color;
        return this;
    }

    public ShadowStyle typeDefault() {
        this.type = "default";
        return this;
    }

    public Object getWidth() { return width; }

    public void setWidth(Object width) { this.width = width; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}
