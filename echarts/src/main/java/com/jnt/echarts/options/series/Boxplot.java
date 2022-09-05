package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.Orient;
import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.style.ItemStyle;

public class Boxplot extends Series<Boxplot> {
    private Orient layout;
    private Object[] boxWidth;
    private ItemStyle itemStyle;

    public Boxplot() { this.type(SeriesType.boxplot); }

    public Boxplot(String name) {
        super(name);
        this.type(SeriesType.boxplot);
    }

    public Orient layout() { return this.layout; }

    public Boxplot layout(Orient layout) {
        this.layout = layout;
        return this;
    }

    public Object[] boxWidth() { return this.boxWidth; }

    public Boxplot boxWidth(Object[] boxWidth) {
        this.boxWidth = boxWidth;
        return this;
    }

    public Boxplot boxWidth(Object min, Object max) {
        this.boxWidth = new Object[]{min, max};
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public Boxplot itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }
}
