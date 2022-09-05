package com.jnt.echarts.options.axis;

import com.jnt.echarts.options.style.AreaStyle;

public class SplitArea implements java.io.Serializable {
    private AreaStyle areaStyle;
    private Boolean show;

    public SplitArea areaStyle(AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
        return this;
    }

    public AreaStyle areaStyle() {
        if (this.areaStyle == null) this.areaStyle = new AreaStyle();
        return this.areaStyle;
    }

    public Boolean show() { return this.show; }

    public SplitArea show(Boolean show) {
        this.show = show;
        return this;
    }
}
