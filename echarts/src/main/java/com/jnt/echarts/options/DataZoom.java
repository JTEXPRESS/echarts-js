package com.jnt.echarts.options;

import com.jnt.echarts.options.code.DataZoomType;
import com.jnt.echarts.options.code.FilterMode;
import com.jnt.echarts.options.code.Orient;
import com.jnt.echarts.options.style.TextStyle;

import java.util.Date;

public class DataZoom extends Basic<DataZoom> implements Component {
    private DataZoomType type;
    private FilterMode filterMode;
    private Orient orient;
    private Object startValue;
    private Object endValue;
    private Object minValueSpan;
    private Object xAxisIndex;
    private Object yAxisIndex;
    private Object angleAxisIndex;
    private Object radiusAxisIndex;
    private Object labelFormatter;
    private TextStyle textStyle;
    private String dataBackgroundColor;
    private String fillerColor;
    private String handleColor;
    private String labelPrecision;
    private String showDataShadow;
    private Integer start;
    private Integer end;
    private Integer handleSize;
    private Integer throttle;
    private Boolean realtime;
    private Boolean zoomLock;
    private Boolean showDetail;

    public DataZoomType type() { return this.type; }

    public DataZoom type(DataZoomType type) {
        this.type = type;
        return this;
    }

    public FilterMode filterMode() { return this.filterMode; }

    public DataZoom filterMode(FilterMode filterMode) {
        this.filterMode = filterMode;
        return this;
    }

    public Orient orient() { return this.orient; }

    public DataZoom orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public Object startValue() { return this.startValue; }

    public DataZoom startValue(Object startValue) {
        this.startValue = startValue;
        return this;
    }

    public DataZoom startValue(String startValue) {
        this.startValue = startValue;
        return this;
    }

    public DataZoom startValue(Integer startValue) {
        this.startValue = startValue;
        return this;
    }

    public DataZoom startValue(Date startValue) {
        this.startValue = startValue;
        return this;
    }

    public Object endValue() { return this.endValue; }

    public DataZoom endValue(Object endValue) {
        this.endValue = endValue;
        return this;
    }

    public DataZoom endValue(Integer endValue) {
        this.endValue = endValue;
        return this;
    }

    public DataZoom endValue(String endValue) {
        this.endValue = endValue;
        return this;
    }

    public DataZoom endValue(Date endValue) {
        this.endValue = endValue;
        return this;
    }

    public Object minValueSpan() { return this.minValueSpan; }

    public DataZoom minValueSpan(Object minValueSpan) {
        this.minValueSpan = minValueSpan;
        return this;
    }

    public Object xAxisIndex() { return this.xAxisIndex; }

    public DataZoom xAxisIndex(Object xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    public Object yAxisIndex() { return this.yAxisIndex; }

    public DataZoom yAxisIndex(Object yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public Object angleAxisIndex() { return this.angleAxisIndex; }

    public DataZoom angleAxisIndex(Object angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
        return this;
    }

    public DataZoom angleAxisIndex(Integer angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
        return this;
    }

    public DataZoom angleAxisIndex(Integer... angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
        return this;
    }

    public Object radiusAxisIndex() { return this.radiusAxisIndex; }

    public DataZoom radiusAxisIndex(Object radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
        return this;
    }

    public DataZoom radiusAxisIndex(Integer radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
        return this;
    }

    public DataZoom radiusAxisIndex(Integer... radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
        return this;
    }

    public Object labelFormatter() { return this.labelFormatter; }

    public DataZoom labelFormatter(Object labelFormatter) {
        this.labelFormatter = labelFormatter;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public DataZoom textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public String dataBackgroundColor() { return this.dataBackgroundColor; }

    public DataZoom dataBackgroundColor(String dataBackgroundColor) {
        this.dataBackgroundColor = dataBackgroundColor;
        return this;
    }

    public String fillerColor() { return this.fillerColor; }

    public DataZoom fillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
        return this;
    }

    public String handleColor() { return this.handleColor; }

    public DataZoom handleColor(String handleColor) {
        this.handleColor = handleColor;
        return this;
    }

    public String labelPrecision() { return this.labelPrecision; }

    public DataZoom labelPrecision(String labelPrecision) {
        this.labelPrecision = labelPrecision;
        return this;
    }

    public String showDataShadow() { return this.showDataShadow; }

    public DataZoom showDataShadow(String showDataShadow) {
        this.showDataShadow = showDataShadow;
        return this;
    }

    public Integer start() { return this.start; }

    public DataZoom start(Integer start) {
        this.start = start;
        return this;
    }

    public Integer end() { return this.end; }

    public DataZoom end(Integer end) {
        this.end = end;
        return this;
    }

    public Integer handleSize() { return this.handleSize; }

    public DataZoom handleSize(Integer handleSize) {
        this.handleSize = handleSize;
        return this;
    }

    public Integer throttle() { return this.throttle; }

    public DataZoom throttle(Integer throttle) {
        this.throttle = throttle;
        return this;
    }

    public Boolean realtime() { return this.realtime; }

    public DataZoom realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    public Boolean zoomLock() { return this.zoomLock; }

    public DataZoom zoomLock(Boolean zoomLock) {
        this.zoomLock = zoomLock;
        return this;
    }

    public Boolean showDetail() { return this.showDetail; }

    public DataZoom showDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }
}
