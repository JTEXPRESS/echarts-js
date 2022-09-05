package com.jnt.echarts.options.feature;

import com.jnt.echarts.options.style.LineStyle;
import com.jnt.echarts.options.style.TextStyle;

import java.io.Serializable;

public class Feature implements Serializable {
    public static final DataView dataView       = new DataView();
    public static final DataZoom dataZoom       = new DataZoom();
    public static final Mark mark               = new Mark();
    public static final SaveAsImage saveAsImage = new SaveAsImage();
    public static final MagicType magicType     = new MagicType();
    public static final Restore restore         = new Restore();

    private Object title;
    private Object type;
    private Object lang;
    private LineStyle lineStyle;
    private TextStyle textStyle;
    private String icon;
    private Boolean readOnly;
    private Boolean show;

    public Object title() { return this.title; }

    public Feature title(Object title) {
        this.title = title;
        return this;
    }

    public Object type() { return this.type; }

    public Feature type(Object type) {
        this.type = type;
        return this;
    }

    public Object lang() { return this.lang; }

    public Feature lang(Object lang) {
        this.lang = lang;
        return this;
    }

    public LineStyle lineStyle() { return this.lineStyle; }

    public Feature lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public TextStyle textStyle() { return this.textStyle; }

    public Feature textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public String icon() { return this.icon; }

    public Feature icon(String icon) {
        this.icon = icon;
        return this;
    }

    public Boolean readOnly() { return this.readOnly; }

    public Feature readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Boolean show() { return this.show; }

    public Feature show(Boolean show) {
        this.show = show;
        return this;
    }
}
