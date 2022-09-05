package com.jnt.echarts.options;

import com.jnt.echarts.options.code.X;
import com.jnt.echarts.options.style.TextStyle;

public class Title extends Basic<Title> implements Component {
    private X textAlign;
    private Object offsetCenter;
    private TextStyle textStyle;
    private TextStyle subtextStyle;
    private String text;
    private String link;
    private String target;
    private String subtext;
    private String sublink;
    private String subtarget;

    public X textAlign() { return this.textAlign; }

    public Title textAlign(X textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public Object offsetCenter() { return this.offsetCenter; }

    public Title offsetCenter(Object offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null)  this.textStyle = new TextStyle();
        return this.textStyle;
    }

    public Title textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public TextStyle subtextStyle() {
        if (this.subtextStyle == null) this.subtextStyle = new TextStyle();
        return this.subtextStyle;
    }

    public Title subtextStyle(TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
        return this;
    }

    public String text() { return this.text; }

    public Title text(String text) {
        this.text = text;
        return this;
    }

    public String link() { return this.link; }

    public Title link(String link) {
        this.link = link;
        return this;
    }

    public String target() { return this.target; }

    public Title target(String target) {
        this.target = target;
        return this;
    }

    public String subtext() { return this.subtext; }

    public Title subtext(String subtext) {
        this.subtext = subtext;
        return this;
    }

    public String sublink() { return this.sublink; }

    public Title sublink(String sublink) {
        this.sublink = sublink;
        return this;
    }

    public String subtarget() { return this.subtarget; }

    public Title subtarget(String subtarget) {
        this.subtarget = subtarget;
        return this;
    }
}
