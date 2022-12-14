package com.jnt.echarts.options;

public enum Event {
    REFRESH("refresh"),
    RESTORE("restore"),
    RESIZE("resize"),
    CLICK("click"),
    DBLCLICK("dblclick"),
    HOVER("hover"),
    DATA_CHANGED("dataChanged"),
    DATA_ZOOM("dataZoom"),
    DATA_RANGE("dataRange"),
    LEGEND_SELECTED("legendSelected"),
    MAP_SELECTED("mapSelected"),
    PIE_SELECTED("pieSelected"),
    MAGIC_TYPE_CHANGED("magicTypeChanged"),
    DATA_VIEW_CHANGED("dataViewChanged"),
    TIMELINE_CHANGED("timelineChanged"),
    MAP_ROAM("mapRoam"),
    TOOLTIP_HOVER("tooltipHover"),
    TOOLTIP_IN_GRID("tooltipInGrid"),
    TOOLTIP_OUT_GRID("tooltipOutGrid");

    private String event;

    Event(String event) { this.event = event; }

    @Override
    public String toString() { return this.event; }
}
