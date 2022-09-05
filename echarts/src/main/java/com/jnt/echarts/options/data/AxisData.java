package com.jnt.echarts.options.data;

import com.jnt.echarts.options.style.TextStyle;

import java.io.Serializable;

public class AxisData implements Serializable {
    private Object value;
    private TextStyle textStyle;

    public AxisData(Object value) { this.value = value; }

    public AxisData(Object value, TextStyle textStyle) {
        this.value      = value;
        this.textStyle  = textStyle;
    }

    public Object value() { return this.value; }

    public AxisData value(Object value) {
        this.value = value;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public AxisData textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
}
