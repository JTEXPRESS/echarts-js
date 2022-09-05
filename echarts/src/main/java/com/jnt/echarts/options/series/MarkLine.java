package com.jnt.echarts.options.series;

import com.jnt.echarts.options.AbstractData;
import com.jnt.echarts.options.style.ItemStyle;

public class MarkLine extends AbstractData<MarkLine> {
    private Object symbol;
    private Object symbolSize;
    private Object symbolRoate;
    private GeoCoord geoCoord;
    private Bundling bundling;
    private Effect effect;
    private ItemStyle itemStyle;
    private Integer precision;
    private Double smoothness;
    private Boolean smooth;

    public Object symbol() { return this.symbol; }

    public MarkLine symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() { return this.symbolSize; }

    public MarkLine symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Object symbolRoate() { return this.symbolRoate; }

    public MarkLine symbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return this;
    }

    public GeoCoord geoCoord() {
        if (this.geoCoord == null) this.geoCoord = new GeoCoord();
        return this.geoCoord;
    }

    public MarkLine geoCoord(String name, String x, String y) {
        this.geoCoord().put(name, x, y);
        return this;
    }

    public Bundling bundling() {
        if (this.bundling == null) this.bundling = new Bundling();
        return this.bundling;
    }

    public MarkLine bundling(Bundling bundling) {
        this.bundling = bundling;
        return this;
    }

    public Effect effect() {
        if (this.effect == null) this.effect = new Effect();
        return this.effect;
    }

    public MarkLine effect(Effect effect) {
        this.effect = effect;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public MarkLine itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Integer precision() { return this.precision; }

    public MarkLine precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public Double smoothness() { return this.smoothness; }

    public MarkLine smoothness(Double smoothness) {
        this.smoothness = smoothness;
        return this;
    }

    public Boolean smooth() { return this.smooth; }

    public MarkLine smooth(Boolean smooth) {
        this.smooth = smooth;
        return this;
    }

    public static class Bundling {
        private Integer maxTurningAngle;
        private Boolean enable;

        public Integer maxTurningAngle() { return this.maxTurningAngle; }

        public Bundling maxTurningAngle(Integer maxTurningAngle) {
            this.maxTurningAngle = maxTurningAngle;
            return this;
        }

	    public Boolean enable() { return this.enable; }

        public Bundling enable(Boolean enable) {
            this.enable = enable;
            return this;
        }
    }
}
