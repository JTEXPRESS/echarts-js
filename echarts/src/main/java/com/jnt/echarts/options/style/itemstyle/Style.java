package com.jnt.echarts.options.style.itemstyle;

import com.jnt.echarts.options.Label;
import com.jnt.echarts.options.LabelLine;
import com.jnt.echarts.options.code.Position;
import com.jnt.echarts.options.style.AreaStyle;
import com.jnt.echarts.options.style.ChordStyle;
import com.jnt.echarts.options.style.ItemStyle;
import com.jnt.echarts.options.style.LineStyle;
import com.jnt.echarts.options.style.LinkStyle;
import com.jnt.echarts.options.style.NodeStyle;
import com.jnt.echarts.options.style.TextStyle;

import java.io.Serializable;

@SuppressWarnings("unchecked")
public abstract class Style<T> implements Serializable {
    private Position position;
    private Label label;
    private LabelLine labelLine;
    private ItemStyle itemStyle;
    private LineStyle lineStyle;
    private AreaStyle areaStyle;
    private ChordStyle chordStyle;
    private NodeStyle nodeStyle;
    private LinkStyle linkStyle;
    private TextStyle textStyle;
    private String color;
    private String color0;
    private String borderColor;
    private String barBorderColor;
    private String shadowColor;
    private String formatter;
    private Integer borderRadius;
    private Integer borderWidth;
    private Integer barBorderRadius;
    private Integer barBorderWidth;
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private Double opacity;
    private Double curveness;
    private Boolean show;

    public Position position() { return this.position; }

    public T position(Position position) {
        this.position = position;
        return (T) this;
    }

    public Label label() {
        if (this.label == null) this.label = new Label();
        return this.label;
    }

    public T label(Label label) {
        this.label = label;
        return (T) this;
    }

    public LabelLine labelLine() {
        if (this.labelLine == null) this.labelLine = new LabelLine();
        return this.labelLine;
    }

