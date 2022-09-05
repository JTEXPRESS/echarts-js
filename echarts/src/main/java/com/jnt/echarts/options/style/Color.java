package com.jnt.echarts.options.style;

import android.annotation.SuppressLint;

import com.google.gson.Gson;

import java.util.ArrayList;

@SuppressLint("DefaultLocale")
public class Color {
    public static String convert(int color) { return String.format("#%06X", (0xFFFFFF & color)); }

    public static String linearGradient(float e, float n, float i, float r, ArrayList<Item> o) {
        String format   = "new echarts.graphic.LinearGradient(%f, %f, %f, %f, %s)";
        String color    = new Gson().toJson(o);

        return String.format(format, e, n, i, r, color);
    }

    public static String radialGradient(float e, float n, float i, ArrayList<Item> o) {
        String format   = "new echarts.graphic.RadialGradient(%f, %f, %f, %s)";
        String color    = new Gson().toJson(o);

        return String.format(format, e, n, i, color);
    }

    public static class Item {
        private String color;
        private float offset;

        public String color() { return this.color; }

        public Item color(String color) {
            this.color = color;
            return this;
        }

        public float offset() { return this.offset; }

        public Item offset(float offset) {
            this.offset = offset;
            return this;
        }
    }
}
