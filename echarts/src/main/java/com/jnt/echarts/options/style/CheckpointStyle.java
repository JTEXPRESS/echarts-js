package com.jnt.echarts.options.style;

import com.jnt.echarts.options.Label;

import java.io.Serializable;

public class CheckpointStyle implements Serializable {
    private Object borderWidth;
    private Object symbol;
    private Object symbolSize;
    private Label label;
    private String color;
    private String borderColor;

    public Object borderWidth() { return this.borderWidth; }

    public CheckpointStyle borderWidth(Object borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Object symbol() { return this.symbol; }

    public CheckpointStyle symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() { return this.symbolSize; }

    public CheckpointStyle symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Label label() {
        if (this.label == null) this.label = new Label();
        return this.label;
    }

    public CheckpointStyle label(Label label) {
        this.label = label;
        return this;
    }

    public String color() { return this.color; }

    public CheckpointStyle color(String color) {
        this.color = color;
        return this;
    }

    public String borderColor() { return this.borderColor; }

    public CheckpointStyle borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Object getBorderWidth() { return borderWidth; }

    public void setBorderWidth(Object borderWidth) { this.borderWidth = borderWidth; }

    public Object getSymbol() { return symbol; }

    public void setSymbol(Object symbol) { this.symbol = symbol; }

    public Object getSymbolSize() { return symbolSize; }

    public void setSymbolSize(Object symbolSize) { this.symbolSize = symbolSize; }

    public Label getLabel() { return label; }

    public void setLabel(Label label) { this.label = label; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getBorderColor() { return borderColor; }

    public void setBorderColor(String borderColor) { this.borderColor = borderColor; }
}
