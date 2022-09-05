package com.jnt.echarts.options.data;

import com.jnt.echarts.options.style.ItemStyle;

import java.io.Serializable;

public class WordCloudData implements Serializable {
    private ItemStyle itemStyle;
    private String name;
    private Integer value;

    public WordCloudData() {}

    public WordCloudData(String name, Integer value) {
        this.name   = name;
        this.value  = value;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public WordCloudData itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public String name() { return this.name; }

    public WordCloudData name(String name) {
        this.name = name;
        return this;
    }

    public Integer value() { return this.value; }

    public WordCloudData value(Integer value) {
        this.value = value;
        return this;
    }
}
