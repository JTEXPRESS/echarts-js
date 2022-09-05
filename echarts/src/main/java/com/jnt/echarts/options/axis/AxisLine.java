package com.jnt.echarts.options.axis;

import com.jnt.echarts.options.style.LineStyle;

import java.io.Serializable;

public class AxisLine implements Serializable {
    private LineStyle lineStyle;
    private Boolean onZero;
    private Boolean show;

    public LineStyle lineStyle() {
        if (this.lineStyle == null) this.lineStyle = new LineStyle();
        return this.lineStyle;
    }

    public AxisLine lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public Boolean onZero() { return this.onZero; }

    public AxisLine onZero(Boolean onZero) {
        this.onZero = onZero;
        return this;
    }

    public Boolean show() { return this.show; }

    public AxisLine show(Boolean show) {
        this.show = show;
        return this;
    }
}
