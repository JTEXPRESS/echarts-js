package com.jnt.echarts.options;

import com.jnt.echarts.options.style.LineStyle;

import java.io.Serializable;

public class LabelLine implements Serializable {
    private LineStyle lineStyle;
    private Integer length;
    private Boolean show;

    public LineStyle lineStyle() {
        if (this.lineStyle == null) this.lineStyle = new LineStyle();
        return this.lineStyle;
    }

    public LabelLine lineStyle(LineStyle style) {
        this.lineStyle = style;
        return this;
    }

    public Integer length() { return this.length; }

    public LabelLine length(Integer length) {
        this.length = length;
        return this;
    }

    public Boolean show() { return this.show; }

    public LabelLine show(Boolean show) {
        this.show = show;
        return this;
    }
}
