package com.jnt.echarts.options.series;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;

public class GeoCoord extends HashMap<String, BigDecimal[]> implements Serializable {
    public GeoCoord put(String key, String x, String y) {
        super.put(key, new BigDecimal[]{new BigDecimal(x), new BigDecimal(y)});
        return this;
    }
}
