package com.jnt.echarts.options.series.other;

import com.jnt.echarts.options.code.BrushType;

import java.io.Serializable;

public class RippleEffect implements Serializable {
    private BrushType brushType;
    private Integer period;
    private Double scale;

    public BrushType brushType() { return this.brushType; }

    public RippleEffect brushType(BrushType brushType) {
        this.brushType = brushType;
        return this;
    }

    public Integer period() { return this.period; }

    public RippleEffect period(Integer period) {
        this.period = period;
        return this;
    }

    public Double scale() { return this.scale; }

    public RippleEffect scale(Double scale) {
        this.scale = scale;
        return this;
    }

    public BrushType getBrushType() { return brushType; }

    public void setBrushType(BrushType brushType) { this.brushType = brushType; }

    public Integer getPeriod() { return period; }

    public void setPeriod(Integer period) { this.period = period; }

    public Double getScale() { return scale; }

    public void setScale(Double scale) { this.scale = scale; }
}
