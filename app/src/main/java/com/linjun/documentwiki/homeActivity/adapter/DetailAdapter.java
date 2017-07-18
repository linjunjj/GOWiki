package com.linjun.documentwiki.homeActivity.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.linjun.documentwiki.R;
import com.linjun.documentwiki.model.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linjun on 2017/7/14.
 */

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {

        private  List<String> data=new ArrayList<>();
    private LayoutInflater mInflater;
      public DetailAdapter(Context context, List<String> data){
              mInflater=LayoutInflater.from(context);
          this.data=data;

          }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=mInflater.inflate(R.layout.iten_content,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
     holder.title.setText(data.get(position));
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mListener.OnClick(view, (Integer) view.getTag());
            }
        });
    }
    @Override
    public int getItemCount() {
        return data.size();
    }
class  ViewHolder extends RecyclerView.ViewHolder{
    TextView title;
    RelativeLayout press;
    public ViewHolder(View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.tv_text);
        press=itemView.findViewById(R.id.press);
    }

}
private  OnClickListener mListener;
public  interface  OnClickListener{
    void OnClick(View view,int position);
}
public  DetailAdapter setListener(OnClickListener listener){
      mListener=listener;
      return this;
}

}