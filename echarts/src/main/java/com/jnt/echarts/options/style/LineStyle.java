package com.jnt.echarts.options.style;

import com.jnt.echarts.options.code.LineType;
import com.jnt.echarts.options.style.itemstyle.Emphasis;
import com.jnt.echarts.options.style.itemstyle.Normal;

import java.io.Serializable;

public class LineStyle implements Serializable {
    private LineType type;
    private Object color;
    private Object color0;
    private Normal normal;
    private Emphasis emphasis;
    private String shadowColor;
    private Integer width;
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private Double opacity;

    public LineType type() { return this.type; }

    public LineStyle type(LineType type) {
        this.type = type;
        return this;
    }

    public Object color() { return this.color; }

    public LineStyle color(Object color) {
        this.color = color;
        return this;
    }

    public Object color0() { return this.color0; }

    public LineStyle color0(Object color0) {
        this.color0 = color0;
        return this;
    }

    public Normal normal() {
        if (this.normal == null) this.normal = new Normal();
        return this.normal;

    }

    public LineStyle normal(Normal normal) {
        this.normal = normal;
        return this;
    }

    public Emphasis emphasis() {
        if (this.emphasis == null) this.emphasis = new Emphasis();
        return this.emphasis;

    }

    public LineStyle emphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public String shadowColor() { return this.shadowColor; }

    public LineStyle shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Integer width() { return this.width; }

    public LineStyle width(Integer width) {
        this.width = width;
        return this;
    }

    public Integer shadowBlur() { return this.shadowBlur; }

    public LineStyle shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public Integer shadowOffsetX() { return this.shadowOffsetX; }

    public LineStyle shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public Integer shadowOffsetY() { return this.shadowOffsetY; }

    public LineStyle shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public Double opacity() { return this.opacity; }

    public LineStyle opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public LineType getType() { return type; }

    public void setType(LineType type) { this.type = type; }

    public Object getColor() { return color; }

    public void setColor(Object color) { this.color = color; }

    public Object getColor0() { return color0; }

    public void setColor0(Object color0) { this.color0 = color0; }

    public Normal getNormal() { return normal; }

    public void setNormal(Normal normal) { this.normal = normal; }

    public Emphasis getEmphasis() { return emphasis; }

    public void setEmphasis(Emphasis emphasis) { this.emphasis = emphasis; }

    public String getShadowColor() { return shadowColor; }

    public void setShadowColor(String shadowColor) { this.shadowColor = shadowColor; }

    public Integer getWidth() { return width; }

    public void setWidth(Integer width) { this.width = width; }

    public Integer getShadowBlur() { return shadowBlur; }

    public void setShadowBlur(Integer shadowBlur) { this.shadowBlur = shadowBlur; }

    public Integer getShadowOffsetX() { return shadowOffsetX; }

    public void setShadowOffsetX(Integer shadowOffsetX) { this.shadowOffsetX = shadowOffsetX; }

    public Integer getShadowOffsetY() { return shadowOffsetY; }

    public void setShadowOffsetY(Integer shadowOffsetY) { this.shadowOffsetY = shadowOffsetY; }
}
