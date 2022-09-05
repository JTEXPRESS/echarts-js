package com.jnt.echarts.options.style;

import com.jnt.echarts.options.code.BrushType;

public class NodeStyle extends LinkStyle {
    private BrushType brushType;
    private String color;

    public BrushType brushType() { return this.brushType; }

    public NodeStyle brushType(BrushType brushType) {
        this.brushType = brushType;
        return this;
    }

    public String color() { return this.color; }

    public NodeStyle color(String color) {
        this.color = color;
        return this;
    }

    public BrushType getBrushType() { return brushType; }

    public void setBrushType(BrushType brushType) { this.brushType = brushType; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}
