package com.example.tf.masterlive.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;

import com.example.tf.masterlive.R;
import com.example.tf.masterlive.beans.BaseBean;

/**
 * Created by TF on 2017/6/1.
 */

public class LiveRecyclerCard extends BaseCard{
    public LiveRecyclerCard(@NonNull Context context) {
        super(context);
    }

    public LiveRecyclerCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getCardId() {
        return R.layout.liverecyclerlayout;
    }
    private RecyclerView rv;
    @Override
    protected void getCardClick() {
        rv= (RecyclerView) mView.findViewById(R.id.liverecyclerview);
        StaggeredGridLayoutManager sglm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rv.setLayoutManager(sglm);
    }

    @Override
    public void bindbeab(BaseBean baseBean) {
        if (baseBean==null){
            return;
        }
    }
}
