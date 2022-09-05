package com.jnt.echarts.options.data;

import com.jnt.echarts.options.Tooltip;

public class Data extends BasicData<Data> {
    private Object min;
    private Object max;
    private Tooltip tooltip;
    private String icon;
    private Integer valueIndex;
    private Double smoothRadian;
    private Boolean selected;

    public Data() {}

    public Data(String name) { super(name); }

    public Data(String name, Object value) { super(name, value); }

    public Data(String name, Object symbol, Object symbolSize) { super(name, symbol, symbolSize); }

    public Data(Object value, Object symbol) { super(value, symbol); }

    public Data(Object value, Object symbol, Object symbolSize) { super(value, symbol, symbolSize); }

    public Object min() { return this.min; }

    public Data min(Object min) {
        this.min = min;
        return this;
    }

    public Object max() { return this.max; }

    public Data max(Object max) {
        this.max = max;
        return this;
    }

    public Tooltip tooltip() {
        if (this.tooltip == null) this.tooltip = new Tooltip();
        return this.tooltip;
    }

    public Data tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public String icon() { return this.icon; }

    public Data icon(String icon) {
        this.icon = icon;
        return this;
    }

    public Integer valueIndex() { return this.valueIndex; }

    public Data valueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }

    public Double smoothRadian() { return this.smoothRadian; }

    public Data smoothRadian(Double smoothRadian) {
        this.smoothRadian = smoothRadian;
        return this;
    }

    public Boolean selected() { return this.selected; }

    public Data selected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    public Integer getValueIndex() { return valueIndex; }

    public Data setValueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
}
