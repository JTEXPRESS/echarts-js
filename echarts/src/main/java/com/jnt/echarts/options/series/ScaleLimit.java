package com.jnt.echarts.options.series;

import java.io.Serializable;

public class ScaleLimit implements Serializable {
    private Double min;
    private Double max;

    public ScaleLimit() {}

    public ScaleLimit(Double min, Double max) {
        this.min = min;
        this.max = max;
    }

    public Double min() { return this.min; }

    public ScaleLimit min(Double min) {
        this.min = min;
        return this;
    }

    public Double max() { return this.max; }

    public ScaleLimit max(Double max) {
        this.max = max;
        return this;
    }
}
