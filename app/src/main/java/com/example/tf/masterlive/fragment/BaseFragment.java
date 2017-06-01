package com.example.tf.masterlive.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.tf.masterlive.R;
import com.example.tf.masterlive.adapter.MainListRecyclerviewAdapter;
import com.example.tf.masterlive.beans.BaseBean;

import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public abstract class BaseFragment extends Fragment {
    protected View view;
    protected RecyclerView rv;
    protected MainListRecyclerviewAdapter adapter;
    protected String smb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.homepagerecycler,null);
        rv = (RecyclerView) view.findViewById(R.id.homepage_rcv1);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rv.setLayoutManager(manager);
        onstart();



        return view;
    }
    public abstract void onstart();

    public void setadapter(ArrayList<BaseBean> listBean){
        adapter = new MainListRecyclerviewAdapter(listBean,getContext());
        rv.setAdapter(adapter);
    }



}
