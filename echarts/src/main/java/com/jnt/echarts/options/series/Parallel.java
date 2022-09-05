package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.SeriesType;

public class Parallel extends Series<Parallel> {
    private Integer parallelIndex;
    private Double inactiveOpacity;
    private Double activeOpacity;

    public Parallel() { this.type(SeriesType.parallel); }

    public Parallel(String name) {
        super(name);
        this.type(SeriesType.parallel);
    }

    public Integer parallelIndex() { return this.parallelIndex; }

    public Parallel parallelIndex(Integer parallelIndex) {
        this.parallelIndex = parallelIndex;
        return this;
    }

    public Double inactiveOpacity() { return this.inactiveOpacity; }

    public Parallel inactiveOpacity(Double inactiveOpacity) {
        this.inactiveOpacity = inactiveOpacity;
        return this;
    }

    public Double activeOpacity() { return this.activeOpacity; }

    public Parallel activeOpacity(Double activeOpacity) {
        this.activeOpacity = activeOpacity;
        return this;
    }
}
