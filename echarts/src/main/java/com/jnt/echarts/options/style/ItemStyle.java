package com.jnt.echarts.options.style;

import com.jnt.echarts.options.style.itemstyle.Emphasis;
import com.jnt.echarts.options.style.itemstyle.Normal;

import java.io.Serializable;

public class ItemStyle implements Serializable {
    private Object color;
    private Object borderColor;
    private Object shadowColor;
    private Normal normal;
    private Emphasis emphasis;
    private Breadcrumb breadcrumb;
    private Integer borderRadius;
    private Integer borderWidth;
    private Integer shadowBlur;

    public Object color() { return this.color; }

    public ItemStyle color(Object color) {
        this.color = color;
        return this;
    }

    public Object borderColor() { return this.borderColor; }

    public ItemStyle borderColor(Object borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Object shadowColor() { return this.shadowColor; }

    public ItemStyle shadowColor(Object shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Normal normal() {
        if (this.normal == null) this.normal = new Normal();
        return this.normal;
    }

    public ItemStyle normal(Normal normal) {
        this.normal = normal;
        return this;
    }

    public Emphasis emphasis() {
        if (this.emphasis == null) this.emphasis = new Emphasis();
        return this.emphasis;
    }

    public ItemStyle emphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public Breadcrumb breadcrumb() {
        if (this.breadcrumb == null) this.breadcrumb = new Breadcrumb();
        return this.breadcrumb;
    }

    public ItemStyle breadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
        return this;
    }

    public Integer borderRadius() { return this.borderRadius; }

    public ItemStyle borderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Integer borderWidth() { return this.borderWidth; }

    public ItemStyle borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Integer shadowBlur() { return this.shadowBlur; }

    public ItemStyle shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public Object getColor() { return color; }

    public void setColor(Object color) { this.color = color; }

    public Object getBorderColor() { return borderColor; }

    public void setBorderColor(Object borderColor) { this.borderColor = borderColor; }

    public Object getShadowColor() { return shadowColor; }

    public void setShadowColor(Object shadowColor) { this.shadowColor = shadowColor; }

    public Normal getNormal() { return normal; }

    public void setNormal(Normal normal) { this.normal = normal; }

    public Emphasis getEmphasis() { return emphasis; }

    public void setEmphasis(Emphasis emphasis) { this.emphasis = emphasis; }

    public Breadcrumb getBreadcrumb() { return breadcrumb; }

    public void setBreadcrumb(Breadcrumb breadcrumb) { this.breadcrumb = breadcrumb; }

    public Integer getBorderRadius() { return borderRadius; }

    public void setBorderRadius(Integer borderRadius) { this.borderRadius = borderRadius; }

    public Integer getBorderWidth() { return borderWidth; }

    public void setBorderWidth(Integer borderWidth) { this.borderWidth = borderWidth; }

    public Integer getShadowBlur() { return shadowBlur; }

    public void setShadowBlur(Integer shadowBlur) { this.shadowBlur = shadowBlur; }
}
