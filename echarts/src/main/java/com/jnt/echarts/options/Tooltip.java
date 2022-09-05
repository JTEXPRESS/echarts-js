package com.jnt.echarts.options;

import com.jnt.echarts.options.code.Position;
import com.jnt.echarts.options.code.Trigger;
import com.jnt.echarts.options.code.TriggerOn;
import com.jnt.echarts.options.style.TextStyle;

public class Tooltip extends Basic<Tooltip> implements Component {
    private Trigger trigger;
    private TriggerOn triggerOn;
    private Object position;
    private Object formatter;
    private AxisPointer axisPointer;
    private TextStyle textStyle;
    private String islandFormatter;
    private Integer borderRadius;
    private Integer showDelay;
    private Integer hideDelay;
    private Double transitionDuration;
    private Boolean enterable;
    private Boolean alwaysShowContent;
    private Boolean confine;
    private Boolean showContent;

    public Trigger trigger() { return this.trigger; }

    public Tooltip trigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public TriggerOn triggerOn() { return this.triggerOn; }

    public Tooltip triggerOn(TriggerOn triggerOn) {
        this.triggerOn = triggerOn;
        return this;
    }

    public Object position() { return this.position; }

    public Tooltip position(Object position) {
        this.position = position;
        return this;
    }

    public Tooltip position(Position position) {
        this.position = position;
        return this;
    }

    public Object formatter() { return this.formatter; }

    public Tooltip formatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    public AxisPointer axisPointer() {
        if (this.axisPointer == null) this.axisPointer = new AxisPointer();
        return this.axisPointer;
    }

    public Tooltip axisPointer(AxisPointer axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public Tooltip textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public String islandFormatter() { return this.islandFormatter; }

    public Tooltip islandFormatter(String islandFormatter) {
        this.islandFormatter = islandFormatter;
        return this;
    }

    public Integer borderRadius() { return this.borderRadius; }

    public Tooltip borderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Integer showDelay() { return this.showDelay; }

    public Tooltip showDelay(Integer showDelay) {
        this.showDelay = showDelay;
        return this;
    }

    public Integer hideDelay() { return this.hideDelay; }

    public Tooltip hideDelay(Integer hideDelay) {
        this.hideDelay = hideDelay;
        return this;
    }

    public Double transitionDuration() { return this.transitionDuration; }

    public Tooltip transitionDuration(Double transitionDuration) {
        this.transitionDuration = transitionDuration;
        return this;
    }

    public Boolean enterable() { return this.enterable; }

    public Tooltip enterable(Boolean enterable) {
        this.enterable = enterable;
        return this;
    }

    public Boolean alwaysShowContent() { return this.alwaysShowContent; }

    public Tooltip alwaysShowContent(Boolean alwaysShowContent) {
        this.alwaysShowContent = alwaysShowContent;
        return this;
    }

    public Boolean confine() { return this.confine; }

    public Tooltip confine(Boolean confine) {
        this.confine = confine;
        return this;
    }

    public Boolean showContent() { return this.showContent; }

    public Tooltip showContent(Boolean showContent) {
        this.showContent = showContent;
        return this;
    }
}
