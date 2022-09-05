package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.X;
import com.jnt.echarts.options.code.Y;

import java.io.Serializable;

public class MapLocation implements Serializable {
    private Object x;
    private Object y;
    private Object width;
    private Object height;

    public MapLocation() {}

    public MapLocation(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    public MapLocation(Object x, Object y, Object width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public MapLocation(Object x, Object y, Object width, Object height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public MapLocation(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public MapLocation(X x, Y y, Object width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public MapLocation(X x, Y y, Object width, Object height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Object x() { return this.x; }

    public MapLocation x(Object x) {
        this.x = x;
        return this;
    }

    public MapLocation x(X x) {
        this.x = x;
        return this;
    }

    public Object y() { return this.y; }

    public MapLocation y(Y y) {
        this.y = y;
        return this;
    }

    public MapLocation y(Object y) {
        this.y = y;
        return this;
    }

    public Object width() { return this.width; }

    public MapLocation width(Object width) {
        this.width = width;
        return this;
    }

    public Object height() { return this.height; }

    public MapLocation height(Object height) {
        this.height = height;
        return this;
    }
}
