package com.jnt.echarts.options.style;

import com.jnt.echarts.options.code.X;
import com.jnt.echarts.options.code.Y;

import java.io.Serializable;

public class Breadcrumb implements Serializable {
    private Object width;
    private Object height;
    private Object left;
    private Object top;
    private Object right;
    private Object bottom;
    private ItemStyle itemStyle;
    private TextStyle textStyle;
    private Boolean show;

    public Breadcrumb() {}

    public Breadcrumb(Boolean show) { this.show = show; }

    public Breadcrumb(Boolean show, TextStyle textStyle) {
        this.show = show;
        this.textStyle = textStyle;
    }

    public Object width() { return this.width; }

    public Breadcrumb width(Object width) {
        this.width = width;
        return this;
    }

    public Breadcrumb width(Integer width) {
        this.width = width;
        return this;
    }

    public Object height() { return this.height; }

    public Breadcrumb height(Object height) {
        this.height = height;
        return this;
    }

    public Breadcrumb height(Integer height) {
        this.height = height;
        return this;
    }

    public Object left() { return this.left; }

    public Breadcrumb left(Object left) {
        this.left = left;
        return this;
    }

    public Breadcrumb left(Integer left) {
        this.left = left;
        return this;
    }

    public Breadcrumb left(X left) {
        this.left = left;
        return this;
    }

    public Object top() { return this.top; }

    public Breadcrumb top(Object top) {
        this.top = top;
        return this;
    }

    public Breadcrumb top(Integer top) {
        this.top = top;
        return this;
    }

    public Breadcrumb top(Y top) {
        this.top = top;
        return this;
    }

    public Object right() { return this.right; }

    public Breadcrumb right(Object right) {
        this.right = right;
        return this;
    }

    public Breadcrumb right(Integer right) {
        this.right = right;
        return this;
    }

    public Object bottom() { return this.bottom; }

    public Breadcrumb bottom(Object bottom) {
        this.bottom = bottom;
        return this;
    }

    public Breadcrumb bottom(Integer bottom) {
        this.bottom = bottom;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public Breadcrumb itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Breadcrumb textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public Boolean show() { return this.show; }

    public Breadcrumb show(Boolean show) {
        this.show = show;
        return this;
    }

    public Object getWidth() { return width; }

    public void setWidth(Object width) { this.width = width; }

    public Object getHeight() { return height; }

    public void setHeight(Object height) { this.height = height; }

    public Object getLeft() { return left; }

    public void setLeft(Object left) { this.left = left; }

    public Object getTop() { return top; }

    public void setTop(Object top) { this.top = top; }

    public Object getRight() { return right; }

    public void setRight(Object right) { this.right = right; }

    public Object getBottom() { return bottom; }

    public void setBottom(Object bottom) { this.bottom = bottom; }

    public ItemStyle getItemStyle() { return itemStyle; }

    public void setItemStyle(ItemStyle itemStyle) { this.itemStyle = itemStyle; }

    public TextStyle getTextStyle() { return textStyle; }

    public void setTextStyle(TextStyle textStyle) { this.textStyle = textStyle; }

    public Boolean getShow() { return show; }

    public void setShow(Boolean show) { this.show = show; }
}
