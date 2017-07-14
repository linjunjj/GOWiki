package com.linjun.documentwiki.homeActivity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.linjun.documentwiki.R;
import com.linjun.documentwiki.model.Model;

/**
 * Created by linjun on 2017/7/14.
 */

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {
    private Model model;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
     holder.title.setText(model.ti[position]);
    }



    @Override
    public int getItemCount() {
        return 0;
    }
class  ViewHolder extends RecyclerView.ViewHolder{
    TextView title;
    public ViewHolder(View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.tv_text);
    }

}
}