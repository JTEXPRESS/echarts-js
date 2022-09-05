package com.jnt.echarts.options;

public class Grid extends Basic<Grid> implements Component {
    private Object x2;
    private Object y2;
    private Boolean containLabel;

    public Object x2() { return this.x2; }

    public Grid x2(Object x2) {
        this.x2 = x2;
        return this;
    }

    public Object y2() { return this.y2; }

    public Grid y2(Object y2) {
        this.y2 = y2;
        return this;
    }

    public Boolean containLabel() { return this.containLabel; }

    public Grid containLabel(Boolean containLabel) {
        this.containLabel = containLabel;
        return this;
    }

    public Boolean getContainLabel() { return containLabel; }

    public void setContainLabel(Boolean containLabel) { this.containLabel = containLabel; }
}