    public T labelLine(LabelLine labelLine) {
        this.labelLine = labelLine;
        return (T) this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null)  this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public T itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return (T) this;
    }

    public LineStyle lineStyle() {
        if (this.lineStyle == null) this.lineStyle = new LineStyle();
        return this.lineStyle;
    }

    public T lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return (T) this;
    }

    public AreaStyle areaStyle() {
        if (this.areaStyle == null) this.areaStyle = new AreaStyle();
        return this.areaStyle;
    }

    public T areaStyle(AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
        return (T) this;
    }

    public ChordStyle chordStyle() {
        if (this.chordStyle == null) this.chordStyle = new ChordStyle();
        return this.chordStyle;
    }

    public T chordStyle(ChordStyle chordStyle) {
        this.chordStyle = chordStyle;
        return (T) this;
    }

    public NodeStyle nodeStyle() {
        if (this.nodeStyle == null) this.nodeStyle = new NodeStyle();
        return this.nodeStyle;
    }

    public T nodeStyle(NodeStyle nodeStyle) {
        this.nodeStyle = nodeStyle;
        return (T) this;
    }

    public LinkStyle linkStyle() {
        if (this.linkStyle == null) this.linkStyle = new LinkStyle();
        return this.linkStyle;
    }

    public T linkStyle(LinkStyle linkStyle) {
        this.linkStyle = linkStyle;
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

    public String color0() { return this.color0; }

    public T color0(String color0) {
        this.color0 = color0;
        return (T) this;
    }

    public String borderColor() { return this.borderColor; }

    public T borderColor(String borderColor) {
        this.borderColor = borderColor;
        return (T) this;
    }

    public String barBorderColor() { return this.barBorderColor; }

    public T barBorderColor(String barBorderColor) {
        this.barBorderColor = barBorderColor;
        return (T) this;
    }

    public String shadowColor() { return this.shadowColor; }

    public T shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return (T) this;
    }

    public String formatter() { return this.formatter; }

    public T formatter(String formatter) {
        this.formatter = formatter;
        return (T) this;
    }

    public Integer borderRadius() { return this.borderRadius; }

    public T borderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return (T) this;
    }

    public Integer borderWidth() { return this.borderWidth; }

    public T borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return (T) this;
    }

    public Integer barBorderRadius() { return this.barBorderRadius; }

    public T barBorderRadius(Integer barBorderRadius) {
        this.barBorderRadius = barBorderRadius;
        return (T) this;
    }

    public Integer barBorderWidth() { return this.barBorderWidth; }

    public T barBorderWidth(Integer barBorderWidth) {
        this.barBorderWidth = barBorderWidth;
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

    public Double opacity() { return this.opacity; }

    public T opacity(Double opacity) {
        this.opacity = opacity;
        return (T) this;
    }

    public Double curveness() { return this.curveness; }

    public T curveness(Double curveness) {
        this.curveness = curveness;
        return (T) this;
    }

    public Boolean show() { return this.show; }

    public T show(Boolean show) {
        this.show = show;
        return (T) this;
    }

    public Position getPosition() { return position; }

    public void setPosition(Position position) { this.position = position; }

    public Label getLabel() { return label; }

    public void setLabel(Label label) { this.label = label; }

    public LabelLine getLabelLine() { return labelLine; }

    public void setLabelLine(LabelLine labelLine) { this.labelLine = labelLine; }

    public ItemStyle getItemStyle() { return itemStyle; }

    public void setItemStyle(ItemStyle itemStyle) { this.itemStyle = itemStyle; }

    public LineStyle getLineStyle() { return lineStyle; }

    public void setLineStyle(LineStyle lineStyle) { this.lineStyle = lineStyle; }

    public AreaStyle getAreaStyle() { return areaStyle; }

    public void setAreaStyle(AreaStyle areaStyle) { this.areaStyle = areaStyle; }

    public ChordStyle getChordStyle() { return chordStyle; }

    public void setChordStyle(ChordStyle chordStyle) { this.chordStyle = chordStyle; }

    public NodeStyle getNodeStyle() { return nodeStyle; }

    public void setNodeStyle(NodeStyle nodeStyle) { this.nodeStyle = nodeStyle; }

    public LinkStyle getLinkStyle() { return linkStyle; }

    public void setLinkStyle(LinkStyle linkStyle) { this.linkStyle = linkStyle; }

    public TextStyle getTextStyle() { return textStyle; }

    public void setTextStyle(TextStyle textStyle) { this.textStyle = textStyle; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getColor0() { return color0; }

    public void setColor0(String color0) { this.color0 = color0; }

    public String getBorderColor() { return borderColor; }

    public void setBorderColor(String borderColor) { this.borderColor = borderColor; }

    public String getBarBorderColor() { return barBorderColor; }

    public void setBarBorderColor(String barBorderColor) { this.barBorderColor = barBorderColor; }

    public String getShadowColor() { return shadowColor; }

    public void setShadowColor(String shadowColor) { this.shadowColor = shadowColor; }

    public String getFormatter() { return formatter; }

    public void setFormatter(String formatter) { this.formatter = formatter; }

    public Integer getBorderRadius() { return borderRadius; }

    public void setBorderRadius(Integer borderRadius) { this.borderRadius = borderRadius; }

    public Integer getBorderWidth() { return borderWidth; }

    public void setBorderWidth(Integer borderWidth) { this.borderWidth = borderWidth; }

    public Integer getBarBorderRadius() { return barBorderRadius; }

    public void setBarBorderRadius(Integer barBorderRadius) { this.barBorderRadius = barBorderRadius; }

    public Integer getBarBorderWidth() { return barBorderWidth; }

    public void setBarBorderWidth(Integer barBorderWidth) { this.barBorderWidth = barBorderWidth; }

    public Integer getShadowBlur() { return shadowBlur; }

    public void setShadowBlur(Integer shadowBlur) { this.shadowBlur = shadowBlur; }

    public Integer getShadowOffsetX() { return shadowOffsetX; }

    public void setShadowOffsetX(Integer shadowOffsetX) { this.shadowOffsetX = shadowOffsetX; }

    public Integer getShadowOffsetY() { return shadowOffsetY; }

    public void setShadowOffsetY(Integer shadowOffsetY) { this.shadowOffsetY = shadowOffsetY; }

    public Double getOpacity() { return opacity; }

    public void setOpacity(Double opacity) { this.opacity = opacity; }

    public void setCurveness(Double curveness) { this.curveness = curveness; }

    public Double getCurveness() { return curveness; }

    public Boolean getShow() { return show; }

    public void setShow(Boolean show) { this.show = show; }
}
