package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.Symbol;

import java.io.Serializable;

public class Effect implements Serializable {
    private Type type;
    private Object symbol;
    private Object symbolSize;
    private String color;
    private String shadowColor;
    private Integer period;
    private Integer scaleSize;
    private Integer shadowBlur;
    private Integer bounceDistance;
    private Double trailLength;
    private Boolean loop;
    private Boolean show;

    public Type type() { return this.type; }

    public Effect type(Type type) {
        this.type = type;
        return this;
    }

    public Object symbol() { return this.symbol; }

    public Effect symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public Effect symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() { return this.symbolSize; }

    public Effect symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Effect symbolSize(Object[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Effect symbolSize(Object width, Object height) {
        this.symbolSize = new Object[]{width, height};
        return this;
    }

    public String color() { return this.color; }

    public Effect color(String color) {
        this.color = color;
        return this;
    }

    public String shadowColor() { return this.shadowColor; }

    public Effect shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Integer period() { return this.period; }

    public Effect period(Integer period) {
        this.period = period;
        return this;
    }

    public Integer scaleSize() { return this.scaleSize; }

    public Effect scaleSize(Integer scaleSize) {
        this.scaleSize = scaleSize;
        return this;
    }

    public Integer shadowBlur() { return this.shadowBlur; }

    public Effect shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public Integer bounceDistance() { return this.bounceDistance; }

    public Effect bounceDistance(Integer bounceDistance) {
        this.bounceDistance = bounceDistance;
        return this;
    }

    public Double trailLength() { return this.trailLength; }

    public Effect trailLength(Double trailLength) {
        this.trailLength = trailLength;
        return this;
    }

    public Boolean loop() { return this.loop; }

    public Effect loop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    public Boolean show() { return this.show; }

    public Effect show(Boolean show) {
        this.show = show;
        return this;
    }

    public enum Type {
        scale, bounce
    }
}
