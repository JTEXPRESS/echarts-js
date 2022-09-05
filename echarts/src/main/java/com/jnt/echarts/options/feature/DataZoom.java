package com.jnt.echarts.options.feature;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class DataZoom extends Feature {
    private Object yAxisIndex;

    public DataZoom() {
        Map title = new HashMap<String, String>();

        title.put("dataZoom", "Area Zoom");
        title.put("dataZoomReset", "Area Zoom Reset");
        this.title(title);
        this.show(true);
    }

    public Object yAxisIndex() { return this.yAxisIndex; }

    public DataZoom yAxisIndex(Object yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }
}
