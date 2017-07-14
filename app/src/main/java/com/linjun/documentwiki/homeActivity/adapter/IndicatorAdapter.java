package com.linjun.documentwiki.homeActivity.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.linjun.documentwiki.R;
import com.shizhefei.view.indicator.IndicatorViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linjun on 2017/7/14.
 */

public class IndicatorAdapter extends IndicatorViewPager.IndicatorFragmentPagerAdapter {
         String[] title={"Go环境配置","Go语言基础","Web基础","表单","访问数据库","session和数据存储",
                 "文本文件处理","Web服务","安全与加密","国际化和本地化","测试","部署与维护",
          "自己定义web框架","扩展Web框架"};
    private LayoutInflater inflater;
    private Context mContext;
    //private  final List<Fragment> mFragement;
    public IndicatorAdapter(FragmentManager fragmentManager,Context context) {
        super(fragmentManager);
        mContext=context;
        inflater=LayoutInflater.from(context);
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
        return null;
    }
    private List<Fragment> initFragment(){
        List<Fragment> fragments=new ArrayList<>();


      return  fragments;
    }
}
