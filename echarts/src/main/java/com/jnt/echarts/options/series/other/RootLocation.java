package com.jnt.echarts.options.series.other;

import com.jnt.echarts.options.code.X;
import com.jnt.echarts.options.code.Y;

import java.io.Serializable;

public class RootLocation implements Serializable {
    private Object x;
    private Object y;

    public RootLocation() {}

    public RootLocation(Object x, Object y) {
        this.x  = x;
        this.y  = y;
    }

    public Object x() { return this.x; }

    public RootLocation x(X x) {
        this.x = x;
        return this;
    }

    public RootLocation x(Object x) {
        this.x = x;
        return this;
    }

    public RootLocation x(String x) {
        this.x = x;
        return this;
    }

    public RootLocation x(Integer x) {
        this.x = x;
        return this;
    }

    public Object y() { return this.y; }

    public RootLocation y(Y y) {
        this.y = y;
        return this;
    }

    public RootLocation y(Object y) {
        this.y = y;
        return this;
    }

    public RootLocation y(String y) {
        this.y = y;
        return this;
    }

    public RootLocation y(Integer y) {
        this.y = y;
        return this;
    }

    public Object getX() { return x; }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() { return y; }

    public void setY(Object y) { this.y = y; }
}
