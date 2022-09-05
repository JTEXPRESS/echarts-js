package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.Orient;
import com.jnt.echarts.options.code.SeriesType;

public class Candlestick extends Series<Candlestick> {
    private Orient layout;
    private Integer barWidth;
    private Integer barMaxWidth;

    public Candlestick() { this.type(SeriesType.candlestick); }

    public Candlestick(String name) {
        super(name);
        this.type(SeriesType.candlestick);
    }

    public Candlestick data(Double open, Double close, Double min, Double max) {
        Object[] kData = new Object[]{open, close, min, max};
        super.data(kData);
        return this;
    }

    public Orient layout() { return this.layout; }

    public Candlestick layout(Orient layout) {
        this.layout = layout;
        return this;
    }

    public Integer barWidth() { return this.barWidth; }

    public Candlestick barWidth(Integer barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    public Integer barMaxWidth() { return this.barMaxWidth; }

    public Candlestick barMaxWidth(Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }
}
