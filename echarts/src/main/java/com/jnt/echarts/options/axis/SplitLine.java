package com.jnt.echarts.options.axis;

import com.jnt.echarts.options.style.LineStyle;

import java.io.Serializable;

public class SplitLine implements Serializable {
    private LineStyle lineStyle;
    private Boolean onGap;
    private Boolean show;

    public SplitLine lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public LineStyle lineStyle() {
        if (this.lineStyle == null) this.lineStyle = new LineStyle();
        return this.lineStyle;
    }

    public Boolean onGap() { return this.onGap; }

    public SplitLine onGap(Boolean onGap) {
        this.onGap = onGap;
        return this;
    }

    public Boolean show() { return this.show; }

    public SplitLine show(Boolean show) {
        this.show = show;
        return this;
    }
}
