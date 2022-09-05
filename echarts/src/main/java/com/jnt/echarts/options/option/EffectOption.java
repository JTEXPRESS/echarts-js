package com.jnt.echarts.options.option;

import com.jnt.echarts.options.style.TextStyle;

public class EffectOption {
    private Object effect;
	private TextStyle textStyle;
    private Integer progress;

	public Object effect() { return this.effect; }

	public EffectOption effect(Object effect) {
        this.effect = effect;
        return this;
    }

	public TextStyle textStyle() {
		if (this.textStyle == null) this.textStyle = new TextStyle();
		return this.textStyle;
	}

	public EffectOption textStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}

	public Integer progress() { return this.progress; }

	public EffectOption progress(Integer progress) {
        this.progress = progress;
        return this;
    }
}
