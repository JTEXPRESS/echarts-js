package com.jnt.echarts.options.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.jnt.echarts.options.code.SeriesType;
import com.jnt.echarts.options.series.Bar;
import com.jnt.echarts.options.series.Boxplot;
import com.jnt.echarts.options.series.Candlestick;
import com.jnt.echarts.options.series.EffectScatter;
import com.jnt.echarts.options.series.Funnel;
import com.jnt.echarts.options.series.Gauge;
import com.jnt.echarts.options.series.Graph;
import com.jnt.echarts.options.series.Line;
import com.jnt.echarts.options.series.Lines;
import com.jnt.echarts.options.series.Map;
import com.jnt.echarts.options.series.Parallel;
import com.jnt.echarts.options.series.Pie;
import com.jnt.echarts.options.series.Sankey;
import com.jnt.echarts.options.series.Scatter;
import com.jnt.echarts.options.series.Series;

import java.lang.reflect.Type;

public class SeriesDeserializer implements JsonDeserializer<Series> {
    @Override
    public Series deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        String _type                = jsonObject.get("type").getAsString();
        SeriesType type             = SeriesType.valueOf(_type);
        Series series               = null;

        switch (type) {
            case line:
                series = context.deserialize(jsonObject, Line.class);
                break;
            case bar:
                series = context.deserialize(jsonObject, Bar.class);
                break;
            case scatter:
                series = context.deserialize(jsonObject, Scatter.class);
                break;
            case funnel:
                series = context.deserialize(jsonObject, Funnel.class);
                break;
            case pie:
                series = context.deserialize(jsonObject, Pie.class);
                break;
            case gauge:
                series = context.deserialize(jsonObject, Gauge.class);
                break;
            case map:
                series = context.deserialize(jsonObject, Map.class);
                break;
            case lines:
                series = context.deserialize(jsonObject, Lines.class);
                break;
            case effectScatter:
                series = context.deserialize(jsonObject, EffectScatter.class);
                break;
            case candlestick:
                series = context.deserialize(jsonObject, Candlestick.class);
                break;
            case graph:
                series = context.deserialize(jsonObject, Graph.class);
                break;
            case boxplot:
                series = context.deserialize(jsonObject, Boxplot.class);
                break;
            case parallel:
                series = context.deserialize(jsonObject, Parallel.class);
                break;
            case sankey:
                series = context.deserialize(jsonObject, Sankey.class);
                break;
        }
        return series;
    }
}
