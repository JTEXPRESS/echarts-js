package com.jnt.echarts.options;

import com.jnt.echarts.options.axis.Axis;
import com.jnt.echarts.options.code.Easing;
import com.jnt.echarts.options.code.Symbol;
import com.jnt.echarts.options.code.Trigger;
import com.jnt.echarts.options.option.NoDataLoadingOption;
import com.jnt.echarts.options.series.Parallel;
import com.jnt.echarts.options.series.Series;
import com.jnt.echarts.options.style.ItemStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Option implements Serializable {
    private List<Object> color;
    private List<DataZoom> dataZoom;
    private List<Axis> xAxis;
    private List<Axis> yAxis;
    private List<Series> series;
    private List<Polar> polar;
    private List<Symbol> symbolList;
    private List<VisualMap> visualMap;
    private List<Option> options;
    private Easing animationEasing;
    private Object backgroundColor;
    private Object renderAsImage;
    private Object animationEasingUpdate;
    private Timeline timeline;
    private Title title;
    private Toolbox toolbox;
    private Tooltip tooltip;
    private Legend legend;
    private DataRange dataRange;
    private RoamController roamController;
    private Grid grid;
    private NoDataLoadingOption noDataLoadingOption;
    private ItemStyle itemStyle;
    private Geo geo;
    private Parallel parallel;
    private Graphic graphic;
    private Radar radar;
    private String calculableColor;
    private String calculableHolderColo;
    private String nameConnector;
    private String valueConnector;
    private Integer animationThreshold;
    private Integer animationDuration;
    private Integer animationDurationUpdate;
    private Boolean calculable;
    private Boolean animation;
    private Boolean addDataAnimation;

    public List<Object> color() {
        if (this.color == null) this.color = new ArrayList<Object>();
        return this.color;
    }

    public List<DataZoom> dataZoom() {
        if (this.dataZoom == null) this.dataZoom = new ArrayList<>();
        return this.dataZoom;
    }

    public Option color(Object... colors) {
        if (colors == null || colors.length == 0) return this;
        this.color().addAll(Arrays.asList(colors));
        return this;
    }

    public Option dataZoom(List<DataZoom> dataZoom) {
        this.dataZoom = dataZoom;
        return this;
    }

    public Option dataZoom(DataZoom... dataZoom) {
        if (dataZoom == null || dataZoom.length == 0) return this;
        this.dataZoom().addAll(Arrays.asList(dataZoom));
        return this;
    }

    public List<Axis> xAxis() {
        if (this.xAxis == null) this.xAxis = new ArrayList<Axis>();
        return this.xAxis;
    }

    public Option xAxis(List<Axis> xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public Option xAxis(Axis... values) {
        if (values == null || values.length == 0) return this;
        if (this.xAxis().size() == 2) throw new RuntimeException("There are already 2 xAxis, can not continue to add!");
        if (this.xAxis().size() + values.length > 2) throw new RuntimeException("Added xAxis exceeds maximum allowed range:2!");
        this.xAxis().addAll(Arrays.asList(values));
        return this;
    }

    public List<Axis> yAxis() {
        if (this.yAxis == null) this.yAxis = new ArrayList<Axis>();
        return this.yAxis;
    }

    public Option yAxis(List<Axis> yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public Option yAxis(Axis... values) {
        if (values == null || values.length == 0) return this;
        if (this.yAxis().size() == 2) throw new RuntimeException("There are already 2 yAxis, can not continue to add!");
        if (this.yAxis().size() + values.length > 2) throw new RuntimeException("Added yAxis exceeds maximum allowed range:2!");
        this.yAxis().addAll(Arrays.asList(values));
        return this;
    }

    public List<Series> series() {
        if (this.series == null) this.series = new ArrayList<Series>();
        return this.series;
    }

    public Option series(List<Series> series) {
        this.series = series;
        return this;
    }

    public Option series(Series... values) {
        if (values == null || values.length == 0) return this;
        this.series().addAll(Arrays.asList(values));
        return this;
    }

    public List<Polar> polar() {
        if (this.polar == null) this.polar = new ArrayList<Polar>();
        return this.polar;
    }

    public Option polar(List<Polar> polar) {
        this.polar = polar;
        return this;
    }

    public Option polar(Polar... values) {
        if (values == null || values.length == 0) return this;
        this.polar().addAll(Arrays.asList(values));
        return this;
    }

    public List<Symbol> symbolList() { return this.symbolList; }

    public Option symbolList(List<Symbol> symbolList) {
        if (this.symbolList == null) this.symbolList = new LinkedList<Symbol>();
        this.symbolList = symbolList;
        return this;
    }

    public Option symbolList(Symbol... symbolList) {
        if (symbolList == null || symbolList.length == 0) return this;
        this.symbolList().addAll(Arrays.asList(symbolList));
        return this;
    }

    public List<VisualMap> visualMap() {
        if (this.visualMap == null) this.visualMap = new ArrayList<VisualMap>();
        return this.visualMap;
    }

    public Option visualMap(List<VisualMap> visualMap) {
        this.visualMap = visualMap;
        return this;
    }

    public List<Option> options() {
        if (this.options == null) this.options = new ArrayList<Option>();
        return this.options;
    }

    public Option options(List<Option> options) {
        this.options = options;
        return this;
    }

    public Option options(Option... values) {
        if (values == null || values.length == 0) return this;
        this.options().addAll(Arrays.asList(values));
        return this;
    }

    public Easing animationEasing() { return this.animationEasing; }

    public Option animationEasing(Easing animationEasing) {
        this.animationEasing = animationEasing;
        return this;
    }

    public Object backgroundColor() { return this.backgroundColor; }

    public Option backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Object renderAsImage() { return this.renderAsImage; }

    public Option renderAsImage(Object renderAsImage) {
        this.renderAsImage = renderAsImage;
        return this;
    }

    public Object animationEasingUpdate() { return this.animationEasingUpdate; }

    public Option animationEasingUpdate(Object animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return this;
    }

    public Option animationEasingUpdate(Easing animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return this;
    }

    public Timeline timeline() {
        if (this.timeline == null) this.timeline = new Timeline();
        return this.timeline;
    }

    public Option timeline(Timeline timeline) {
        this.timeline = timeline;
        return this;
    }

    public Title title() {
        if (this.title == null) this.title = new Title();
        return this.title;
    }

    public Option title(Title title) {
        this.title = title;
        return this;
    }

    public Option title(String text) {
        this.title().text(text);
        return this;
    }

    public Option title(String text, String subtext) {
        this.title().text(text).subtext(subtext);
        return this;
    }

    public Toolbox toolbox() {
        if (this.toolbox == null) this.toolbox = new Toolbox();
        return this.toolbox;
    }

    public Option toolbox(Toolbox toolbox) {
        this.toolbox = toolbox;
        return this;
    }

    public Tooltip tooltip() {
        if (this.tooltip == null) this.tooltip = new Tooltip();
        return this.tooltip;
    }

    public Option tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Option tooltip(Trigger trigger) {
        this.tooltip().trigger(trigger);
        return this;
    }

    public Legend legend() {
        if (this.legend == null) this.legend = new Legend();
        return this.legend;
    }

    public Option legend(Legend legend) {
        this.legend = legend;
        return this;
    }

    public Option legend(Object... values) {
        this.legend().data(values);
        return this;
    }

    public DataRange dataRange() {
        if (this.dataRange == null) this.dataRange = new DataRange();
        return this.dataRange;
    }

    public Option dataRange(DataRange dataRange) {
        this.dataRange = dataRange;
        return this;
    }

    public RoamController roamController() {
        if (this.roamController == null) this.roamController = new RoamController();
        return this.roamController;
    }

    public Option roamController(RoamController roamController) {
        this.roamController = roamController;
        return this;
    }

    public Grid grid() {
        if (this.grid == null) this.grid = new Grid();
        return this.grid;
    }

    public Option grid(Grid grid) {
        this.grid = grid;
        return this;
    }

    public NoDataLoadingOption noDataLoadingOption() {
        if (this.noDataLoadingOption == null) this.noDataLoadingOption = new NoDataLoadingOption();
        return this.noDataLoadingOption;
    }

    public Option noDataLoadingOption(NoDataLoadingOption noDataLoadingOption) {
        this.noDataLoadingOption = noDataLoadingOption;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) this.itemStyle = new ItemStyle();
        return this.itemStyle;
    }

    public Option itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Geo geo() {
        if (this.geo == null) this.geo = new Geo();
        return this.geo;
    }

    public Option geo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Parallel parallel() {
        if (this.parallel == null) this.parallel = new Parallel();
        return this.parallel;
    }

    public Option parallel(Parallel parallel) {
        this.parallel = parallel;
        return this;
    }

    public Graphic graphic() { return this.graphic; }

    public Option graphic(Graphic graphic) {
        this.graphic = graphic;
        return this;
    }

    public Radar radar() { return this.radar; }

    public Option radar(Radar radar) {
        this.radar = radar;
        return this;
    }

    public String calculableColor() { return this.calculableColor; }

    public Option calculableColor(String calculableColor) {
        this.calculableColor = calculableColor;
        return this;
    }

    public String calculableHolderColo() { return this.calculableHolderColo; }

    public Option calculableHolderColo(String calculableHolderColo) {
        this.calculableHolderColo = calculableHolderColo;
        return this;
    }

    public String nameConnector() { return this.nameConnector; }

    public Option nameConnector(String nameConnector) {
        this.nameConnector = nameConnector;
        return this;
    }

    public String valueConnector() { return this.valueConnector; }

    public Option valueConnector(String valueConnector) {
        this.valueConnector = valueConnector;
        return this;
    }

    public Integer animationThreshold() { return this.animationThreshold; }

    public Option animationThreshold(Integer animationThreshold) {
        this.animationThreshold = animationThreshold;
        return this;
    }

    public Integer animationDuration() { return this.animationDuration; }

    public Option animationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public Integer animationDurationUpdate() { return this.animationDurationUpdate; }

    public Option animationDurationUpdate(Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public Boolean calculable() { return this.calculable; }

    public Option calculable(Boolean calculable) {
        this.calculable = calculable;
        return this;
    }

    public Boolean animation() { return this.animation; }

    public Option animation(Boolean animation) {
        this.animation = animation;
        return this;
    }

    public Boolean addDataAnimation() { return this.addDataAnimation; }

    public Option addDataAnimation(Boolean addDataAnimation) {
        this.addDataAnimation = addDataAnimation;
        return this;
    }

    public DataZoom dataZoomNew() {
        DataZoom dataZoom = new DataZoom();
        this.dataZoom().add(dataZoom);
        return dataZoom;
    }

    public VisualMap visualMapNew() {
        VisualMap v = new VisualMap();
        this.visualMap().add(v);
        return v;
    }

    public List<Axis> getxAxis() { return xAxis; }

    public void setxAxis(List<Axis> xAxis) { this.xAxis = xAxis; }

    public List<Axis> getyAxis() { return yAxis; }

    public void setyAxis(List<Axis> yAxis) { this.yAxis = yAxis; }

    public List<VisualMap> getVisualMap() { return visualMap; }

    public void setVisualMap(List<VisualMap> visualMap) { this.visualMap = visualMap; }

    public Object getAnimationEasingUpdate() { return animationEasingUpdate; }

    public void setAnimationEasingUpdate(Object animationEasingUpdate) { this.animationEasingUpdate = animationEasingUpdate; }

    public Parallel getParallel() { return parallel; }

    public void setParallel(Parallel parallel) { this.parallel = parallel; }

    public Geo getGeo() { return geo; }

    public void setGeo(Geo geo) { this.geo = geo; }
}
