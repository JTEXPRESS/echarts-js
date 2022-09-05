package com.jnt.echarts.options;

import com.jnt.echarts.options.code.Orient;
import com.jnt.echarts.options.code.SelectMode;
import com.jnt.echarts.options.data.RangeData;
import com.jnt.echarts.options.style.TextStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataRange extends Basic<DataRange> implements Component {
    private List<RangeData> splitList;
    private List<String> text;
    private List<String> color;
    private Orient orient;
    private Object selectedMode;
    private Object formatter;
    private TextStyle textStyle;
    private RangeData range;
    private Integer itemWidth;
    private Integer itemHeight;
    private Integer min;
    private Integer max;
    private Integer precision;
    private Integer splitNumber;
    private Boolean calculable;
    private Boolean realtime;
    private Boolean hoverLink;

    public List<RangeData> splitList() {
        if (this.splitList == null)  this.splitList = new ArrayList<>();
        return this.splitList;
    }

    public DataRange splitList(RangeData... splitList) {
        if (splitList == null || splitList.length == 0) return this;
        this.splitList().addAll(Arrays.asList(splitList));
        return this;
    }

    public List<String> text() {
        if (this.text == null) this.text = new ArrayList<String>();
        return this.text;
    }

    public DataRange text(List<String> text) {
        this.text = text;
        return this;
    }

    public DataRange text(String... texts) {
        if (texts == null || texts.length == 0) return this;
        this.text().addAll(Arrays.asList(texts));
        return this;
    }

    public List<String> color() {
        if (this.color == null) this.color = new ArrayList<String>();
        return this.color;
    }

    public DataRange color(List<String> color) {
        this.color = color;
        return this;
    }

    public DataRange color(String... colors) {
        if (colors == null || colors.length == 0) return this;
        this.color().addAll(Arrays.asList(colors));
        return this;
    }

    public Orient orient() { return this.orient; }

    public DataRange orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public Object selectedMode() { return this.selectedMode; }

    public DataRange selectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public DataRange selectedMode(SelectMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public Object formatter() { return this.formatter; }

    public DataRange formatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public DataRange textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public RangeData range() { return this.range; }

    public DataRange range(RangeData range) {
        this.range = range;
        return this;
    }

    public Integer itemWidth() { return this.itemWidth; }

    public DataRange itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public Integer itemHeight() { return this.itemHeight; }

    public DataRange itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    public Integer min() { return this.min; }

    public DataRange min(Integer min) {
        this.min = min;
        return this;
    }

    public Integer max() { return this.max; }

    public DataRange max(Integer max) {
        this.max = max;
        return this;
    }

    public Integer precision() { return this.precision; }

    public DataRange precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public Integer splitNumber() { return this.splitNumber; }

    public DataRange splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public Boolean calculable() { return this.calculable; }

    public DataRange calculable(Boolean calculable) {
        this.calculable = calculable;
        return this;
    }

    public Boolean realtime() { return this.realtime; }

    public DataRange realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    public Boolean hoverLink() { return this.hoverLink; }

    public DataRange hoverLink(Boolean hoverLink) {
        this.hoverLink = hoverLink;
        return this;
    }
}
