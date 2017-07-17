package com.linjun.documentwiki.ItemActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.linjun.documentwiki.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by linjun on 2017/7/17.
 */

public class AboutActivity extends AppCompatActivity {
    @BindView(R.id.iv_oneback)
    ImageView ivOneback;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        toolbar.setTitle("关于");
    }

    @OnClick(R.id.iv_oneback)
    public void onViewClicked() {
            finish();
    }
}
