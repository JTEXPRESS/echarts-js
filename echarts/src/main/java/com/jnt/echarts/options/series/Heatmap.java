package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.SeriesType;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Heatmap extends Series<Heatmap> {
    private List<Object> gradientColors;
    private Integer blurSize;
    private Double minAlpha;
    private Double valueScale;
    private Double opacity;

    public Heatmap() { this.type(SeriesType.heatmap); }

    public Heatmap(String name) {
        super(name);
        this.type(SeriesType.heatmap);
    }

    public List<Object> gradientColors() {
        if (this.gradientColors == null) this.gradientColors = new LinkedList<>();
        return this.gradientColors;
    }

    public Heatmap gradientColors(List<Object> gradientColors) {
        this.gradientColors = gradientColors;
        return this;
    }

    public Heatmap gradientColors(Object... gradientColors) {
        if (gradientColors == null || gradientColors.length == 0) return this;
        this.gradientColors().addAll(Arrays.asList(gradientColors));
        return this;
    }

    public Integer blurSize() { return this.blurSize; }

    public Heatmap blurSize(Integer blurSize) {
        this.blurSize = blurSize;
        return this;
    }

	public Double minAlpha() { return this.minAlpha; }

    public Heatmap minAlpha(Double minAlpha) {
        this.minAlpha = minAlpha;
        return this;
    }

	public Double valueScale() { return this.valueScale; }

    public Heatmap valueScale(Double valueScale) {
        this.valueScale = valueScale;
        return this;
    }

    public Double opacity() { return this.opacity; }

	public Heatmap opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }
}
