package com.jnt.echarts.options.series.force;

import com.jnt.echarts.options.style.ItemStyle;

import java.io.Serializable;

public class Category implements Serializable {
    private Object symbol;
    private Object symbolSize;
    private Object[] symbolOffset;
    private ItemStyle itemStyle;
    private ItemStyle label;
    private String name;
    private Integer symbolRotate;
    private Boolean draggable;

    public Category() {}

    public Category(String name) { this.name = name; }

    public Object symbol() { return this.symbol; }

    public Category symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() { return this.symbolSize; }

    public Category symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Object[] symbolOffset() { return this.symbolOffset; }

    public Category symbolOffset(Object[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public Category symbolOffset(Object o1, Object o2) {
        this.symbolOffset = new Object[]{o1, o2};
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public Category itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public ItemStyle label() {
        if (this.label == null) this.label = new ItemStyle();
        return this.label;
    }

    public Category label(ItemStyle label) {
        this.label = label;
        return this;
    }

    public String name() { return this.name; }

    public Category name(String name) {
        this.name = name;
        return this;
    }

    public Integer symbolRotate() { return this.symbolRotate; }

    public Category symbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public Boolean draggable() { return this.draggable; }

    public Category draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }
}
