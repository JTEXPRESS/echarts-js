package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.SeriesType;

public class Scatter extends Series<Scatter> {
    private Long largeThreshold;
    private Boolean large;

    public Scatter() { this.type(SeriesType.scatter); }

    public Scatter(String name) {
        super(name);
        this.type(SeriesType.scatter);
    }

    public Long largeThreshold() { return this.largeThreshold; }

    public Scatter largeThreshold(Long largeThreshold) {
        this.largeThreshold = largeThreshold;
        return this;
    }

    public Boolean large() { return this.large; }

    public Scatter large(Boolean large) {
        this.large = large;
        return this;
    }
}
