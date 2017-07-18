package com.linjun.documentwiki.homeActivity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.linjun.documentwiki.ItemActivity.PageActivity;
import com.linjun.documentwiki.R;
import com.linjun.documentwiki.homeActivity.adapter.DetailAdapter;
import com.linjun.documentwiki.homeActivity.decoration.DividerItemDecoration;
import com.linjun.documentwiki.utils.ActionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by linjun on 2017/7/14.
 */

public class ContentFragment extends Fragment {


    Unbinder unbinder;
    @BindView(R.id.rv)
    RecyclerView rv;
     private int page;
      private  List<String> list ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_content, container, false);
        unbinder = ButterKnife.bind(this, view);
        list= (List<String>) getArguments().getSerializable("type");
        page=getArguments().getInt("page");
        DetailAdapter adapter = new DetailAdapter(getActivity(), list);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(adapter);
        rv.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL_LIST));
        adapter.setListener(new DetailAdapter.OnClickListener() {
            @Override
            public void OnClick(View view, int position) {
                   switch (view.getId()){
                       case R.id.press:
                           Bundle bundle=new Bundle();
                           bundle.putInt("page",page);
                           bundle.putInt("list",position);
                           ActionUtils.actionStart(getActivity(), PageActivity.class,bundle);
                           break;
                   }
            }
        });

        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
