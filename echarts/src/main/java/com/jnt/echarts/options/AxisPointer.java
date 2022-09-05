package com.jnt.echarts.options;

import com.jnt.echarts.options.code.PointerType;
import com.jnt.echarts.options.style.CrossStyle;
import com.jnt.echarts.options.style.LineStyle;
import com.jnt.echarts.options.style.ShadowStyle;
import com.jnt.echarts.options.style.TextStyle;

import java.io.Serializable;

public class AxisPointer implements Serializable {
    private PointerType type;
    private LineStyle lineStyle;
    private CrossStyle crossStyle;
    private ShadowStyle shadowStyle;
    private TextStyle textStyle;
    private Boolean show;

    public PointerType type() { return this.type; }

    public AxisPointer type(PointerType type) {
        this.type = type;
        return this;
    }

    public LineStyle lineStyle() {
        if (this.lineStyle == null)  this.lineStyle = new LineStyle();
        return this.lineStyle;
    }

    public AxisPointer lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public CrossStyle crossStyle() {
        if (this.crossStyle == null)  this.crossStyle = new CrossStyle();
        return this.crossStyle;
    }

    public AxisPointer crossStyle(CrossStyle crossStyle) {
        this.crossStyle = crossStyle;
        return this;
    }

    public ShadowStyle shadowStyle() {
        if (this.shadowStyle == null) this.shadowStyle = new ShadowStyle();
        return this.shadowStyle;
    }

    public AxisPointer shadowStyle(ShadowStyle shadowStyle) {
        this.shadowStyle = shadowStyle;
        return this;
    }

    public TextStyle textStyle() { return this.textStyle; }

    public AxisPointer textStyle(TextStyle textStyle) {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        this.textStyle = textStyle;
        return this;
    }

    public Boolean show(){ return this.show; }

    public AxisPointer show(Boolean show){
        this.show = show;
        return this;
    }
}
