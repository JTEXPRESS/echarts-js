package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.ColorMappingBy;
import com.jnt.echarts.options.code.NodeClick;
import com.jnt.echarts.options.code.Roam;
import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.series.other.Level;
import com.jnt.echarts.options.style.Breadcrumb;

public class Treemap extends Series<Treemap> {
    private Object roam;
    private Object nodeClick;
    private Object colorMappingBy;
    private Object[] center;
    private Object[] size;
    private Object[] color;
    private Object[] colorAlpha;
    private Breadcrumb breadcrumb;
    private Level[] levels;
    private String root;
    private Integer visualDimension;
    private Double visibleMin;
    private Double childrenVisibleMin;
    private Double squareRatio;
    private Double zoomToNodeRatio;
    private Double colorSaturation;

    public Treemap() { this.type(SeriesType.treemap); }

    public Treemap(String name) {
        super(name);
        this.type(SeriesType.treemap);
    }

    public Object roam() { return this.roam; }

    public Treemap roam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    public Treemap roam(Roam roam) {
        this.roam = roam;
        return this;
    }

    public Treemap roam(Object roam) {
        this.roam = roam;
        return this;
    }

    public Object nodeClick() { return this.nodeClick; }

    public Treemap nodeClick(Object nodeClick) {
        this.nodeClick = nodeClick;
        return this;
    }

    public Treemap nodeClick(Boolean nodeClick) {
        this.nodeClick = nodeClick;
        return this;
    }

    public Treemap nodeClick(NodeClick nodeClick) {
        this.nodeClick = nodeClick;
        return this;
    }

    public Object colorMappingBy() { return this.colorMappingBy; }

    public Treemap colorMappingBy(Object colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
        return this;
    }

    public Treemap colorMappingBy(ColorMappingBy colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
        return this;
    }

    public Object[] center() {
        if (this.center == null) this.center = new Object[2];
        return this.center;
    }

    public Treemap center(Object val1, Object val2) {
        this.center = new Object[2];
        this.center[0] = val1;
        this.center[1] = val2;
        return this;
    }

    public Object[] size() {
        if (this.size == null) this.size = new Object[2];
        return this.size;
    }

    public Treemap size(Object val1, Object val2) {
        this.size = new Object[2];
        this.size[0] = val1;
        this.size[1] = val2;
        return this;
    }

    public Object[] color() { return this.color; }

    public Treemap color(Object[] color) {
        this.color = color;
        return this;
    }

    public Object[] colorAlpha() { return this.colorAlpha; }

    public Treemap colorAlpha(Object[] colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    public Breadcrumb breadcrumb() {
        if (this.breadcrumb == null) this.breadcrumb = new Breadcrumb();
        return this.breadcrumb;
    }

    public Treemap breadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
        return this;
    }

    public Level[] levels() { return this.levels; }

    public Treemap levels(Level[] levels) {
        this.levels = levels;
        return this;
    }

    public String root() { return this.root; }

    public Treemap root(String root) {
        this.root = root;
        return this;
    }

    public Integer visualDimension() { return this.visualDimension; }

    public Treemap visualDimension(Integer visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    public Double visibleMin() { return this.visibleMin; }

    public Treemap visibleMin(Double visibleMin) {
        this.visibleMin = visibleMin;
        return this;
    }

    public Double childrenVisibleMin() { return this.childrenVisibleMin; }

    public Treemap childrenVisibleMin(Double childrenVisibleMin) {
        this.childrenVisibleMin = childrenVisibleMin;
        return this;
    }

    public Double squareRatio() { return this.squareRatio; }

    public Treemap squareRatio(Double squareRatio) {
        this.squareRatio = squareRatio;
        return this;
    }

    public Double zoomToNodeRatio() { return this.zoomToNodeRatio; }

    public Treemap zoomToNodeRatio(Double zoomToNodeRatio) {
        this.zoomToNodeRatio = zoomToNodeRatio;
        return this;
    }

    public Double colorSaturation() { return this.colorSaturation; }

    public Treemap colorSaturation(Double colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    public Breadcrumb getBreadcrumb() { return breadcrumb; }

    public void setBreadcrumb(Breadcrumb breadcrumb) { this.breadcrumb = breadcrumb; }

    public Level[] getLevels() { return levels; }

    public void setLevels(Level[] levels) { this.levels = levels; }
}
