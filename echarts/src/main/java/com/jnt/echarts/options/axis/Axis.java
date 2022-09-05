package com.jnt.echarts.options.axis;

import com.jnt.echarts.options.AbstractData;
import com.jnt.echarts.options.Component;
import com.jnt.echarts.options.code.AxisType;
import com.jnt.echarts.options.code.X;
import com.jnt.echarts.options.code.Y;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unchecked")
public abstract class Axis<T> extends AbstractData<T> implements Component {
    private AxisType type;
    private Object position;
    private Object min;
    private Object max;
    private Object boundaryGap;
    private Object interval;
    private AxisLine axisLine;
    private AxisTick axisTick;
    private AxisLabel axisLabel;
    private SplitLine splitLine;
    private SplitArea splitArea;
    private Number minInterval;
    private String name;
    private Integer z;
    private Integer zlevel;
    private Integer gridIndex;
    private Integer nameGap;
    private Boolean inverse;
    private Boolean scale;
    private Boolean show;

    @Override
    public T data(Object... values) {
        if (values == null || values.length == 0) return (T) this;
        if (this.data == null) {
            if (this.type == AxisType.category)data = new ArrayList<>();
            else throw new RuntimeException("The data axis cannot add category information!");
        }

        this.data.addAll(Arrays.asList(values));
        return (T) this;
    }

    public AxisType type() { return this.type; }

    public AxisType getType() { return type; }

    public T type(AxisType type) {
        this.type = type;
        return (T) this;
    }

    public void setType(AxisType type) { this.type = type; }

    public Object position() { return this.position; }

    public Object getPosition() { return position; }

    public T position(X position) {
        this.position = position;
        return (T) this;
    }

    public T position(Y position) {
        this.position = position;
        return (T) this;
    }

    public T position(Object position) {
        this.position = position;
        return (T) this;
    }

    public void setPosition(Object position) {this.position = position; }

    public Object min() { return this.min; }

    public T min(Object min) {
        this.min = min;
        return (T) this;
    }

    public T min(Double min) {
        this.min = min;
        return (T) this;
    }

    public Object max() { return this.max; }

    public T max(Object max) {
        this.max = max;
        return (T) this;
    }

    public T max(Double max) {
        this.max = max;
        return (T) this;
    }

    public Object boundaryGap() { return this.boundaryGap; }

    public T boundaryGap(Object boundaryGap) {
        this.boundaryGap = boundaryGap;
        return (T) this;
    }

    public T boundaryGap(Object[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return (T) this;
    }

    public T boundaryGap(Object o1, Object o2) {
        this.boundaryGap = new Object[]{o1, o2};
        return (T) this;
    }

    public Object interval() { return this.interval; }

    public T interval(Object interval) {
        this.interval = interval;
        return (T) this;
    }

    public T interval(Double interval) {
        this.interval = interval;
        return (T) this;
    }

    public AxisLine axisLine() {
        if (this.axisLine == null) this.axisLine = new AxisLine();
        return this.axisLine;
    }

    public T axisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
        return (T) this;
    }

    public AxisTick axisTick() {
        if (this.axisTick == null) this.axisTick = new AxisTick();
        return this.axisTick;
    }

    public T axisTick(AxisTick axisTick) {
        this.axisTick = axisTick;
        return (T) this;
    }

    public AxisLabel axisLabel() {
        if (this.axisLabel == null) this.axisLabel = new AxisLabel();
        return this.axisLabel;
    }

    public T axisLabel(AxisLabel label) {
        this.axisLabel = label;
        return (T) this;
    }

    public SplitLine splitLine() {
        if (this.splitLine == null) this.splitLine = new SplitLine();
        return this.splitLine;
    }

    public T splitLine(SplitLine splitLine) {
        if (this.splitLine == null) this.splitLine = splitLine;
        return (T) this;
    }

    public SplitArea splitArea() {
        if (this.splitArea == null) this.splitArea = new SplitArea();
        return this.splitArea;
    }

    public T splitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
        return (T) this;
    }

    public Number minInterval() { return this.minInterval; }

    public T minInterval(Number minInterval) {
        this.minInterval = minInterval;
        return (T) this;
    }

    public String name() { return this.name; }

    public String getName() { return name; }

    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    public void setName(String name) { this.name = name; }

    public T z(Integer z) {
        this.z = z;
        return (T) this;
    }

    public Integer z() { return this.z; }

    public T zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return (T) this;
    }

    public Integer zlevel() { return this.zlevel; }

    public Integer gridIndex() { return this.gridIndex; }

    public T gridIndex(Integer gridIndex) {
        this.gridIndex = gridIndex;
        return (T) this;
    }

    public Integer nameGap() { return this.nameGap; }

    public T nameGap(Integer nameGap) {
        this.nameGap = nameGap;
        return (T) this;
    }

    public Boolean inverse() { return this.inverse; }

    public T inverse(Boolean inverse) {
        this.inverse = inverse;
        return (T) this;
    }

    public Boolean scale() { return this.scale; }

    public T scale(Boolean scale) {
        this.scale = scale;
        return (T) this;
    }

    public Boolean show() { return this.show; }

    public T show(Boolean show) {
        this.show = show;
        return (T) this;
    }
}