package com.jnt.echarts.options.data;

import com.jnt.echarts.options.style.TextStyle;

import java.io.Serializable;

public class LegendData implements Serializable {
    private TextStyle textStyle;
    private String name;
    private String icon;

    public LegendData(String name) { this.name = name; }

    public LegendData(String name, TextStyle textStyle) {
        this.name       = name;
        this.textStyle  = textStyle;
    }

    public LegendData(String name, TextStyle textStyle, String icon) {
        this.name       = name;
        this.textStyle  = textStyle;
        this.icon       = icon;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public LegendData textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public String name() { return this.name; }

    public LegendData name(String name) {
        this.name = name;
        return this;
    }

    public String icon() { return this.icon; }

    public LegendData icon(String icon) {
        this.icon = icon;
        return this;
    }
}
