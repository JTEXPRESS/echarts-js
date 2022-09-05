package com.jnt.echarts.options.style;

import com.jnt.echarts.options.code.X;

public class GraphicStyle {
    private X textAlign;
    private Object width;
    private Object height;
    private String text;
    private String fill;

    public X textAlign() { return this.textAlign; }

    public GraphicStyle textAlign(X textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public Object width() { return this.width; }

    public GraphicStyle width(Object width) {
        this.width = width;
        return this;
    }

    public Object height() { return this.height; }

    public GraphicStyle height(Object height) {
        this.height = height;
        return this;
    }

    public String text() { return this.text; }

    public GraphicStyle text(String text) {
        this.text = text;
        return this;
    }

    public String fill() { return this.fill; }

    public GraphicStyle fill(String fill) {
        this.fill = fill;
        return this;
    }
}
