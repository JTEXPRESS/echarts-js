package com.jnt.echarts.options.series;

import com.jnt.echarts.options.code.Calculation;
import com.jnt.echarts.options.code.SelectMode;
import com.jnt.echarts.options.code.SeriesType;

public class Map extends Series<Map> {
    private Calculation mapValueCalculation;
    private Object selectedMode;
    private Object nameMap;
    private Object textFixed;
    private GeoCoord geoCoord;
    private MapLocation mapLocation;
    private ScaleLimit scaleLimit;
    private String mapType;
    private Integer mapValuePrecision;
    private Boolean dataRangeHoverLink;
    private Boolean roam;
    private Boolean showLegendSymbol;

    public Map() { this.type(SeriesType.map); }

    public Map(String name) {
        super(name);
        this.type(SeriesType.map);
    }

    public Calculation mapValueCalculation() { return this.mapValueCalculation; }

    public Map mapValueCalculation(Calculation mapValueCalculation) {
        this.mapValueCalculation = mapValueCalculation;
        return this;
    }

    public Object selectedMode() { return this.selectedMode; }

    public Map selectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public Map selectedMode(SelectMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public Object nameMap() { return this.nameMap; }

    public Map nameMap(Object nameMap) {
        this.nameMap = nameMap;
        return this;
    }

    public Object textFixed() { return this.textFixed; }

    public Map textFixed(Object textFixed) {
        this.textFixed = textFixed;
        return this;
    }

    public GeoCoord geoCoord() {
        if (this.geoCoord == null) this.geoCoord = new GeoCoord();
        return this.geoCoord;
    }

    public Map geoCoord(String name, String x, String y) {
        this.geoCoord().put(name, x, y);
        return this;
    }

    public MapLocation mapLocation() {
        if (this.mapLocation == null) this.mapLocation = new MapLocation();
        return this.mapLocation;
    }

    public Map mapLocation(MapLocation mapLocation) {
        this.mapLocation = mapLocation;
        return this;
    }

    public ScaleLimit scaleLimit() {
        if (this.scaleLimit == null) this.scaleLimit = new ScaleLimit();
        return this.scaleLimit;
    }

    public Map scaleLimit(ScaleLimit scaleLimit) {
        this.scaleLimit = scaleLimit;
        return this;
    }

    public String mapType() { return this.mapType; }

    public Map mapType(String mapType) {
        this.mapType = mapType;
        return this;
    }

    public Integer mapValuePrecision() { return this.mapValuePrecision; }

    public Map mapValuePrecision(Integer mapValuePrecision) {
        this.mapValuePrecision = mapValuePrecision;
        return this;
    }

    public Boolean dataRangeHoverLink() { return this.dataRangeHoverLink; }

    public Map dataRangeHoverLink(Boolean dataRangeHoverLink) {
        this.dataRangeHoverLink = dataRangeHoverLink;
        return this;
    }

    public Boolean roam() { return this.roam; }

    public Map roam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    public Boolean showLegendSymbol() { return this.showLegendSymbol; }

    public Map showLegendSymbol(Boolean showLegendSymbol) {
        this.showLegendSymbol = showLegendSymbol;
        return this;
    }
}
