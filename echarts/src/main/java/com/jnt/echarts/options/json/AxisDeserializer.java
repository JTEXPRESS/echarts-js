package com.jnt.echarts.options.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.jnt.echarts.options.axis.Axis;
import com.jnt.echarts.options.axis.CategoryAxis;
import com.jnt.echarts.options.axis.TimeAxis;
import com.jnt.echarts.options.axis.ValueAxis;
import com.jnt.echarts.options.code.AxisType;

import java.lang.reflect.Type;

public class AxisDeserializer implements JsonDeserializer<Axis> {
    @Override
    public Axis deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        String _type                = jsonObject.get("type").getAsString();
        AxisType type               = AxisType.valueOf(_type);
        Axis axis                   = null;

        switch (type) {
            case category:
                axis = context.deserialize(jsonObject, CategoryAxis.class);
                break;
            case value:
                axis = context.deserialize(jsonObject, ValueAxis.class);
                break;
            case time:
                axis = context.deserialize(jsonObject, TimeAxis.class);
                break;
        }
        return axis;
    }
}
