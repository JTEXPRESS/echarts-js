package com.jnt.echarts.options;

import com.jnt.echarts.options.code.Align;
import com.jnt.echarts.options.code.Orient;
import com.jnt.echarts.options.code.SelectMode;
import com.jnt.echarts.options.code.Symbol;
import com.jnt.echarts.options.code.VisualMapType;
import com.jnt.echarts.options.style.TextStyle;

public class VisualMap extends Basic<VisualMap> {
    private VisualMapType type;
    private VisualMapType inRange;
    private VisualMapType outOfRange;
    private Align align;
    private Align handlePosition;
    private SelectMode selectedMode;
    private Symbol itemSymbol;
    private Orient orient;
    private Object dimension;
    private Object[] color;
    private Object[] text;
    private Object[] textGap;
    private Object[] pieces;
    private Object[] categories;
    private TextStyle textStyle;
    private String formatter;
    private Integer min;
    private Integer max;
    private Integer itemWidth;
    private Integer itemHeight;
    private Integer precision;
    private Integer seriesIndex;
    private Integer splitNumber;
    private Boolean realtime;
    private Boolean calculable;
    private Boolean inverse;

    public VisualMapType type() { return this.type; }

    public VisualMap type(VisualMapType type) {
        this.type = type;
        return this;
    }

    public VisualMapType inRange() { return this.inRange; }

    public VisualMap inRange(VisualMapType inRange) {
        this.inRange = inRange;
        return this;
    }

    public VisualMapType outOfRange() { return this.outOfRange; }

    public VisualMap outOfRange(VisualMapType outOfRange) {
        this.outOfRange = outOfRange;
        return this;
    }

    public Align align() { return this.align; }

    public VisualMap align(Align align) {
        this.align = align;
        return this;
    }

    public Align handlePosition() { return this.handlePosition; }

    public VisualMap handlePosition(Align handlePosition) {
        this.handlePosition = handlePosition;
        return this;
    }

    public SelectMode selectedMode() { return this.selectedMode; }

    public VisualMap selectedMode(SelectMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public Symbol itemSymbol() { return this.itemSymbol; }

    public VisualMap itemSymbol(Symbol itemSymbol) {
        this.itemSymbol = itemSymbol;
        return this;
    }

    public Orient orient() { return this.orient; }

    public VisualMap orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public Object dimension() { return this.dimension; }

    public VisualMap dimension(Object dimension) {
        this.dimension = dimension;
        return this;
    }

    public Object[] color() { return this.color; }

    public VisualMap color(Object[] color) {
        this.color = color;
        return this;
    }

    public Object[] text() { return this.text; }

    public VisualMap text(Object[] text) {
        this.text = text;
        return this;
    }

    public Object[] textGap() { return this.textGap; }

    public VisualMap textGap(Object[] textGap) {
        this.textGap = textGap;
        return this;
    }

    public Object[] pieces() { return this.pieces; }

    public VisualMap pieces(Object[] pieces) {
        this.pieces = pieces;
        return this;
    }

    public Object[] categories() { return this.categories; }

    public VisualMap categories(Object[] categories) {
        this.categories = categories;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public VisualMap textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public String formatter() { return this.formatter; }

    public VisualMap formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public Integer min() { return this.min; }

    public VisualMap min(Integer min) {
        this.min = min;
        return this;
    }

    public Integer max() { return this.max; }

    public VisualMap max(Integer max) {
        this.max = max;
        return this;
    }

    public Integer itemWidth() { return this.itemWidth; }

    public VisualMap itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public Integer itemHeight() { return this.itemHeight; }

    public VisualMap itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    public Integer precision() { return this.precision; }

    public VisualMap precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public Integer seriesIndex() { return this.seriesIndex; }

    public VisualMap seriesIndex(Integer seriesIndex) {
        this.seriesIndex = seriesIndex;
        return this;
    }

    public Integer splitNumber() { return this.splitNumber; }

    public VisualMap splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public Boolean realtime() { return this.realtime; }

    public VisualMap realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    public Boolean calculable() { return this.calculable; }

    public VisualMap calculable(Boolean calculable) {
        this.calculable = calculable;
        return this;
    }

    public Boolean inverse() { return this.inverse; }

    public VisualMap inverse(Boolean inverse) {
        this.inverse = inverse;
        return this;
    }
}
