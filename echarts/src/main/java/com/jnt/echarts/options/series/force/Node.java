package com.jnt.echarts.options.series.force;

import com.jnt.echarts.options.style.ItemStyle;

import java.io.Serializable;
import java.util.HashMap;

public class Node extends HashMap<String, Object> implements Serializable {
    public Node() { super(); }

    public Node(Integer category, String name, Integer value) {
        super();
        put("category", category);
        put("name", name);
        put("value", value);
    }

    public Object initial() { return get("initial"); }

    public Node initial(Object initial) {
        put("initial", initial);
        return this;
    }

    public Object symbol() { return get("symbol"); }

    public Node symbol(Object symbol) {
        put("symbol", symbol);
        return this;
    }

    public Object symbolSize() { return get("symbolSize"); }

    public Node symbolSize(Object symbolSize) {
        put("symbolSize", symbolSize);
        return this;
    }

    public ItemStyle itemStyle() {
        if (get("itemStyle") == null) put("itemStyle", new ItemStyle());
        return (ItemStyle) get("itemStyle");
    }

    public Node itemStyle(ItemStyle itemStyle) {
        put("itemStyle", itemStyle);
        return this;
    }

    public String name() { return (String) get("name"); }

    public Node name(String name) {
        put("name", name);
        return this;
    }

    public String label() { return (String) get("label"); }

    public Node label(String label) {
        put("label", label);
        return this;
    }

    public Integer category() { return (Integer) get("category"); }

    public Node category(Integer category) {
        put("category", category);
        return this;
    }

    public Integer value() { return (Integer) get("value"); }

    public Node value(Integer value) {
        put("value", value);
        return this;
    }

    public Boolean fixX() { return (Boolean) get("fixX"); }

    public Node fixX(Boolean fixX) {
        put("fixX", fixX);
        return this;
    }

    public Boolean fixY() { return (Boolean) get("fixY"); }

    public Node fixY(Boolean fixY) {
        put("fixY", fixY);
        return this;
    }

    public Boolean ignore() { return (Boolean) get("ignore"); }

    public Node ignore(Boolean ignore) {
        put("ignore", ignore);
        return this;
    }

    public Boolean draggable() { return (Boolean) get("draggable"); }

    public Node draggable(Boolean draggable) {
        put("draggable", draggable);
        return this;
    }
}
