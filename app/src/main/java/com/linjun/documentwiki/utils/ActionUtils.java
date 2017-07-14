package com.linjun.documentwiki.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by linjun on 2017/7/14.
 */

public class ActionUtils {
    private static Intent intent;

    public  static  void actionStart(Context context, Class<?> activityClass){
        intent=new Intent(context,activityClass);
        context.startActivity(intent);
    }
    public  static  void actionStart(Context context, String action , Uri uri){
        intent=new Intent(action,uri);
        context.startActivity(intent);
    }
    public  static  void actionStart(Context context,Class<?> actionClass,int requestCode){
        intent=new Intent(context,actionClass);
        ((FragmentActivity)context).startActivityForResult(intent,requestCode);
    }
    public  static  void actionStart(Context context,String action,int requestCode){
        intent=new Intent(action);
        ((FragmentActivity)context).startActivityForResult(intent,requestCode);
    }
    public  static  void actionStart(Context context,Class<?> activityClass,Bundle data){
        intent =new Intent();
        intent.setClass(context,activityClass);
        intent.putExtras(data);
        context.startActivity(intent);
    }

}
