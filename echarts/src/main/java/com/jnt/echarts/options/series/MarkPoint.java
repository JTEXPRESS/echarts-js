package com.jnt.echarts.options.series;

import com.jnt.echarts.options.AbstractData;
import com.jnt.echarts.options.style.ItemStyle;

public class MarkPoint extends AbstractData<MarkPoint> {
    private Object symbol;
    private Object symbolSize;
    private Object symbolRoate;
    private GeoCoord geoCoord;
    private Effect effect;
    private ItemStyle itemStyle;
    private Boolean large;

    public Object symbol() { return this.symbol; }

    public MarkPoint symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() { return this.symbolSize; }

    public MarkPoint symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Object symbolRoate() { return this.symbolRoate; }

    public MarkPoint symbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return this;
    }

    public GeoCoord geoCoord() {
        if (this.geoCoord == null) this.geoCoord = new GeoCoord();
        return this.geoCoord;
    }

    public MarkPoint geoCoord(String name, String x, String y) {
        this.geoCoord().put(name, x, y);
        return this;
    }

    public Effect effect() {
        if (this.effect == null) this.effect = new Effect();
        return this.effect;
    }

    public MarkPoint effect(Effect effect) {
        this.effect = effect;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public MarkPoint itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Boolean large() { return this.large; }

    public MarkPoint large(Boolean large) {
        this.large = large;
        return this;
    }
}
