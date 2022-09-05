package com.jnt.echarts.options.feature;

import com.jnt.echarts.options.code.LineType;
import com.jnt.echarts.options.style.LineStyle;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class Mark extends Feature {
    public Mark() {
        Map title = new HashMap<String, String>();

        title.put("mark", "Auxiliary Line Switch");
        title.put("markUndo", "Delete Guideline");
        title.put("markClear", "Clear The Auxiliary Line");
        this.title(title);
        this.lineStyle(new LineStyle());
        this.lineStyle().width(2);
        this.lineStyle().color("#1e90ff");
        this.lineStyle().type(LineType.dashed);
        this.show(true);
    }
}
