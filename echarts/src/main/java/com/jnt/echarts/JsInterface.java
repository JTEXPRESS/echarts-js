package com.jnt.echarts;

import android.webkit.JavascriptInterface;

public class JsInterface {
    private final ItemOnClickListener itemOnClickListener;

    public JsInterface(ItemOnClickListener itemOnClickListener) { this.itemOnClickListener = itemOnClickListener; }

    @JavascriptInterface
    public void indexClick(int index) {
        if (itemOnClickListener != null) itemOnClickListener.onIndex(index);
    }
}
