package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.RoseType;
import com.jnt.echarts.options.code.SelectMode;
import com.jnt.echarts.options.code.SeriesType;

public class Pie extends Series<Pie> {
    private RoseType roseType;
    private Object radius;
    private Object selectMode;
    private Object[] center;
    private Integer startAngle;
    private Integer minAngle;
    private Integer selectedOffset;
    private Boolean clockWise;
    private Boolean avoidLabelOverlap;

    public Pie() { this.type(SeriesType.pie); }

    public Pie(String name) {
        super(name);
        this.type(SeriesType.pie);
    }

    public RoseType roseType() { return this.roseType; }

    public Pie roseType(RoseType roseType) {
        this.roseType = roseType;
        return this;
    }

    public Object radius() { return this.radius; }

    public Pie radius(Object radius) {
        this.radius = radius;
        return this;
    }

    public Pie radius(Object width, Object height) {
        radius = new Object[]{width, height};
        return this;
    }

    public Object selectMode() { return this.selectMode; }

    public Pie selectMode(boolean selectMode) {
        this.selectMode = selectMode;
        return this;
    }

    public Pie selectMode(SelectMode selectMode) {
        this.selectMode = selectMode;
        return this;
    }

    public Object[] center() { return this.center; }

    public Pie center(Object[] center) {
        this.center = center;
        return this;
    }

    public Pie center(Object width, Object height) {
        this.center = new Object[]{width, height};
        return this;
    }

    public Integer startAngle() { return this.startAngle; }

    public Pie startAngle(Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public Integer minAngle() { return this.minAngle; }

    public Pie minAngle(Integer minAngle) {
        this.minAngle = minAngle;
        return this;
    }

    public Integer selectedOffset() { return this.selectedOffset; }

    public Pie selectedOffset(Integer selectedOffset) {
        this.selectedOffset = selectedOffset;
        return this;
    }

    public Boolean clockWise() { return this.clockWise; }

    public Pie clockWise(Boolean clockWise) {
        this.clockWise = clockWise;
        return this;
    }

    public Boolean avoidLabelOverlap() { return this.avoidLabelOverlap; }

    public Pie avoidLabelOverlap(Boolean avoidLabelOverlap) {
        this.avoidLabelOverlap = avoidLabelOverlap;
        return this;
    }
}
