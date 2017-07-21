package com.example.liuhaifeng.htmlandjsdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button  btn_android;
    private WebView  web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_android= (Button) findViewById(R.id.button);
        web= (WebView) findViewById(R.id.web);

        web.getSettings().setDefaultTextEncodingName("utf-8");
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setUseWideViewPort(true);
        web.setBackgroundColor(Color.argb(0,0,0,0));
        web.addJavascriptInterface(new JavaScriptInterface(MainActivity.this),"myobj");
        web.addJavascriptInterface(new JavaScriptInterface(MainActivity.this),"myobj1");
        web.addJavascriptInterface(new JavaScriptInterface(MainActivity.this),"myobj2");
        web.addJavascriptInterface(new JavaScriptInterface(MainActivity.this),"myobj3");
        web.loadUrl("file:///android_asset/text.html");

        btn_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.loadUrl("javascript:funFromjs()");
                Toast.makeText(MainActivity.this,"调用javascript:funFromjs()",Toast.LENGTH_LONG).show();
            }
        });


    }




}
