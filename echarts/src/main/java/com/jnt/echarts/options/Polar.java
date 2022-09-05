package com.jnt.echarts.options;

import com.jnt.echarts.options.axis.AxisLabel;
import com.jnt.echarts.options.axis.AxisLine;
import com.jnt.echarts.options.axis.SplitArea;
import com.jnt.echarts.options.axis.SplitLine;
import com.jnt.echarts.options.code.PolarType;
import com.jnt.echarts.options.style.TextStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polar extends AbstractData<Polar> implements Component {
    private List<Object> indicator;
    private PolarType type;
    private Object radius;
    private Object[] center;
    private Object[] boundaryGap;
    private AxisLine axisLine;
    private AxisLabel axisLabel;
    private SplitArea splitArea;
    private SplitLine splitLine;
    private Name name;
    private Integer z;
    private Integer zlevel;
    private Integer startAngle;
    private Integer splitNumber;
    private Integer precision;
    private Integer power;
    private Boolean scale;

    public List<Object> indicator() {
        if (this.indicator == null) this.indicator = new ArrayList<Object>();
        return this.indicator;
    }

    public Polar indicator(List<Object> indicator) {
        this.indicator = indicator;
        return this;
    }

    public Polar indicator(Object... values) {
        if (values == null || values.length == 0) return this;
        this.indicator().addAll(Arrays.asList(values));
        return this;
    }


    public PolarType type() { return this.type; }

    public Polar type(PolarType type) {
        this.type = type;
        return this;
    }

    public Object radius() { return this.radius; }

    public Polar radius(Object value) {
        this.radius = value;
        return this;
    }

    public Polar radius(Object width, Object height) {
        radius = new Object[]{width, height};
        return this;
    }

    public Object[] center() { return this.center; }

    public Polar center(Object[] center) {
        this.center = center;
        return this;
    }

    public Polar center(Object width, Object height) {
        this.center = new Object[]{width, height};
        return this;
    }

    public Object[] boundaryGap() { return this.boundaryGap; }

    public Polar boundaryGap(Object[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    public Polar boundaryGap(Object min, Object max) {
        this.boundaryGap = new Object[]{min, max};
        return this;
    }

    public AxisLine axisLine() {
        if (this.axisLine == null) this.axisLine = new AxisLine();
        return this.axisLine;
    }

    public Polar axisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
        return this;
    }

    public AxisLabel axisLabel() {
        if (this.axisLabel == null) this.axisLabel = new AxisLabel();
        return this.axisLabel;
    }

    public Polar axisLabel(AxisLabel axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public SplitArea splitArea() {
        if (this.splitArea == null) this.splitArea = new SplitArea();
        return this.splitArea;
    }

    public Polar splitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
        return this;
    }

    public SplitLine splitLine() {
        if (this.splitLine == null) this.splitLine = new SplitLine();
        return this.splitLine;
    }

    public Polar splitLine(SplitLine splitLine) {
        this.splitLine = splitLine;
        return this;
    }

    public Name name() {
        if (this.name == null) this.name = new Name();
        return this.name;
    }

    public Polar name(Name name) {
        this.name = name;
        return this;
    }

    public Integer z() { return this.z; }

    public Polar z(Integer z) {
        this.z = z;
        return this;
    }

    public Integer zlevel() { return this.zlevel; }

    public Polar zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return this;
    }

    public Integer startAngle() { return this.startAngle; }

    public Polar startAngle(Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public Integer splitNumber() { return this.splitNumber; }

    public Polar splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public Integer precision() { return this.precision; }

    public Polar precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public Integer power() { return this.power; }

    public Polar power(Integer power) {
        this.power = power;
        return this;
    }

    public Boolean scale() { return this.scale; }

    public Polar scale(Boolean scale) {
        this.scale = scale;
        return this;
    }

    public static class Name {
        private TextStyle textStyle;
        private Boolean show;

        public Name() {
            this.show(true);
            this.textStyle(new TextStyle());
            this.textStyle.color("#333");
        }

        public TextStyle textStyle() {
            if (this.textStyle == null) this.textStyle = new TextStyle();
            return this.textStyle;
        }

        public Name textStyle(TextStyle textStyle) {
            this.textStyle = textStyle;
            return this;
        }

        public Boolean show() { return this.show; }

        public Name show(Boolean show) {
            this.show = show;
            return this;
        }
    }
}
