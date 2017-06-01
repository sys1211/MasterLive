package com.example.tf.masterlive.fragment;

import com.example.tf.masterlive.R;
import com.example.tf.masterlive.beans.BaseBean;
import com.example.tf.masterlive.beans.PredictionBean;

import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by TF on 2017/6/1.
 */

public class HomePageDataFragment extends BaseFragment{
    private ArrayList<BaseBean> beanArrayList;
    @Override
    public void onstart() {
        beanArrayList = new ArrayList<>();
        PredictionBean predictionBean = new PredictionBean();
        beanArrayList.add(predictionBean);

        setadapter(beanArrayList);
    }
}
