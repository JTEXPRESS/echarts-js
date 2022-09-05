package com.jnt.echarts.options.series.gauge;

import com.jnt.echarts.options.style.TextStyle;

import java.io.Serializable;

public class Detail implements Serializable {
    private Object width;
    private Object height;
    private Object offsetCenter;
    private TextStyle textStyle;
    private String backgroundColor;
    private String borderColor;
    private String formatter;
    private Integer borderWidth;
    private Boolean show;

    public Object width() { return this.width; }

    public Detail width(Object width) {
        this.width = width;
        return this;
    }

    public Object height() { return this.height; }

    public Detail height(Object height) {
        this.height = height;
        return this;
    }

    public Object offsetCenter() { return this.offsetCenter; }

    public Detail offsetCenter(Object offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public Detail textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public String backgroundColor() { return this.backgroundColor; }

    public Detail backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String borderColor() { return this.borderColor; }

    public Detail borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public String formatter() { return this.formatter; }

    public Detail formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public Integer borderWidth() { return this.borderWidth; }

    public Detail borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Boolean show() { return this.show; }

    public Detail show(Boolean show) {
        this.show = show;
        return this;
    }

    public Object getWidth() { return width; }

    public void setWidth(Object width) { this.width = width; }

    public Object getHeight() { return height; }

    public void setHeight(Object height) { this.height = height; }

    public Object getOffsetCenter() { return offsetCenter; }

    public void setOffsetCenter(Object offsetCenter) { this.offsetCenter = offsetCenter; }

    public TextStyle getTextStyle() { return textStyle; }

    public void setTextStyle(TextStyle textStyle) { this.textStyle = textStyle; }

    public String getBackgroundColor() { return backgroundColor; }

    public void setBackgroundColor(String backgroundColor) { this.backgroundColor = backgroundColor; }

    public String getBorderColor() { return borderColor; }

    public void setBorderColor(String borderColor) { this.borderColor = borderColor; }

    public String getFormatter() { return formatter; }

    public void setFormatter(String formatter) { this.formatter = formatter; }

    public Integer getBorderWidth() { return borderWidth; }

    public void setBorderWidth(Integer borderWidth) { this.borderWidth = borderWidth; }

    public Boolean getShow() { return show; }

    public void setShow(Boolean show) { this.show = show; }
}
