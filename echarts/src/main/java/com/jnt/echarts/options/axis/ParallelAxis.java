package com.jnt.echarts.options.axis;

import com.jnt.echarts.options.code.AxisType;
import com.jnt.echarts.options.code.NameLocation;
import com.jnt.echarts.options.style.AreaSelectStyle;
import com.jnt.echarts.options.style.NameTextStyle;

public class ParallelAxis extends Axis<ParallelAxis> {
    private NameLocation nameLocation;
    private NameTextStyle nameTextStyle;
    private AreaSelectStyle areaSelectStyle;
    private Integer dim;
    private Integer parallelIndex;
    private Integer splitNumber;

    public ParallelAxis() { this.type(AxisType.value); }

    public NameLocation nameLocation() { return this.nameLocation; }

    public ParallelAxis nameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return this;
    }

    public NameTextStyle nameTextStyle() {
        if (this.nameTextStyle == null) this.nameTextStyle = new NameTextStyle();
        return this.nameTextStyle;
    }

    public ParallelAxis nameTextStyle(NameTextStyle nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
        return this;
    }

    public AreaSelectStyle areaSelectStyle() {
        if (this.areaSelectStyle == null) this.areaSelectStyle = new AreaSelectStyle();
        return this.areaSelectStyle;
    }

    public ParallelAxis areaSelectStyle(AreaSelectStyle areaSelectStyle) {
        this.areaSelectStyle = areaSelectStyle;
        return this;
    }

    public Integer dim() { return this.dim; }

    public ParallelAxis dim(Integer dim) {
        this.dim = dim;
        return this;
    }

    public Integer parallelIndex() { return this.parallelIndex; }

    public ParallelAxis parallelIndex(Integer parallelIndex) {
        this.parallelIndex = parallelIndex;
        return this;
    }

    public Integer splitNumber() { return this.splitNumber; }

    public ParallelAxis splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }
}
