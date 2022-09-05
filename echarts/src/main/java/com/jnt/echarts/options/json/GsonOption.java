package com.jnt.echarts.options.json;

import com.jnt.echarts.options.Option;

public class GsonOption extends Option {
    @Override
    public String toString() { return GsonUtil.format(this); }

    public String toPrettyString() { return GsonUtil.prettyFormat(this); }
}
