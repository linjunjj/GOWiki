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
    public IndicatorAdapter(FragmentManager fragmentManager,Context context) {
        super(fragmentManager);
        mContext=context;
        inflater=LayoutInflater.from(context);
       mFragement=initFragment();
        init();
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
        int size=title.length;
        for (int i = 0; i < size; i++) {
            Bundle arg = new Bundle();
            arg.putSerializable("type", (Serializable) model.data.get(i));
            ContentFragment fragment=new ContentFragment();
              fragment.setArguments(arg);
            fragments.add(fragment);
        }
     return  fragments;
   }
   private  void init(){
        model=new Model();
        model.data.add(Model.data1);
       model.data.add(Model.data2);
       model.data.add(Model.data3);
       model.data.add(Model.data4);
       model.data.add(Model.data5);
       model.data.add(Model.data6);
       model.data.add(Model.data7);
       model.data.add(Model.data8);
       model.data.add(Model.data9);
       model.data.add(Model.data10);
       model.data.add(Model.data11);
       model.data.add(Model.data12);
       model.data.add(Model.data13);
       model.data.add(Model.data14);
   }
}
