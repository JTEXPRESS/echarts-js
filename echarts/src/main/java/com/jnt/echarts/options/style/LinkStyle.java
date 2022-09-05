package com.jnt.echarts.options.style;

import com.jnt.echarts.options.code.LinkType;

import java.io.Serializable;

public class LinkStyle implements Serializable {
    private LinkType type;
    private String borderColor;
    private Integer borderWidth;

    public LinkType type() { return this.type; }

    public LinkStyle type(LinkType type) {
        this.type = type;
        return this;
    }

    public String borderColor() { return this.borderColor; }

    public LinkStyle borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer borderWidth() { return this.borderWidth; }

    public LinkStyle borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public LinkType getType() { return type; }

    public void setType(LinkType type) { this.type = type; }

    public String getBorderColor() { return borderColor; }

    public void setBorderColor(String borderColor) { this.borderColor = borderColor; }

    public Integer getBorderWidth() { return borderWidth; }

    public void setBorderWidth(Integer borderWidth) { this.borderWidth = borderWidth; }
}
