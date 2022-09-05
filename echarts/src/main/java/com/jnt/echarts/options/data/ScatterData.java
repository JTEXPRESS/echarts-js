package com.jnt.echarts.options.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScatterData implements Serializable {
    private List<Object> value;

    public ScatterData(Object width, Object height) { this.value(width, height); }

    public ScatterData(Object width, Object height, Object size) { this.value(width, height, size); }

    public List<Object> value() {
        if (this.value == null) this.value = new ArrayList<>();
        return this.value;
    }

    private ScatterData value(Object... values) {
        if (values == null || values.length == 0) return this;
        this.value().addAll(Arrays.asList(values));
        return this;
    }
}
