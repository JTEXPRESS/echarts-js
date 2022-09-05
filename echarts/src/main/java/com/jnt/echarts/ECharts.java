package com.jnt.echarts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.jnt.echarts.options.json.GsonOption;

@SuppressLint("DefaultLocale")
public class ECharts extends RelativeLayout {
    private ItemOnClickListener itemOnClickListener;
    private ProgressBar progress;
    private WebView web;
    private GsonOption option;
    private String theme;

    public ECharts(Context context) {
        super(context);
        initView(context);
    }

    public ECharts(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public ECharts(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void initView(Context context) {
        inflate(context, R.layout.echarts, this);

        progress        = findViewById(R.id.progress);
        web             = findViewById(R.id.web);

        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setDomStorageEnabled(true);
        web.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        web.setScrollbarFadingEnabled(false);
    }

    public void setItemClickListener(ItemOnClickListener itemOnClickListener) { this.itemOnClickListener = itemOnClickListener; }

    public void setTheme(String theme) { this.theme = theme; }

    public void setOption(GsonOption option) { this.option = option; }

    public void setProgressColor(int color) { this.progress.setIndeterminateTintList(ColorStateList.valueOf(color));}

    public void setHighlight(int seriesIndex, int dataIndex) { web.evaluateJavascript(String.format("setHighlight(%d, %d)", seriesIndex, dataIndex), null); }

    public void reload() { web.reload(); }

    public void build() {
        String content  = Utils.getMain(getContext());
        content         = content.replace("%theme%", theme);
        content         = content.replace("%options%", option.toString());

        web.loadDataWithBaseURL("file:///android_asset/", content, "text/html", "utf-8", null);
        web.addJavascriptInterface(new JsInterface(itemOnClickListener), "JNT");
        web.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progress.setVisibility(VISIBLE);
                web.setVisibility(GONE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progress.setVisibility(GONE);
                web.setVisibility(VISIBLE);
            }
        });
    }
}
