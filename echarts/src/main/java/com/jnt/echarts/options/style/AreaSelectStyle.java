package com.jnt.echarts.options.style;

public class AreaSelectStyle {
    private String color;
    private String borderColor;
    private Integer width;
    private Integer borderWidth;
    private Double opacity;

    public String color() { return this.color; }

    public AreaSelectStyle color(String color) {
        this.color = color;
        return this;
    }

    public String borderColor() { return this.borderColor; }

    public AreaSelectStyle borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer width() { return this.width; }

    public AreaSelectStyle width(Integer width) {
        this.width = width;
        return this;
    }

    public Integer borderWidth() { return this.borderWidth; }

    public AreaSelectStyle borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Double opacity() { return this.opacity; }

    public AreaSelectStyle opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getBorderColor() { return borderColor; }

    public void setBorderColor(String borderColor) { this.borderColor = borderColor; }

    public Integer getWidth() { return width; }

    public void setWidth(Integer width) { this.width = width; }

    public Integer getBorderWidth() { return borderWidth; }

    public void setBorderWidth(Integer borderWidth) { this.borderWidth = borderWidth; }

    public Double getOpacity() { return opacity; }

    public void setOpacity(Double opacity) { this.opacity = opacity; }
}
