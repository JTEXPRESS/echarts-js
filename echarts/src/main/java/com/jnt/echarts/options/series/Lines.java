package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.SeriesType;

public class Lines extends Series<Lines> {
    private Effect effect;

    public Lines() { this.type(SeriesType.lines); }

    public Lines(String name) {
        super(name);
        this.type(SeriesType.lines);
    }

    public Effect effect() {
        if (this.effect == null)  this.effect = new Effect();
        return this.effect;
    }

    public Lines effect(Effect effect) {
        this.effect = effect;
        return this;
    }
}
