package com.jnt.echarts.options;

import com.jnt.echarts.options.style.TextStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Radar extends AbstractData<Radar> implements Component {
    private List<Indicator> indicator;
    private Object radius;
    private Object axisLine;
    private Object axisTick;
    private Object splitLine;
    private Object splitArea;
    private Object[] center;
    private Name name;
    private String id;
    private String shape;
    private Integer z;
    private Integer zlevel;
    private Integer startAngle;
    private Integer nameGap;
    private Integer splitNumber;
    private Boolean scale;
    private Boolean silent;
    private Boolean triggerEvent;

    public List<Indicator> indicator() {
        if (this.indicator == null) this.indicator = new ArrayList<>();
        return this.indicator;
    }

    public Radar indicator(List<Indicator> indicator) {
        this.indicator = indicator;
        return this;
    }

    public Radar indicator(Indicator... values) {
        if (values == null || values.length == 0) return this;
        this.indicator().addAll(Arrays.asList(values));
        return this;
    }

    public Object radius() { return this.radius; }

    public Radar radius(Object radius) {
        this.radius = radius;
        return this;
    }

    public Object axisLine() { return this.axisLine; }

    public Radar axisLine(Object axisLine) {
        this.axisLine = axisLine;
        return this;
    }

    public Object axisTick() { return this.axisTick; }

    public Radar axisTick(Object axisTick) {
        this.axisTick = axisTick;
        return this;
    }

    public Object splitLine() { return this.splitLine; }

    public Radar splitLine(Object splitLine) {
        this.splitLine = splitLine;
        return this;
    }

    public Object splitArea() { return this.splitArea; }

    public Radar splitArea(Object splitArea) {
        this.splitArea = splitArea;
        return this;
    }

    public Object[] center() { return this.center; }

    public Radar center(Object[] center) {
        this.center = center;
        return this;
    }

    public Name name() {
        if (this.name == null) this.name = new Name();
        return this.name;
    }

    public Radar name(Name name) {
        this.name = name;
        return this;
    }

    public String id() { return this.id; }

    public Radar id(String id) {
        this.id = id;
        return this;
    }

    public String shape() { return this.shape; }

    public Radar shape(String shape) {
        this.shape = shape;
        return this;
    }

    public Integer z() { return this.z; }

    public Radar z(Integer z) {
        this.z = z;
        return this;
    }

    public Integer zlevel() { return this.zlevel; }

    public Radar zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return this;
    }

    public Integer startAngle() { return this.startAngle; }

    public Radar startAngle(Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public Integer nameGap() { return this.nameGap; }

    public Radar nameGap(Integer nameGap) {
        this.nameGap = nameGap;
        return this;
    }

    public Integer splitNumber() { return this.splitNumber; }

    public Radar splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public Boolean scale() { return this.scale; }

    public Radar scale(Boolean scale) {
        this.scale = scale;
        return this;
    }

    public Boolean silent() { return this.silent; }

    public Radar silent(Boolean silent) {
        this.silent = silent;
        return this;
    }

    public Boolean triggerEvent() { return this.triggerEvent; }

    public Radar triggerEvent(Boolean triggerEvent) {
        this.triggerEvent = triggerEvent;
        return this;
    }

    public static class Indicator {
        private Object min;
        private Object max;
        private String name;
        private String color;

        public Object min() { return this.min; }

        public Indicator min(Object min) {
            this.min = min;
            return this;
        }

        public Object max() { return this.max; }

        public Indicator max(Object max) {
            this.max = max;
            return this;
        }

        public String name() { return this.name; }

        public Indicator name(String name) {
            this.name = name;
            return this;
        }

        public String color() { return this.color; }

        public Indicator color(String color) {
            this.color = color;
            return this;
        }
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
