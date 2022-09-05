package com.jnt.echarts.options.style;

import com.jnt.echarts.options.code.FontStyle;
import com.jnt.echarts.options.code.FontWeight;

import java.io.Serializable;

public class NameTextStyle implements Serializable {
    private FontStyle fontStyle;
    private FontWeight fontWeight;
    private String color;
    private String fontFamily;
    private Double fontSize;

    public FontStyle fontStyle() { return this.fontStyle; }

    public NameTextStyle fontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    public FontWeight fontWeight() { return this.fontWeight; }

    public NameTextStyle fontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    public String color() { return this.color; }

    public NameTextStyle color(String color) {
        this.color = color;
        return this;
    }

    public String fontFamily() { return this.fontFamily; }

    public NameTextStyle fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public Double fontSize() { return this.fontSize; }

    public NameTextStyle fontSize(Double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public FontStyle getFontStyle() { return fontStyle; }

    public void setFontStyle(FontStyle fontStyle) { this.fontStyle = fontStyle; }

    public FontWeight getFontWeight() { return fontWeight; }

    public void setFontWeight(FontWeight fontWeight) { this.fontWeight = fontWeight; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getFontFamily() { return fontFamily; }

    public void setFontFamily(String fontFamily) { this.fontFamily = fontFamily; }

    public Double getFontSize() { return fontSize; }

    public void setFontSize(Double fontSize) { this.fontSize = fontSize; }
}
