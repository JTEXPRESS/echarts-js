package com.jnt.echarts.options.style;

import com.jnt.echarts.options.code.Baseline;
import com.jnt.echarts.options.code.FontStyle;
import com.jnt.echarts.options.code.X;

import java.io.Serializable;

public class TextStyle implements Serializable {
    private X align;
    private Baseline baseline;
    private FontStyle fontStyle;
    private Object borderRadius;
    private Object padding;
    private Object fontWeight;
    private String color;
    private String backgroundColor;
    private String decoration;
    private String fontFamily;
    private String fontFamily2;
    private Integer fontSize;

    public X align() { return this.align; }

    public TextStyle align(X align) {
        this.align = align;
        return this;
    }

    public Baseline baseline() { return this.baseline; }

    public TextStyle baseline(Baseline baseline) {
        this.baseline = baseline;
        return this;
    }

    public FontStyle fontStyle() { return this.fontStyle; }

    public TextStyle fontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    public Object borderRadius() { return this.borderRadius; }

    public TextStyle borderRadius(Object borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Object padding() { return this.padding; }

    public TextStyle padding(Object padding) {
        this.padding = padding;
        return this;
    }

    public Object fontWeight() { return this.fontWeight; }

    public TextStyle fontWeight(Object fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    public String color() { return this.color; }

    public TextStyle color(String color) {
        this.color = color;
        return this;
    }

    public String backgroundColor() { return this.backgroundColor; }

    public TextStyle backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String decoration() { return this.decoration; }

    public TextStyle decoration(String decoration) {
        this.decoration = decoration;
        return this;
    }

    public String fontFamily() { return this.fontFamily; }

    public TextStyle fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public String fontFamily2() { return this.fontFamily2; }

    public TextStyle fontFamily2(String fontFamily2) {
        this.fontFamily2 = fontFamily2;
        return this;
    }

    public Integer fontSize() { return this.fontSize; }

    public TextStyle fontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public X getAlign() { return align; }

    public void setAlign(X align) { this.align = align; }

    public Baseline getBaseline() { return baseline; }

    public void setBaseline(Baseline baseline) { this.baseline = baseline; }

    public FontStyle getFontStyle() { return fontStyle; }

    public void setFontStyle(FontStyle fontStyle) { this.fontStyle = fontStyle; }

    public Object getFontWeight() { return fontWeight; }

    public void setFontWeight(Object fontWeight) { this.fontWeight = fontWeight; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getDecoration() { return decoration; }

    public void setDecoration(String decoration) { this.decoration = decoration; }

    public String getFontFamily() { return fontFamily; }

    public void setFontFamily(String fontFamily) { this.fontFamily = fontFamily; }

    public String getFontFamily2() { return fontFamily2; }

    public void setFontFamily2(String fontFamily2) { this.fontFamily2 = fontFamily2; }

    public Integer getFontSize() { return fontSize; }

    public void setFontSize(Integer fontSize) { this.fontSize = fontSize; }
}
