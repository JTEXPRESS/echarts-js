package com.jnt.echarts.options.axis;

import com.jnt.echarts.options.code.AxisType;

public class LogAxis extends Axis<LogAxis> {
    private Integer logLabelBase;
    private Boolean logPositive;

    public LogAxis() { this.type(AxisType.log); }

    public Integer logLabelBase() { return this.logLabelBase; }

    public LogAxis logLabelBase(Integer logLabelBase) {
        this.logLabelBase = logLabelBase;
        return this;
    }

    public Boolean logPositive() { return this.logPositive; }

    public LogAxis logPositive(Boolean logPositive) {
        this.logPositive = logPositive;
        return this;
    }
}
