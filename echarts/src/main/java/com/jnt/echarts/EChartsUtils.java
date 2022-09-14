package com.jnt.echarts;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class EChartsUtils {
    public static String getMain(Context context) {
        InputStream inputStream         = context.getResources().openRawResource(R.raw.main);
        BufferedReader bufferedReader   = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder stringBuilder     = new StringBuilder();
        String result                   = "File Failed To Load";
        String readLine;

        try {
            while ((readLine = bufferedReader.readLine()) != null) { stringBuilder.append(readLine); }
            bufferedReader.close();

            if (!stringBuilder.toString().isEmpty()) result = stringBuilder.toString();
        } catch (IOException e) { e.printStackTrace(); }
        return result;
    }
}
