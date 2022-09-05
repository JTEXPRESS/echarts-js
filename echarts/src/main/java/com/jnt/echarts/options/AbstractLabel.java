package com.jnt.echarts.options;

import com.jnt.echarts.options.code.Position;
import com.jnt.echarts.options.style.TextStyle;

import java.io.Serializable;

@SuppressWarnings("unchecked")
public abstract class AbstractLabel<T> implements Serializable {
    private Object position;
    private Object interval;
    private Object formatter;
    private TextStyle textStyle;
    private String color;
    private Integer margin;
    private Integer rotate;
    private Boolean clickable;
    private Boolean show;

    public Object position() { return this.position; }

    public T position(Object position) {
        this.position = position;
        return (T) this;
    }

    public T position(Position position) {
        this.position = position;
        return (T) this;
    }

    public Object interval() { return this.interval; }

    public T interval(Object interval) {
        this.interval = interval;
        return (T) this;
    }

    public Object formatter() { return this.formatter; }

    public T formatter(Object formatter) {
        this.formatter = formatter;
        return (T) this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public T textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return (T) this;
    }

    public String color() { return this.color; }

    public T color(String color) {
        this.color = color;
        return (T) this;
    }

    public Integer margin() { return this.margin; }

    public T margin(Integer margin) {
        this.margin = margin;
        return (T) this;
    }

    public Integer rotate() { return this.rotate; }

    public T rotate(Integer rotate) {
        this.rotate = rotate;
        return (T) this;
    }

    public Boolean clickable() { return this.clickable; }

    public T clickable(Boolean clickable) {
        this.clickable = clickable;
        return (T) this;
    }

    public Boolean show() { return this.show; }

    public T show(Boolean show) {
        this.show = show;
        return (T) this;
    }
}
