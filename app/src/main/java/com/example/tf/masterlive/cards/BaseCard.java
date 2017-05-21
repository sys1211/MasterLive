package com.example.tf.masterlive.cards;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.example.tf.masterlive.beans.BaseBean;


/**
 * Created by le on 2017/4/11.
 */

public abstract class BaseCard extends FrameLayout{
    private Context mContext;
    protected View mView;

    public BaseCard(@NonNull Context context) {
        super(context);
        init(context);
    }

    public BaseCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public BaseCard(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public BaseCard(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private  void init(Context context){
        mView=inflate(context,getCardId(),this);
        mContext=context;
        getCardClick();
    }

    protected abstract int getCardId();
    protected abstract void getCardClick();
    public abstract void bindbeab(BaseBean baseBean);
}
