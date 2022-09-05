package com.jnt.echarts.options.series.event;

import android.annotation.SuppressLint;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Evolution implements Serializable {
    @SuppressLint("SimpleDateFormat")
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private Detail detail;
    private String time;
    private Integer value;

    public Evolution() {}

    public Evolution(String time, Integer value) {
        this.time   = time;
        this.value  = value;
    }

    public Detail detail() { return this.detail; }

    public Evolution detail(Detail detail) {
        this.detail = detail;
        return this;
    }

    public Evolution detail(String link, String text) {
        this.detail = new Detail(link, text);
        return this;
    }

    public Evolution detail(String link, String text, String img) {
        this.detail = new Detail(link, text, img);
        return this;
    }

    public String time() { return this.time; }

    public Evolution time(String time) {
        this.time = time;
        return this;
    }

    public Evolution time(Date time) {
        this.time = FORMAT.format(time);
        return this;
    }

    public Integer value() { return this.value; }

    public Evolution value(Integer value) {
        this.value = value;
        return this;
    }
}
