package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.EffectType;
import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.code.ShowEffectOn;
import com.jnt.echarts.options.series.other.RippleEffect;

public class EffectScatter extends Series<EffectScatter> {
    private Object effectType;
    private Object showEffectOn;
    private RippleEffect rippleEffect;

    public EffectScatter() { this.type(SeriesType.effectScatter); }

    public EffectScatter(String name) {
        super(name);
        this.type(SeriesType.effectScatter);
    }

    public Object effectType() { return this.effectType; }

    public EffectScatter effectType(Object effectType) {
        this.effectType = effectType;
        return this;
    }

    public EffectScatter effectType(EffectType effectType) {
        this.effectType = effectType;
        return this;
    }

    public Object showEffectOn() { return this.showEffectOn; }

    public EffectScatter showEffectOn(Object showEffectOn) {
        this.showEffectOn = showEffectOn;
        return this;
    }

    public EffectScatter showEffectOn(ShowEffectOn showEffectOn) {
        this.showEffectOn = showEffectOn;
        return this;
    }

    public RippleEffect rippleEffect() { return this.rippleEffect; }

    public EffectScatter rippleEffect(RippleEffect rippleEffect) {
        this.rippleEffect = rippleEffect;
        return this;
    }

}
