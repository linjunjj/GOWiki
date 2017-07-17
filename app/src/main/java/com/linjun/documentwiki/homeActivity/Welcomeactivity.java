package com.linjun.documentwiki.homeActivity;

import android.app.Activity;
import android.os.Bundle;
;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.linjun.documentwiki.R;
import com.linjun.documentwiki.utils.ActionUtils;

/**
 * Created by linjun on 2017/7/14.
 */

public class Welcomeactivity extends Activity {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_welcome);
        setFullScreen();
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               ActionUtils.actionStart(Welcomeactivity.this,homeActivity.class);
               finish();
           }
       },2000);
    }
    private void setFullScreen() {
        int flag = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        Window window = Welcomeactivity.this.getWindow();
        window.setFlags(flag, flag);
    }
}
