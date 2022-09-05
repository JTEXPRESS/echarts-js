package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.DataFilter;
import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.style.AreaStyle;
import com.jnt.echarts.options.style.LineStyle;

public class Line extends Series<Line> {
    private Object dataFilter;
    private AreaStyle areaStyle;
    private LineStyle lineStyle;
    private Boolean smooth;

    public Line() { this.type(SeriesType.line); }

    public Line(String name) {
        super(name);
        this.type(SeriesType.line);
    }

    public Object dataFilter() { return this.dataFilter; }

    public Line dataFilter(Object dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }

    public Line dataFilter(DataFilter dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }

    public AreaStyle areaStyle() {
        if (this.areaStyle == null) this.areaStyle = new AreaStyle();
        return this.areaStyle;
    }

    public Line areaStyle(AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
        return this;
    }

    public LineStyle lineStyle() {
        if (this.lineStyle == null) this.lineStyle = new LineStyle();
        return this.lineStyle;
    }


    public Line lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public Boolean smooth() { return this.smooth; }

    public Line smooth(Boolean smooth) {
        this.smooth = smooth;
        return this;
    }
}
