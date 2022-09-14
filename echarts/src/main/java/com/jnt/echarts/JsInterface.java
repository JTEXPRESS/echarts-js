package com.jnt.echarts;

import android.webkit.JavascriptInterface;

public class JsInterface {
    private final EChartsListener EChartsListener;

    public JsInterface(EChartsListener EChartsListener) { this.EChartsListener = EChartsListener; }

    @JavascriptInterface
    public void indexClick(int index) {
        if (EChartsListener != null) EChartsListener.onIndex(index);
    }
}
