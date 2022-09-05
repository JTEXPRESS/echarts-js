package com.jnt.echarts.options.series;

import com.jnt.echarts.options.Label;
import com.jnt.echarts.options.Title;
import com.jnt.echarts.options.axis.AxisLine;
import com.jnt.echarts.options.axis.AxisTick;
import com.jnt.echarts.options.axis.SplitLine;
import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.series.gauge.Detail;
import com.jnt.echarts.options.series.gauge.Pointer;

public class Gauge extends Series<Gauge> {
    private Object radius;
    private Object[] center;
    private AxisLine axisLine;
    private AxisTick axisTick;
    private Label axisLabel;
    private SplitLine splitLine;
    private Pointer pointer;
    private Title title;
    private Detail detail;
    private Integer min;
    private Integer max;
    private Integer startAngle;
    private Integer endAngle;
    private Integer splitNumber;

    public Gauge() { this.type(SeriesType.gauge); }

    public Gauge(String name) {
        super(name);
        this.type(SeriesType.gauge);
    }

    public Object radius() { return this.radius; }

    public Gauge radius(Object radius) {
        this.radius = radius;
        return this;
    }

    public Gauge radius(Object width, Object height) {
        radius = new Object[]{width, height};
        return this;
    }

    public Object[] center() { return this.center; }

    public Gauge center(Object[] center) {
        this.center = center;
        return this;
    }

    public Gauge center(Object width, Object height) {
        this.center = new Object[]{width, height};
        return this;
    }

    public AxisLine axisLine() {
        if (this.axisLine == null) this.axisLine = new AxisLine();
        return this.axisLine;
    }

    public Gauge axisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
        return this;
    }

    public AxisTick axisTick() {
        if (this.axisTick == null) this.axisTick = new AxisTick();
        return this.axisTick;
    }

    public Gauge axisTick(AxisTick axisTick) {
        this.axisTick = axisTick;
        return this;
    }

    public Label axisLabel() {
        if (this.axisLabel == null) this.axisLabel = new Label();
        return this.axisLabel;
    }

    public Gauge axisLabel(Label axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public SplitLine splitLine() {
        if (this.splitLine == null) this.splitLine = new SplitLine();
        return this.splitLine;
    }

    public Gauge splitLine(SplitLine splitLine) {
        this.splitLine = splitLine;
        return this;
    }

    public Pointer pointer() {
        if (this.pointer == null) this.pointer = new Pointer();
        return this.pointer;
    }

    public Gauge pointer(Pointer pointer) {
        this.pointer = pointer;
        return this;
    }

    public Title title() {
        if (this.title == null) this.title = new Title();
        return this.title;
    }

    public Gauge title(Title title) {
        this.title = title;
        return this;
    }

    public Detail detail() {
        if (this.detail == null) this.detail = new Detail();
        return this.detail;
    }

    public Gauge detail(Detail detail) {
        this.detail = detail;
        return this;
    }

    public Integer min() { return this.min; }

    public Gauge min(Integer min) {
        this.min = min;
        return this;
    }

    public Integer max() { return this.max; }

    public Gauge max(Integer max) {
        this.max = max;
        return this;
    }

    public Integer startAngle() { return this.startAngle; }

    public Gauge startAngle(Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public Integer endAngle() { return this.endAngle; }

    public Gauge endAngle(Integer endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public Integer splitNumber() { return this.splitNumber; }

    public Gauge splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }
}
