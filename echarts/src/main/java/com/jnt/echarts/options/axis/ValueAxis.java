package com.jnt.echarts.options.axis;

import com.jnt.echarts.options.code.AxisType;
import com.jnt.echarts.options.code.NameLocation;
import com.jnt.echarts.options.style.LineStyle;

public class ValueAxis extends Axis<ValueAxis> {
    private NameLocation nameLocation;
    private LineStyle nameTextStyle;
    private Integer precision;
    private Integer power;
    private Integer splitNumber;

    public ValueAxis() { this.type(AxisType.value); }

    public NameLocation nameLocation() { return this.nameLocation; }

    public ValueAxis nameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return this;
    }

    public LineStyle nameTextStyle() {
        if (this.nameTextStyle == null) this.nameTextStyle = new LineStyle();
        return this.nameTextStyle;
    }

    public ValueAxis nameTextStyle(LineStyle style) {
        this.nameTextStyle = style;
        return this;
    }

    public Integer precision() {
        return this.precision;
    }

    public ValueAxis precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public Integer power() { return this.power; }

    public ValueAxis power(Integer power) {
        this.power = power;
        return this;
    }

    public Integer splitNumber() { return this.splitNumber; }

    public ValueAxis splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

}
