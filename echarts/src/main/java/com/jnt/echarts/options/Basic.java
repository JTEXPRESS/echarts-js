package com.jnt.echarts.options;

import com.jnt.echarts.options.code.X;
import com.jnt.echarts.options.code.Y;

import java.io.Serializable;

@SuppressWarnings("unchecked")
public abstract class Basic<T> implements Serializable {
    private Object x;
    private Object y;
    private Object width;
    private Object height;
    private Object left;
    private Object top;
    private Object right;
    private Object bottom;
    private Object padding;
    private String backgroundColor;
    private String borderColor;
    private String shadowColor;
    private Integer z;
    private Integer zlevel;
    private Integer borderWidth;
    private Integer itemGap;
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private Boolean show;

    public Object x() { return this.x; }

    public T x(X x) {
        this.x = x;
        return (T) this;
    }

    public T x(Object x) {
        this.x = x;
        return (T) this;
    }

    public Object y() { return this.y; }

    public T y(Y y) {
        this.y = y;
        return (T) this;
    }

    public T y(Object y) {
        this.y = y;
        return (T) this;
    }

    public Object width() { return this.width; }

    public T width(Object width) {
        this.width = width;
        return (T) this;
    }

    public T width(Integer width) {
        this.width = width;
        return (T) this;
    }

    public Object height() { return this.height; }

    public T height(Object height) {
        this.height = height;
        return (T) this;
    }

    public T height(Integer height) {
        this.height = height;
        return (T) this;
    }

    public Object left() { return this.left; }

    public T left(X left) {
        this.left = left;
        return (T) this;
    }

    public T left(Object left) {
        this.left = left;
        return (T) this;
    }

    public T left(Integer left) {
        this.left = left;
        return (T) this;
    }

    public Object top() { return this.top; }

    public T top(Y top) {
        this.top = top;
        return (T) this;
    }

    public T top(Object top) {
        this.top = top;
        return (T) this;
    }

    public T top(Integer top) {
        this.top = top;
        return (T) this;
    }

    public Object right() { return this.right; }

    public T right(Object right) {
        this.right = right;
        return (T) this;
    }

    public T right(Integer right) {
        this.right = right;
        return (T) this;
    }

    public Object bottom() { return this.bottom; }

    public T bottom(Object bottom) {
        this.bottom = bottom;
        return (T) this;
    }

    public T bottom(Integer bottom) {
        this.bottom = bottom;
        return (T) this;
    }

    public Object padding() { return this.padding; }

    public T padding(Integer padding) {
        this.padding = padding;
        return (T) this;
    }

    public T padding(Integer... padding) {
        if (padding != null && padding.length > 4) throw new RuntimeException("The padding property can receive up to 4 parameters!");
        this.padding = padding;
        return (T) this;
    }

    public String backgroundColor() { return this.backgroundColor; }

    public T backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return (T) this;
    }

    public String borderColor() { return this.borderColor; }

    public T borderColor(String borderColor) {
        this.borderColor = borderColor;
        return (T) this;
    }

    public String shadowColor() { return this.shadowColor; }

    public T shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return (T) this;
    }

    public Integer z() { return this.z; }

    public T z(Integer z) {
        this.z = z;
        return (T) this;
    }

    public Integer zlevel() { return this.zlevel; }

    public T zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return (T) this;
    }

    public Integer borderWidth() { return this.borderWidth; }

    public T borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return (T) this;
    }

    public Integer itemGap() { return this.itemGap; }

    public T itemGap(Integer itemGap) {
        this.itemGap = itemGap;
        return (T) this;
    }

    public Integer shadowBlur() { return this.shadowBlur; }

    public T shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return (T) this;
    }

    public Integer shadowOffsetX() { return this.shadowOffsetX; }

    public T shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return (T) this;
    }

    public Integer shadowOffsetY() { return this.shadowOffsetY; }

    public T shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return (T) this;
    }

    public Boolean show() { return this.show; }

    public T show(Boolean show) {
        this.show = show;
        return (T) this;
    }
}
