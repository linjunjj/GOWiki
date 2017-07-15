package com.linjun.documentwiki.homeActivity;

import android.app.Activity;
import android.os.Bundle;
;
import android.os.Handler;
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
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               ActionUtils.actionStart(Welcomeactivity.this,homeActivity.class);
               finish();
           }
       },2000);
    }
}
