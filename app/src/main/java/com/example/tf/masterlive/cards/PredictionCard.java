package com.example.tf.masterlive.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.tf.masterlive.R;
import com.example.tf.masterlive.beans.BaseBean;
import com.example.tf.masterlive.beans.PredictionBean;

/**
 * Created by TF on 2017/6/1.
 */

public class PredictionCard extends BaseCard{



    public PredictionCard(@NonNull Context context) {
        super(context);
    }

    public PredictionCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getCardId() {
        return R.layout.predictionlayout;
    }

    @Override
    protected void getCardClick() {

    }

    @Override
    public void bindbeab(BaseBean baseBean) {
        if (baseBean==null){
            return;
        }
        PredictionBean predictionBean = (PredictionBean) baseBean;

    }
}
