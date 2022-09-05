package com.jnt.echarts.options;

import com.jnt.echarts.options.code.Align;
import com.jnt.echarts.options.code.LegendIcon;
import com.jnt.echarts.options.code.LegendType;
import com.jnt.echarts.options.code.Orient;
import com.jnt.echarts.options.style.TextStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class Legend extends Basic<Legend> implements Data<Legend>, Component {
    private List data;
    private Map<String, Boolean> selected;
    private Orient orient;
    private LegendType type;
    private LegendIcon icon;
    private Align align;
    private Object selectedMode;
    private TextStyle textStyle;
    private TextStyle pageTextStyle;
    private String pageIconColor;
    private String pageIconInactiveColor;
    private String formatter;
    private Integer itemWidth;
    private Integer itemHeight;

    public Legend() {}

    public Legend(Object... values) { this.data(values); }

    public List data() {
        if (this.data == null) this.data = new ArrayList();
        return this.data;
    }

    public Legend data(List data) {
        this.data = data;
        return this;
    }

    public Legend data(Object... values) {
        if (values == null || values.length == 0) return this;
        this.data().addAll(Arrays.asList(values));
        return this;
    }

    public Boolean selected(String name) {
        if (this.selected == null) return null;
        else return selected.get(name);
    }

    public Legend selected(String name, Boolean selected) {
        if (!this.data.contains(name)) throw new RuntimeException("Legend doest not contain name as" + name + "for legend");
        if (this.selected == null) this.selected = new LinkedHashMap<>();
        this.selected.put(name, selected);
        return this;
    }

    public Orient orient() { return this.orient; }

    public Legend orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public LegendType type(){ return this.type; }

    public Legend type(LegendType type) {
        this.type = type;
        return this;
    }

    public LegendIcon icon(){ return this.icon; }

    public Legend icon(LegendIcon icon) {
        this.icon = icon;
        return this;
    }

    public Align align() { return this.align; }

    public Legend align(Align align) {
        this.align = align;
        return this;
    }

    public Object selectedMode() { return this.selectedMode; }

    public Legend selectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public Legend textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public TextStyle pageTextStyle() {
        if (this.pageTextStyle == null) this.pageTextStyle = new TextStyle();
        return this.pageTextStyle;
    }

    public Legend pageTextStyle(TextStyle pageTextStyle) {
        this.pageTextStyle = pageTextStyle;
        return this;
    }

    public String pageIconColor() { return this.pageIconColor; }

    public Legend pageIconColor(String pageIconColor) {
        this.pageIconColor = pageIconColor;
        return this;
    }

    public String pageIconInactiveColor() { return this.pageIconInactiveColor; }

    public Legend pageIconInactiveColor(String pageIconInactiveColor) {
        this.pageIconInactiveColor = pageIconInactiveColor;
        return this;
    }

    public String formatter() { return this.formatter; }

    public Legend formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public Integer itemWidth() { return this.itemWidth; }

    public Legend itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public Integer itemHeight() { return this.itemHeight; }

    public Legend itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }
}
