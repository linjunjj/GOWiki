package com.linjun.documentwiki.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.os.Handler;
import com.linjun.documentwiki.R;
import com.linjun.documentwiki.homeActivity.MianActivity;
import com.linjun.documentwiki.utils.ActionUtils;

/**
 * Created by linjun on 2017/7/14.
 */

public class Welcomeactivity extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
         setContentView(R.layout.activity_welcome);
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               ActionUtils.actionStart(Welcomeactivity.this,MianActivity.class);
               finish();
           }
       },2000);
    }
}
