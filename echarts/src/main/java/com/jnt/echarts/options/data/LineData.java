package com.jnt.echarts.options.data;

public class LineData extends BasicData<LineData> {
    private Integer valueIndex;

    public LineData() {}

    public LineData(String name, Object value) { super(name, value); }

    public LineData(String name, Object symbol, Object symbolSize) { super(name, symbol, symbolSize); }

    public LineData(Object value, Object symbol) { super(value, symbol); }

    public LineData(Object value, Object symbol, Object symbolSize) { super(value, symbol, symbolSize); }

    public Integer valueIndex() { return this.valueIndex; }

    public LineData valueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
}
