package com.jnt.echartsjs;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jnt.echarts.EChartsView;
import com.jnt.echarts.options.Legend;
import com.jnt.echarts.options.Tooltip;
import com.jnt.echarts.options.code.Align;
import com.jnt.echarts.options.code.EmphasisFocus;
import com.jnt.echarts.options.code.RoseType;
import com.jnt.echarts.options.code.Trigger;
import com.jnt.echarts.options.data.Data;
import com.jnt.echarts.options.json.GsonOption;
import com.jnt.echarts.options.series.Pie;
import com.jnt.echarts.options.style.Color;
import com.jnt.echarts.options.style.ItemStyle;
import com.jnt.echarts.options.style.itemstyle.Emphasis;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EChartsView eChartsView = findViewById(R.id.echarts);
        Pie pie                         = new Pie("1");
        GsonOption option               = new GsonOption();
        ArrayList<Color.Item> colorItem = new ArrayList<>();

        colorItem.add(new Color.Item().offset(0).color("#000"));
        colorItem.add(new Color.Item().offset(1).color("#fae"));

        pie.name("Data 1")
                .selectMode(false)
                .label(new ItemStyle().emphasis(new Emphasis().focus(EmphasisFocus.self)))
                .radius("30%", "50%")
                .center("50%", "60%")
                .roseType(RoseType.area)
                .itemStyle(new ItemStyle().borderRadius(8));
        pie.data(new Data().value(40).name("Rose 1").itemStyle(new ItemStyle().color("new echarts.graphic.LinearGradient(0, 0, 0, 1, [{offset: 0, color: '#000'},{offset: 1, color: '#fff'}])")));
        pie.data(new Data().value(30).name("Rose 2").itemStyle(new ItemStyle().color(Color.linearGradient(0,0,0, 1, colorItem))));
        pie.data(new Data().value(21).name("Rose 3"));
        pie.data(new Data().value(12).name("Rose 4"));
        pie.data(new Data().value(11).name("Rose 5"));
        pie.data(new Data().value(8).name("Rose 6"));
        option.title("Pie Chart")
                .backgroundColor("#00000000")
                .legend(new Legend().top(Align.bottom))
                .series(pie)
                .tooltip(new Tooltip().trigger(Trigger.item).formatter("<b>{b}</b> <br/>{c} (<i>{d}%</i>)"));

        eChartsView.setTheme("light");
        eChartsView.setOption(option);
        eChartsView.build();
    }
}
