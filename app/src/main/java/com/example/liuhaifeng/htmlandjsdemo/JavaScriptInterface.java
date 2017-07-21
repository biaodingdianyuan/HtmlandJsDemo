package com.example.liuhaifeng.htmlandjsdemo;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

/**
 * Created by liuhaifeng on 2017/5/19.
 */

public class JavaScriptInterface {
    Context mContxt;
    //sdk17版本以上加上注解
    public JavaScriptInterface(Context mContxt) {
        this.mContxt = mContxt;
    }
    @JavascriptInterface
    public  void go1(){
        mContxt.startActivity(new Intent(mContxt,TwoActivity.class));
    }
    @JavascriptInterface
    public  void go2(){
        mContxt.startActivity(new Intent(mContxt,ThreeActivity.class));
    }
    @JavascriptInterface
    public  void go3(){
        mContxt.startActivity(new Intent(mContxt,FourActivity.class));
    }
    @JavascriptInterface
    public  void go4(){
        mContxt.startActivity(new Intent(mContxt,TwoActivity.class));
    }

}
