package com.jnt.echarts.options.style;

import java.io.Serializable;

public class ControlStyle implements Serializable {
    private Color normal;
    private Color emphasis;
    private Integer itemSize;
    private Integer itemGap;

    public ControlStyle() {}

    public Color normal() {
        if (this.normal == null) this.normal = new Color();
        return this.normal;
    }

    public ControlStyle normal(Color normal) {
        this.normal = normal;
        return this;
    }

    public Color emphasis() {
        if (this.emphasis == null) this.emphasis = new Color();
        return this.emphasis;
    }

    public ControlStyle emphasis(Color emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public Integer itemSize() { return this.itemSize; }

    public ControlStyle itemSize(Integer itemSize) {
        this.itemSize = itemSize;
        return this;
    }

    public Integer itemGap() { return this.itemGap; }

    public ControlStyle itemGap(Integer itemGap) {
        this.itemGap = itemGap;
        return this;
    }

    public Color getNormal() { return normal; }

    public void setNormal(Color normal) { this.normal = normal; }

    public Color getEmphasis() { return emphasis; }

    public void setEmphasis(Color emphasis) { this.emphasis = emphasis; }

    public Integer getItemSize() { return itemSize; }

    public void setItemSize(Integer itemSize) { this.itemSize = itemSize; }

	public Integer getItemGap() { return itemGap; }

    public void setItemGap(Integer itemGap) { this.itemGap = itemGap; }

    public static class Color {
        private String color;

        public String color() { return this.color; }

        public Color color(String color) {
            this.color = color;
            return this;
        }

        public String getColor() { return color; }

        public void setColor(String color) { this.color = color; }
    }
}
