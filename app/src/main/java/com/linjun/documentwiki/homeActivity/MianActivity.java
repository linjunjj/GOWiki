package com.linjun.documentwiki.homeActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.linjun.documentwiki.R;
import com.shizhefei.view.indicator.IndicatorViewPager;
import com.shizhefei.view.indicator.ScrollIndicatorView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by linjun on 2017/7/14.
 */

public class MianActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.indicator)
    ScrollIndicatorView indicator;
    @BindView(R.id.vp)
    ViewPager vp;
    private IndicatorViewPager mIndicatorViewPager;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mIndicatorViewPager=new IndicatorViewPager(indicator,vp);

    }


}
