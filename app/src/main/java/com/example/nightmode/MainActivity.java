package com.example.nightmode;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import im.delight.android.webview.AdvancedWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdvancedWebView webView = findViewById(R.id.webview);

        /*WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");*/


       /* webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);

                return true;
            }
            @Override
            public void onPageFinished(WebView view, final String url) {

            }
        });
*/

        String html = "<div id=\"arena-live\" data-publisher=\"cna\" data-event=\"km5i\" data-version=\"2\"></div>" +
                "<script src=\"https://go.arena.im/public/js/arenalib.js?p=cna&e=km5i\"></script>";

        webView.loadDataWithBaseURL("https://www.channelnewsasia.com/", html, "text/html", "utf-8", null);
//webView.loadUrl("https://go.arena.im/public/js/arenalib.js?p=cna&e=km5i");


//webView.loadUrl("https://sandbox.arena.im/embed?publisher=asgard&event=mwz0&token=NDA2YjI0NjQtZTY0ZC00ZGY0LThmNzAtZmJjNTkzNzMzNGJi&v=2");
    }
}
