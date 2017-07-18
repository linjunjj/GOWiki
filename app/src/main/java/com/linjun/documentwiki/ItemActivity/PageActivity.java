package com.linjun.documentwiki.ItemActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.linjun.documentwiki.R;
import com.linjun.documentwiki.model.Model;
import com.zzhoujay.markdown.MarkDown;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by linjun on 2017/7/18.
 */

public class PageActivity extends AppCompatActivity {

    @BindView(R.id.iv_oneback)
    ImageView ivOneback;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.tv_text)
    TextView tvText;
    private int page;
    private String sum;
    private  int end;
    private String header;
    private Model model;
    private List<List<String>> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        ButterKnife.bind(this);
        initdatas();
        Bundle bundle = getIntent().getExtras();
        page = bundle.getInt("page");
        end = bundle.getInt("list");
        sum= String.valueOf(end+1);
        tvText.setText(data.get(page).get(end));
        assert textView != null;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        showlist(page);
        initdata();
    }

    private void showlist(int a) {
        switch (a) {
            case 0:
                header = "01";
                break;
            case 1:
                header = "02";
                break;
            case 2:
                header = "03";
                break;
            case 3:
                header = "04";
                break;
            case 4:
                header = "05";
                break;
            case 5:
                header = "06";
                break;
            case 6:
                header = "07";
                break;
            case 7:
                header = "08";
                break;
            case 8:
                header = "09";
                break;
            case 9:
                header = "10";
                break;
            case 10:
                header = "11";
                break;
            case 11:
                header = "12";
                break;
            case 12:
                header = "13";
                break;
            case 13:
                header = "14";
                break;
        }
    }

    private void initdata() {
        String name = header + "." + sum + ".md";
        try {
            final InputStream stream = getResources().getAssets().open(name);
            textView.post(new Runnable() {
                @Override
                public void run() {
                    Spanned spanned = MarkDown.fromMarkdown(stream, new Html.ImageGetter() {
                        public static final String TAG = "Markdown";

                        @Override
                        public Drawable getDrawable(String source) {
                            Log.d(TAG, "getDrawable() called with: source = [" + source + "]");
                            Drawable drawable = new ColorDrawable(Color.LTGRAY);
                            drawable.setBounds(0, 0, textView.getWidth() - textView.getPaddingLeft() - textView.getPaddingRight(), 400);
                            return drawable;
                        }
                    }, textView);
                    textView.setText(spanned);
                }
            });


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.iv_oneback)
    public void onViewClicked() {
        finish();
    }

    private void initdatas() {
        model = new Model();

        data = new ArrayList<>();
        List<String> data1 = Arrays.asList(model.ti);
        List<String> data2 = Arrays.asList(model.t2);
        List<String> data3 = Arrays.asList(model.t3);
        List<String> data4 = Arrays.asList(model.t4);
        List<String> data5 = Arrays.asList(model.t5);
        List<String> data6 = Arrays.asList(model.t6);
        List<String> data7 = Arrays.asList(model.t7);
        List<String> data8 = Arrays.asList(model.t8);
        List<String> data9 = Arrays.asList(model.t9);
        List<String> data10 = Arrays.asList(model.t10);
        List<String> data11 = Arrays.asList(model.t11);
        List<String> data12 = Arrays.asList(model.t12);
        List<String> data13 = Arrays.asList(model.t13);
        List<String> data14 = Arrays.asList(model.t14);
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
