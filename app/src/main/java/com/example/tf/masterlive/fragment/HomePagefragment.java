package com.example.tf.masterlive.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tf.masterlive.R;

/**
 * Created by Administrator on 2017/5/22.
 */

public class HomePagefragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.homepage__fragment,null);
        initview();
        return v;
    }

    private void initview() {
        HomePageDataFragment hpdf=new HomePageDataFragment();
        getActivity().getSupportFragmentManager().beginTransaction().add(R.id.homepage_fl,hpdf).commit();
    }
}
