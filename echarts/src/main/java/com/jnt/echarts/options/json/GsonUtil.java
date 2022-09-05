package com.jnt.echarts.options.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jnt.echarts.options.Option;
import com.jnt.echarts.options.axis.Axis;
import com.jnt.echarts.options.series.Series;

public class GsonUtil {
    public static String format(Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        Gson gson                   = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String prettyJsonString     = gson.toJson(object);
        String[] lines              = prettyJsonString.split("\n");
        lines                       = replaceEchartQuote(lines);
        lines                       = replaceFunctionQuote(lines);

        for (String line : lines) { stringBuilder.append(line); }
        return stringBuilder.toString().replaceAll("\\\\\"", "\"");
    }

    public static String prettyFormat(Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        Gson gson                   = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String prettyJsonString     = gson.toJson(object);
        String[] lines              = prettyJsonString.split("\n");
        lines                       = replaceEchartQuote(lines);
        lines                       = replaceFunctionQuote(lines);

        for (String line : lines) { stringBuilder.append(line + "\n"); }
        return stringBuilder.toString();
    }

    public static String[] replaceEchartQuote(String[] lines) {
        boolean echart = false;

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();

            if (!echart && line.contains("\"new")) {
                echart  = true;
                line    = line.replaceAll("\"new", "new");
            }
            if (echart && line.contains(")\"")) {
                echart  = false;
                line    = line.replaceAll("\\)\"", "\\)");
            }

            lines[i] = line;
        }
        return lines;
    }

    public static String[] replaceFunctionQuote(String[] lines) {
        boolean function    = false;
        boolean immediately = false;

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();

            if (!function && line.contains("\"function")) {
                function    = true;
                line        = line.replaceAll("\"function", "function");
            }
            if (function && line.contains("}\"")) {
                function    = false;
                line        = line.replaceAll("\\}\"", "\\}");
            }
            if (!immediately && line.contains("\"(function")) {
                immediately = true;
                line        = line.replaceAll("\"\\(function", "\\(function");
            }
            if (immediately && line.contains("})()\"")) {
                immediately = false;
                line        = line.replaceAll("\\}\\)\\(\\)\"", "\\}\\)\\(\\)");
            }

            lines[i] = line;
        }
        return lines;
    }

    public static <T extends Option> T fromJSON(String json, Class<T> type) {
        Gson gson = new GsonBuilder().setPrettyPrinting().
                registerTypeAdapter(Series.class, new SeriesDeserializer()).
                registerTypeAdapter(Axis.class, new AxisDeserializer()).create();
        return gson.fromJson(json, type);
    }

    public static Option fromJSON(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().
                registerTypeAdapter(Series.class, new SeriesDeserializer()).
                registerTypeAdapter(Axis.class, new AxisDeserializer()).create();
        return gson.fromJson(json, Option.class);
    }

    public static void print(Object object) { System.out.println(format(object)); }

    public static void printPretty(Object object) { System.out.println(prettyFormat(object)); }
}
