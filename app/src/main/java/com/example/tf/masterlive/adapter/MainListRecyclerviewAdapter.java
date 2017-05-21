package com.example.tf.masterlive.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;


import com.example.tf.masterlive.beans.BaseBean;
import com.example.tf.masterlive.cards.BaseCard;

import java.util.ArrayList;

/**
 * Created by le on 2017/4/11.
 */

public class MainListRecyclerviewAdapter extends RecyclerView.Adapter<MainListRecyclerviewAdapter.Viewhodler>{
    private ArrayList<BaseBean> list;
    private Context mContext;

    public MainListRecyclerviewAdapter(ArrayList<BaseBean> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public Viewhodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=null;
//        if (viewType==ContentBean.class.getCanonicalName().hashCode()) {
//            view=new ContentCard(mContext);
//        } else if (viewType== NoDataBean.class.getCanonicalName().hashCode()) {
//            view=new NoDataCard(mContext);
//        }
        return new Viewhodler(view);
    }

    @Override
    public void onBindViewHolder(Viewhodler holder, int position) {
        ((BaseCard)holder.itemView).bindbeab(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        int viewtype=-1;
        if (position>=0&&list.get(position)!=null) {
//            if (list.get(position) instanceof ContentBean) {
//                viewtype=ContentBean.class.getCanonicalName().hashCode();
//            } else if (list.get(position) instanceof NoDataBean) {
//                viewtype= NoDataBean.class.getCanonicalName().hashCode();
//            }
        }
        return viewtype;
    }

    class Viewhodler extends RecyclerView.ViewHolder{

        public Viewhodler(View itemView) {
            super(itemView);
        }
    }
}
