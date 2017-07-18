package com.linjun.documentwiki.homeActivity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.linjun.documentwiki.ItemActivity.AboutActivity;
import com.linjun.documentwiki.R;
import com.linjun.documentwiki.homeActivity.adapter.IndicatorAdapter;
import com.linjun.documentwiki.model.Model;
import com.linjun.documentwiki.utils.ActionUtils;
import com.shizhefei.view.indicator.IndicatorViewPager;
import com.shizhefei.view.indicator.ScrollIndicatorView;
import com.shizhefei.view.indicator.slidebar.TextWidthColorBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * Created by linjun on 2017/7/14.
 */

public class homeActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.indicator)
    ScrollIndicatorView indicator;
    @BindView(R.id.vp)
    ViewPager vp;
    private Model model;
    private IndicatorViewPager mIndicatorViewPager;
    // public List<List<String>> data;
    private OnekeyShare mOks;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar.setTitle("GO语言学习手册");
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(onMenuItemClick);
        init();
    }

    private void init() {
        mIndicatorViewPager = new IndicatorViewPager(indicator, vp);
        mIndicatorViewPager.setIndicatorScrollBar(new TextWidthColorBar(this, indicator, getResources().getColor(R.color.colorPrimary), 2));
        IndicatorAdapter adapter = new IndicatorAdapter(getSupportFragmentManager(), this);
        mIndicatorViewPager.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        return true;
    }

    private Toolbar.OnMenuItemClickListener onMenuItemClick = new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {

            switch (menuItem.getItemId()) {
                case R.id.action_search:
                    break;
                case R.id.action_share:
                    startShare();
                    break;
                case R.id.action_settings:
                    ActionUtils.actionStart(homeActivity.this, AboutActivity.class);
                    break;
            }
            return true;
        }
    };

    private void startShare() {
        mOks = new OnekeyShare();
        mOks.setTitle("Go学习手册");
        mOks.setText("离线式的学习手册");
        mOks.setImageUrl("http://www.link-pub.cn/static/upload/201503191232034.png");
        mOks.setComment("Go语言");
        mOks.setSite(getString(R.string.app_name));
        mOks.show(this);
    }
}
