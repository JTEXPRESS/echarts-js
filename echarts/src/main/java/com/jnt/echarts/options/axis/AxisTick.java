package com.jnt.echarts.options.axis;

import com.jnt.echarts.options.style.LineStyle;

import java.io.Serializable;

public class AxisTick implements Serializable {
    private Object interval;
    private LineStyle lineStyle;
    private Integer length;
    private Integer splitNumber;
    private Boolean onGap;
    private Boolean inside;
    private Boolean alignWithLabel;
    private Boolean show;

    public Object interval() { return this.interval; }

    public AxisTick interval(Object interval) {
        this.interval = interval;
        return this;
    }

    public LineStyle lineStyle() {
        if (this.lineStyle == null) this.lineStyle = new LineStyle();
        return this.lineStyle;
    }

    public AxisTick lineStyle(LineStyle style) {
        this.lineStyle = style;
        return this;
    }

    public Integer length() { return this.length; }

    public AxisTick length(Integer length) {
        this.length = length;
        return this;
    }

    public Integer splitNumber() { return this.splitNumber; }

    public AxisTick splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public Boolean onGap() {return this.onGap; }

    public AxisTick onGap(Boolean onGap) {
        this.onGap = onGap;
        return this;
    }

    public Boolean inside() {return this.inside; }

    public AxisTick inside(Boolean inside) {
        this.inside = inside;
        return this;
    }

    public Boolean alignWithLabel() { return this.alignWithLabel; }

    public AxisTick alignWithLabel(Boolean alignWithLabel){
    	this.alignWithLabel=alignWithLabel;
    	return this;
    }

    public Boolean show() { return this.show; }

    public AxisTick show(Boolean show) {
        this.show = show;
        return this;
    }
}
