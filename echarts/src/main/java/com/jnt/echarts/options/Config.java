package com.jnt.echarts.options;

public interface Config {
    String CHART_TYPE_LINE              = "line";
    String CHART_TYPE_BAR               = "bar";
    String CHART_TYPE_SCATTER           = "scatter";
    String CHART_TYPE_PIE               = "pie";
    String CHART_TYPE_RADAR             = "radar";
    String CHART_TYPE_MAP               = "map";
    String CHART_TYPE_K                 = "k";
    String CHART_TYPE_ISLAND            = "island";
    String CHART_TYPE_FORCE             = "force";
    String CHART_TYPE_CHORD             = "chord";
    String CHART_TYPE_GAUGE             = "gauge";
    String CHART_TYPE_FUNNEL            = "funnel";
    String COMPONENT_TYPE_TITLE         = "title";
    String COMPONENT_TYPE_LEGEND        = "legend";
    String COMPONENT_TYPE_DATARANGE     = "dataRange";
    String COMPONENT_TYPE_DATAVIEW      = "dataView";
    String COMPONENT_TYPE_DATAZOOM      = "dataZoom";
    String COMPONENT_TYPE_TOOLBOX       = "toolbox";
    String COMPONENT_TYPE_TOOLTIP       = "tooltip";
    String COMPONENT_TYPE_GRID          = "grid";
    String COMPONENT_TYPE_AXIS          = "axis";
    String COMPONENT_TYPE_POLAR         = "polar";
    String COMPONENT_TYPE_X_AXIS        = "xAxis";
    String COMPONENT_TYPE_Y_AXIS        = "yAxis";
    String COMPONENT_TYPE_AXIS_CATEGORY = "categoryAxis";
    String COMPONENT_TYPE_AXIS_VALUE    = "valueAxis";
    String COMPONENT_TYPE_TIMELINE      = "timeline";
    String COMPONENT_TYPE_GRAPHIC       = "graphic";
    Integer DRAG_ENABLE_TIME            = 120;
    Integer EFFECT_ZLEVEL               = 7;

    String loadingText              = "Loading...";
    String backgroundColor          = "rgba(0,0,0,0)";
    String calculableColor          = "rgba(255,165,0,0.6)";
    String calculableHolderColor    = "#ccc";
    String nameConnector            = " & ";
    String valueConnector           = "=";
    String animationEasing          = "ExponentialOut";
    Integer animationThreshold      = 2000;
    Integer animationDuration       = 2000;
    Boolean calculable              = false;
    Boolean animation               = true;
    Boolean addDataAnimation        = true;

    String[] color = new String[]{"#ff7f50", "#87cefa", "#da70d6", "#32cd32", "#6495ed",
            "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500", "#40e0d0",
            "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a", "#ffd700",
            "#6699FF", "#ff6666", "#3cb371", "#b8860b", "#30e0e0"};

    String[] symbolList = new String[]{"circle", "rectangle", "triangle", "diamond",
            "emptyCircle", "emptyRectangle", "emptyTriangle", "emptyDiamond"};
}
