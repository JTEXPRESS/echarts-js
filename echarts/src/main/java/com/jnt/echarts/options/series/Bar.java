package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.SeriesType;

public class Bar extends Series<Bar> {
    private Object barWidth;
    private String barGap;
    private String barCategoryGap;
    private Integer barMinHeight;
    private Integer barMaxWidth;

    public Bar() { this.type(SeriesType.bar); }

    public Bar(String name) {
        super(name);
        this.type(SeriesType.bar);
    }

    public Object barWidth() { return this.barWidth; }

    public Bar barWidth(Object barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    public String barGap() { return this.barGap; }

    public Bar barGap(String barGap) {
        this.barGap = barGap;
        return this;
    }

    public String barCategoryGap() { return this.barCategoryGap; }

    public Bar barCategoryGap(String barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
        return this;
    }

    public Integer barMinHeight() { return this.barMinHeight; }

    public Bar barMinHeight(Integer barMinHeight) {
        this.barMinHeight = barMinHeight;
        return this;
    }

    public Integer barMaxWidth() { return this.barMaxWidth; }

    public Bar barMaxWidth(Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }
}
