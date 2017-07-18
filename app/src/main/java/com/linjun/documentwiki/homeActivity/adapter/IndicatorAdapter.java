package com.linjun.documentwiki.homeActivity.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.linjun.documentwiki.R;
import com.linjun.documentwiki.homeActivity.fragment.ContentFragment;
import com.linjun.documentwiki.model.Model;
import com.shizhefei.view.indicator.IndicatorViewPager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by linjun on 2017/7/14.
 */

public class IndicatorAdapter extends IndicatorViewPager.IndicatorFragmentPagerAdapter {
         String[] title={"Go环境配置","Go语言基础","Web基础","表单","访问数据库","session和数据存储",
                 "文本文件处理","Web服务","安全与加密","国际化和本地化","测试","部署与维护",
          "自己定义web框架","扩展Web框架"};
    private  Model model;
    private LayoutInflater inflater;
    private Context mContext;
    private  final List<Fragment> mFragement;
    private List<List<String>> data;
    public IndicatorAdapter(FragmentManager fragmentManager,Context context) {
        super(fragmentManager);
        mContext=context;
        inflater=LayoutInflater.from(context);
       mFragement=initFragment();

    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public View getViewForTab(int position, View convertView, ViewGroup container) {
        if (convertView==null){
            convertView= inflater.inflate(R.layout.tab_guide, container, false);
        }
        ((TextView) convertView).setText(title[position]);
        return convertView;
    }
    @Override
    public Fragment getFragmentForPage(int position) {
        return mFragement.get(position) ;
    }

   private List<Fragment> initFragment(){
        List<Fragment> fragments=new ArrayList<>();
       initdata();
        int size=title.length;
        for (int i = 0; i < size; i++) {
            Bundle arg = new Bundle();
            arg.putInt("page",i);
         arg.putSerializable("type", (Serializable) data.get(i));
            ContentFragment fragment=new ContentFragment();
              fragment.setArguments(arg);
            fragments.add(fragment);
        }
     return  fragments;
   }
    private  void initdata(){
    model=new Model();

    data=new ArrayList<>();
    List<String> data1= Arrays.asList(model.ti);
      List<String> data2=Arrays.asList(model.t2);
    List<String> data3=Arrays.asList(model.t3);
     List<String> data4=Arrays.asList(model.t4);
     List<String> data5=Arrays.asList(model.t5);
      List<String> data6=Arrays.asList(model.t6);
     List<String> data7= Arrays.asList(model.t7);
    List<String> data8=Arrays.asList(model.t8);
      List<String> data9=Arrays.asList(model.t9);
      List<String> data10=Arrays.asList(model.t10);
      List<String> data11=Arrays.asList(model.t11);
      List<String> data12=Arrays.asList(model.t12);
     List<String> data13=Arrays.asList(model.t13);
    List<String> data14=Arrays.asList(model.t14);
   data.add(data1);
    data.add(data2);
    data.add(data3);
    data.add(data4);
    data.add(data5);
    data.add(data6);
    data.add(data7);
    data.add(data8);
    data.add(data9);
    data.add(data10);
    data.add(data11);
    data.add(data12);
    data.add(data13);
    data.add(data14);
}
}
