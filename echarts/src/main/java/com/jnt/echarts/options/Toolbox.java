package com.jnt.echarts.options;

import com.jnt.echarts.options.code.Orient;
import com.jnt.echarts.options.code.Tool;
import com.jnt.echarts.options.feature.Feature;
import com.jnt.echarts.options.style.ItemStyle;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Toolbox extends Basic<Toolbox> implements Component {
    private List<Object> color;
    private Map<String, Feature> feature;
    private Orient orient;
    private ItemStyle iconStyle;
    private String effectiveColor;
    private String disableColor;
    private Integer itemSize;
    private Boolean showTitle;

    public List<Object> color() {
        if (this.color == null) this.color = new ArrayList<>();
        return this.color;
    }

    public Toolbox color(List<Object> color) {
        this.color = color;
        return this;
    }

    public Map<String, Feature> feature() {
        if (this.feature == null) this.feature = new LinkedHashMap<>();
        return this.feature;
    }

    public Toolbox feature(Object... values) {
        if (values == null && values.length == 0) return this;
        if (this.feature == null) {
            this.feature = new LinkedHashMap<>();
        }

        for (Object t : values) {
            if (t instanceof Feature) _addFeature((Feature) t);
            else if (t instanceof Tool) {
                switch ((Tool) t) {
                    case dataView:
                        _addFeatureOnce(t, Feature.dataView);
                        break;
                    case dataZoom:
                        _addFeatureOnce(t, Feature.dataZoom);
                        break;
                    case magicType:
                        _addFeatureOnce(t, Feature.magicType);
                        break;
                    case mark:
                        _addFeatureOnce(t, Feature.mark);
                        break;
                    case restore:
                        _addFeatureOnce(t, Feature.restore);
                        break;
                    case saveAsImage:
                        _addFeatureOnce(t, Feature.saveAsImage);
                        break;
                    default:
                }
            }
        }
        return this;
    }

    public Orient orient() { return this.orient; }

    public Toolbox orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public ItemStyle iconStyle() { return this.iconStyle; }

    public Toolbox iconStyle(ItemStyle iconStyle) {
        this.iconStyle = iconStyle;
        return this;
    }

    public String effectiveColor() { return this.effectiveColor; }

    public Toolbox effectiveColor(String effectiveColor) {
        this.effectiveColor = effectiveColor;
        return this;
    }

    public String disableColor() { return this.disableColor; }

    public Toolbox disableColor(String disableColor) {
        this.disableColor = disableColor;
        return this;
    }

    public Integer itemSize() { return this.itemSize; }

    public Toolbox itemSize(Integer itemSize) {
        this.itemSize = itemSize;
        return this;
    }

    public Boolean showTitle() { return this.showTitle; }

    public Toolbox showTitle(Boolean showTitle) {
        this.showTitle = showTitle;
        return this;
    }

    private Toolbox _addFeature(Feature value) {
        if (value == null) return this;

        String name = value.getClass().getSimpleName();
        name        = name.substring(0, 1).toLowerCase() + name.substring(1);

        _addFeatureOnce(name, value);
        return this;
    }

    private void _addFeatureOnce(Object name, Feature feature) {
        String _name = String.valueOf(name);

        if (!this.feature().containsKey(_name)) this.feature().put(_name, feature);
    }
}
