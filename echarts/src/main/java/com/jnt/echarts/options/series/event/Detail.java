package com.jnt.echarts.options.series.event;

import java.io.Serializable;

public class Detail implements Serializable {
    private String link;
    private String text;
    private String img;

    public Detail() {}

    public Detail(String link, String text) {
        this.link   = link;
        this.text   = text;
    }

    public Detail(String link, String text, String img) {
        this.link   = link;
        this.text   = text;
        this.img    = img;
    }

    public String link() { return this.link; }

    public Detail link(String link) {
        this.link = link;
        return this;
    }

    public String text() { return this.text; }

    public Detail text(String text) {
        this.text = text;
        return this;
    }

    public String img() { return this.img; }

    public Detail img(String img) {
        this.img = img;
        return this;
    }
}
