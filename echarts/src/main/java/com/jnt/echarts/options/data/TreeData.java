package com.jnt.echarts.options.data;

import com.jnt.echarts.options.code.Symbol;
import com.jnt.echarts.options.style.ItemStyle;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TreeData implements Serializable {
    private List<TreeData> children;
    private Object symbol;
    private Object symbolSize;
    private ItemStyle itemStyle;
    private String name;
    private Double value;

    public TreeData() {}

    public TreeData(String name, Double value) {
        this.name   = name;
        this.value  = value;
    }

    public TreeData(String name, Integer value) {
        this.name   = name;
        this.value  = value.doubleValue();
    }

    public List<TreeData> children() {
        if (this.children == null) this.children = new LinkedList<TreeData>();
        return this.children;
    }

    public TreeData children(TreeData... treeDatas) {
        if (treeDatas == null || treeDatas.length == 0)  return this;
        this.children().addAll(Arrays.asList(treeDatas));
        return this;
    }

    public Object symbol() { return this.symbol; }

    public TreeData symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public TreeData symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() { return this.symbolSize; }

    public TreeData symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public TreeData itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public String name() { return this.name; }

    public TreeData name(String name) {
        this.name = name;
        return this;
    }

    public Double value() { return this.value; }

    public TreeData value(Double value) {
        this.value = value;
        return this;
    }
}
