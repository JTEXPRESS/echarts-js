package com.jnt.echarts.options;

import java.util.HashMap;
import java.util.Map;

public class RoamController extends Basic<RoamController> implements Component {
    private Map<String, Boolean> mapTypeControl;
    private String fillerColor;
    private String handleColor;
    private Integer step;

    public Map<String, Boolean> mapTypeControl() { return this.mapTypeControl; }

    public RoamController mapTypeControl(String key, Boolean value) {
        if (this.mapTypeControl == null) this.mapTypeControl = new HashMap<String, Boolean>();
        this.mapTypeControl.put(key, value);
        return this;
    }

    public String fillerColor() { return this.fillerColor; }

    public RoamController fillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
        return this;
    }

    public String handleColor() { return this.handleColor; }

    public RoamController handleColor(String handleColor) {
        this.handleColor = handleColor;
        return this;
    }

    public Integer step() { return this.step; }

    public RoamController step(Integer step) {
        this.step = step;
        return this;
    }
}
