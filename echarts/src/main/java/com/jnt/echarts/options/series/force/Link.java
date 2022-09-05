package com.jnt.echarts.options.series.force;

import com.jnt.echarts.options.style.ItemStyle;
import com.jnt.echarts.options.style.LineStyle;

import java.io.Serializable;

public class Link implements Serializable {
    private Object source;
    private Object target;
    private ItemStyle itemStyle;
    private LineStyle lineStyle;
    private Integer weight;

    public Link() {}

    public Link(Object source, Object target, Integer weight) {
        this.source = source;
        this.target = target;
        this.weight = weight;
    }

    public Object source() { return this.source; }

    public Link source(Object source) {
        this.source = source;
        return this;
    }

    public Object target() { return this.target; }

    public Link target(Object target) {
        this.target = target;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public Link lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public LineStyle lineStyle() {
        if (lineStyle == null) this.lineStyle = new LineStyle();
        return this.lineStyle;
    }

    public Integer weight() { return this.weight; }

    public Link weight(Integer weight) {
        this.weight = weight;
        return this;
    }
}
