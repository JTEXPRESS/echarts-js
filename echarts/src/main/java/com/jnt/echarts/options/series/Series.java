package com.jnt.echarts.options.series;

import com.jnt.echarts.options.AbstractData;
import com.jnt.echarts.options.Chart;
import com.jnt.echarts.options.Tooltip;
import com.jnt.echarts.options.code.CoordinateSystem;
import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.code.Symbol;
import com.jnt.echarts.options.code.X;
import com.jnt.echarts.options.code.Y;
import com.jnt.echarts.options.style.ItemStyle;
import com.jnt.echarts.options.style.itemstyle.Emphasis;

@SuppressWarnings("unchecked")
public abstract class Series<T> extends AbstractData<T> implements Chart {
    private SeriesType type;
    private Object width;
    private Object height;
    private Object left;
    private Object top;
    private Object right;
    private Object bottom;
    private Object coordinateSystem;
    private Object symbol;
    private Object symbolSize;
    private Object symbolRoate;
    private Object[] symbolOffset;
    private Tooltip tooltip;
    private ItemStyle itemStyle;
    private ItemStyle label;
    private Emphasis emphasis;
    private MarkPoint markPoint;
    private MarkLine markLine;
    private String name;
    private String stack;
    private Integer z;
    private Integer zlevel;
    private Integer xAxisIndex;
    private Integer yAxisIndex;
    private Integer geoIndex;
    private Boolean calculable;
    private Boolean silent;
    private Boolean legendHoverLink;
    private Boolean showSymbol;

    protected Series() {}

    protected Series(String name) { this.name = name; }

    public SeriesType type() { return this.type; }

    public T type(SeriesType type) {
        this.type = type;
        return (T) this;
    }

    public Object width() { return this.width; }

    public T width(Object width) {
        this.width = width;
        return (T) this;
    }

    public T width(Integer width) {
        this.width = width;
        return (T) this;
    }

    public Object height() { return this.height; }

    public T height(Object height) {
        this.height = height;
        return (T) this;
    }

    public T height(Integer height) {
        this.height = height;
        return (T) this;
    }

    public Object left() { return this.left; }

    public T left(Object left) {
        this.left = left;
        return (T) this;
    }

    public T left(Integer left) {
        this.left = left;
        return (T) this;
    }

    public T left(X left) {
        this.left = left;
        return (T) this;
    }

    public Object top() { return this.top; }

    public T top(Object top) {
        this.top = top;
        return (T) this;
    }

    public T top(Integer top) {
        this.top = top;
        return (T) this;
    }

    public T top(Y top) {
        this.top = top;
        return (T) this;
    }

    public Object right() { return this.right; }

    public T right(Object right) {
        this.right = right;
        return (T) this;
    }

    public T right(Integer right) {
        this.right = right;
        return (T) this;
    }

    public Object bottom() { return this.bottom; }

    public T bottom(Object bottom) {
        this.bottom = bottom;
        return (T) this;
    }

    public T bottom(Integer bottom) {
        this.bottom = bottom;
        return (T) this;
    }

    public Object coordinateSystem() { return this.coordinateSystem; }

    public T coordinateSystem(Object coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
        return (T) this;
    }

    public T coordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
        return (T) this;
    }

    public Object symbol() { return this.symbol; }

    public T symbol(Object symbol) {
        this.symbol = symbol;
        return (T) this;
    }

    public T symbol(Symbol symbol) {
        this.symbol = symbol;
        return (T) this;
    }

    public Object symbolSize() { return this.symbolSize; }

    public T symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return (T) this;
    }

    public Object symbolRoate() { return this.symbolRoate; }

    public T symbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return (T) this;
    }

    public Object[] symbolOffset() { return this.symbolOffset; }

    public T symbolOffset(Object[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return (T) this;
    }

    public T symbolOffset(Object o1, Object o2) {
        this.symbolOffset = new Object[]{o1, o2};
        return (T) this;
    }

    public Tooltip tooltip() {
        if (this.tooltip == null) this.tooltip = new Tooltip();
        return this.tooltip;
    }

    public Series tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public Series itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public ItemStyle label() {
        if (this.label == null) this.label = new ItemStyle();
        return this.label;
    }

    public Emphasis emphasis() {
        if (this.emphasis == null) this.emphasis = new Emphasis();
        return this.emphasis;
    }

    public T label(ItemStyle label) {
        this.label = label;
        return (T) this;
    }

    public T emphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
        return (T) this;
    }

    public MarkPoint markPoint() {
        if (this.markPoint == null) this.markPoint = new MarkPoint();
        return this.markPoint;
    }

    public Series markPoint(MarkPoint markPoint) {
        this.markPoint = markPoint;
        return this;
    }

    public MarkLine markLine() {
        if (this.markLine == null) this.markLine = new MarkLine();
        return this.markLine;
    }

    public Series markLine(MarkLine markLine) {
        this.markLine = markLine;
        return this;
    }

    public String name() { return this.name; }

    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    public String stack() { return this.stack; }

    public T stack(String stack) {
        this.stack = stack;
        return (T) this;
    }

    public Integer z() { return this.z; }

    public T z(Integer z) {
        this.z = z;
        return (T) this;
    }

    public Integer zlevel() { return this.zlevel; }

    public T zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return (T) this;
    }

    public Integer xAxisIndex() { return this.xAxisIndex; }

    public T xAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return (T) this;
    }

    public Integer yAxisIndex() { return this.yAxisIndex; }

    public T yAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return (T) this;
    }

    public Integer geoIndex() { return this.geoIndex; }

    public T geoIndex(Integer geoIndex) {
        this.geoIndex = geoIndex;
        return (T) this;
    }

    public Boolean calculable() { return this.calculable; }

    public T calcuable(Boolean calculable) {
        this.calculable = calculable;
        return (T) this;
    }

    public Boolean silent() { return this.silent; }

    public T silent(Boolean silent) {
        this.silent = silent;
        return (T) this;
    }

    public Boolean legendHoverLink() { return this.legendHoverLink; }

    public T legendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
        return (T) this;
    }

    public Boolean showSymbol() { return this.showSymbol; }

    public T showSymbol(Boolean showSymbol) {
        this.showSymbol = showSymbol;
        return (T) this;
    }
}
