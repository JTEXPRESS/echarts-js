package com.jnt.echarts.options.style;

import java.io.Serializable;

public class AreaStyle implements Serializable {
    private Object type;
    private Object color;
    private Double opacity;

    public Object type() { return this.type; }

    public AreaStyle type(Object type) {
        this.type = type;
        return this;
    }

    public Object color() { return this.color; }

    public AreaStyle color(Object color) {
        this.color = color;
        return this;
    }

    public Object opacity() { return this.opacity; }

    public AreaStyle opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public AreaStyle typeDefault() {
        this.type = "default";
        return this;
    }

    public Object getType() { return type; }

    public void setType(Object type) { this.type = type; }

    public Object getColor() { return color; }

    public void setColor(Object color) { this.color = color; }

    public Double getOpacity() { return opacity; }

    public void setOpacity(Double opacity) { this.opacity = opacity; }
}
