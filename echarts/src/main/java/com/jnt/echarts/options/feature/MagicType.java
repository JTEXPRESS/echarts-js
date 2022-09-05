package com.jnt.echarts.options.feature;

import com.jnt.echarts.options.code.Magic;
import com.jnt.echarts.options.series.Funnel;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class MagicType extends Feature {
    private Option option;

    public MagicType(Magic... magics) {
        Map title = new HashMap<String, String>();

        title.put("line", "Line Chart Toggle");
        title.put("bar", "Column Chart Toggle");
        title.put("stack", "Accumulation");
        title.put("tiled", "Tile");
        this.title(title);
        this.show(true);

        if (magics == null || magics.length == 0) this.type(new Object[]{Magic.bar, Magic.line, Magic.stack, Magic.tiled});
        else this.type(magics);
    }

    public Option option() { return this.option; }

    public Option getOption() { return option; }

    public Feature option(Option option) {
        this.option = option;
        return this;
    }

    public void setOption(Option option) { this.option = option; }

    public static class Option {
        private Funnel funnel;

        public Funnel funnel() {
            if (this.funnel == null) funnel = new Funnel();
            return this.funnel;
        }

        public Option funnel(Funnel funnel) {
            this.funnel = funnel;
            return this;
        }
    }
}
