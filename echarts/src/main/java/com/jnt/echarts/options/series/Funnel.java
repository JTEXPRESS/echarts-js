package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.code.Sort;
import com.jnt.echarts.options.code.X;
import com.jnt.echarts.options.style.ItemStyle;

public class Funnel extends Series<Funnel> {
    private X funnelAlign;
    private Sort sort;
    private Object x;
    private Object y;
    private Object x2;
    private Object y2;
    private ItemStyle labelLine;
    private String minSize;
    private String maxSize;
    private Integer min;
    private Integer max;
    private Integer gap;

    public Funnel() { this.type(SeriesType.funnel); }

    public Funnel(String name) {
        super(name);
        this.type(SeriesType.funnel);
    }

    public X funnelAlign() { return this.funnelAlign; }

    public Funnel funnelAlign(X funnelAlign) {
        this.funnelAlign = funnelAlign;
        return this;
    }

    public Sort sort() { return this.sort; }

    public Funnel sort(Sort sort) {
        this.sort = sort;
        return this;
    }

    public Object x() { return this.x; }

    public Funnel x(Object x) {
        this.x = x;
        return this;
    }

    public Object y() { return this.y; }

    public Funnel y(Object y) {
        this.y = y;
        return this;
    }

    public Object x2() { return this.x2; }

    public Funnel x2(Object x2) {
        this.x2 = x2;
        return this;
    }

    public Object y2() { return this.y2; }

    public Funnel y2(Object y2) {
        this.y2 = y2;
        return this;
    }

    public ItemStyle labelLine() {
        if (this.labelLine == null) this.labelLine = new ItemStyle();
        return this.labelLine;
    }

    public Funnel labelLine(ItemStyle labelLine) {
        this.labelLine = labelLine;
        return this;
    }

    public String minSize() { return this.minSize; }

    public Funnel minSize(String minSize) {
        this.minSize = minSize;
        return this;
    }

    public String maxSize() { return this.maxSize; }

    public Funnel maxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    public Integer min() { return this.min; }

    public Funnel min(Integer min) {
        this.min = min;
        return this;
    }

    public Integer max() { return this.max; }

    public Funnel max(Integer max) {
        this.max = max;
        return this;
    }

    public Integer gap() { return this.gap; }

    public Funnel gap(Integer gap) {
        this.gap = gap;
        return this;
    }
}
