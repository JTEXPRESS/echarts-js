package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.SeriesType;

public class RadarSeries extends Series<RadarSeries> {
    public RadarSeries() { this.type(SeriesType.radar); }

    public RadarSeries(String name) {
        super(name);
        this.type(SeriesType.radar);
    }
}
