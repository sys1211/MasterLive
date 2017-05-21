package com.example.tf.masterlive.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tf.masterlive.R;

/**
 * Created by TF on 2017/5/21.
 */

public class RankFragment extends Fragment{
    private  View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.rankfragment,null);
        return v;
    }
}
