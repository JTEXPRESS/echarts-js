package com.jnt.echarts.options.option;

import com.jnt.echarts.options.code.LoadingEffect;
import com.jnt.echarts.options.style.TextStyle;

public class NoDataLoadingOption {
    private Object x;
    private Object y;
    private Object effect;
    private TextStyle textStyle;
    private EffectOption effectOption;
    private String text;
    private Integer progress;

    public Object x() { return this.x; }

    public NoDataLoadingOption x(Object x) {
        this.x = x;
        return this;
    }

    public Object y() { return this.y; }

    public NoDataLoadingOption y(Object y) {
        this.y = y;
        return this;
    }

    public Object effect() { return this.effect; }

    public NoDataLoadingOption effect(Object effect) {
        this.effect = effect;
        return this;
    }

    public NoDataLoadingOption effect(LoadingEffect effect) {
        this.effect = effect;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public NoDataLoadingOption textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public EffectOption effectOption() {
        if (this.effectOption == null) this.effectOption = new EffectOption();
        return this.effectOption;
    }

    public NoDataLoadingOption effectOption(EffectOption effectOption) {
        this.effectOption = effectOption;
        return this;
    }

    public String text() { return this.text; }

    public NoDataLoadingOption text(String text) {
        this.text = text;
        return this;
    }

    public Integer progress() { return this.progress; }

    public NoDataLoadingOption progress(Integer progress) {
        this.progress = progress;
        return this;
    }
}
