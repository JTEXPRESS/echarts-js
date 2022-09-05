package com.jnt.echarts.options.series.other;

import com.jnt.echarts.options.code.ColorMappingBy;
import com.jnt.echarts.options.style.ItemStyle;

import java.io.Serializable;

public class Level implements Serializable {
    private Object colorMappingBy;
    private Object[] color;
    private Object[] colorAlpha;
    private ItemStyle label;
    private ItemStyle itemStyle;
    private Integer visualDimension;
    private Double colorSaturation;
    private Double visibleMin;
    private Double childrenVisibleMin;

    public Object colorMappingBy() { return this.colorMappingBy; }

    public Level colorMappingBy(Object colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
        return this;
    }

    public Level colorMappingBy(ColorMappingBy colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
        return this;
    }

    public Object[] color() { return this.color; }

    public Level color(Object[] color) {
        this.color = color;
        return this;
    }

    public Object[] colorAlpha() { return this.colorAlpha; }

    public Level colorAlpha(Object[] colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    public ItemStyle label() {
        if (this.label == null) this.label = new ItemStyle();
        return this.label;
    }

    public Level label(ItemStyle label) {
        this.label = label;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public Level itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Integer visualDimension() { return this.visualDimension; }

    public Level visualDimension(Integer visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    public Double colorSaturation() { return this.colorSaturation; }

    public Level colorSaturation(Double colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    public Double visibleMin() { return this.visibleMin; }

    public Level visibleMin(Double visibleMin) {
        this.visibleMin = visibleMin;
        return this;
    }

    public Double childrenVisibleMin() { return this.childrenVisibleMin; }

    public Level childrenVisibleMin(Double childrenVisibleMin) {
        this.childrenVisibleMin = childrenVisibleMin;
        return this;
    }

    public Object getColorMappingBy() { return colorMappingBy; }

    public void setColorMappingBy(Object colorMappingBy) { this.colorMappingBy = colorMappingBy; }

    public Object[] getColor() { return color; }

    public void setColor(Object[] color) { this.color = color; }

    public Object[] getColorAlpha() { return colorAlpha; }

    public void setColorAlpha(Object[] colorAlpha) { this.colorAlpha = colorAlpha; }

    public ItemStyle getLabel() { return label; }

    public void setLabel(ItemStyle label) { this.label = label; }

    public ItemStyle getItemStyle() { return itemStyle; }

    public void setItemStyle(ItemStyle itemStyle) { this.itemStyle = itemStyle; }

    public Integer getVisualDimension() { return visualDimension; }

    public void setVisualDimension(Integer visualDimension) { this.visualDimension = visualDimension; }

    public Double getColorSaturation() { return colorSaturation; }

    public void setColorSaturation(Double colorSaturation) { this.colorSaturation = colorSaturation; }

    public Double getVisibleMin() { return visibleMin; }

    public void setVisibleMin(Double visibleMin) { this.visibleMin = visibleMin; }

    public Double getChildrenVisibleMin() { return childrenVisibleMin; }

    public void setChildrenVisibleMin(Double childrenVisibleMin) { this.childrenVisibleMin = childrenVisibleMin; }
}
