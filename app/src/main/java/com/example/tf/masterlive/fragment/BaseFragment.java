package com.example.tf.masterlive.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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
    protected ArrayList<BaseBean> list;
    protected MainListRecyclerviewAdapter adapter;
    protected String smb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(getFragmnetView(),null);
        try {
            initview();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return view;
    }

    public void init() {
        rv= (RecyclerView) view.findViewById(getRecyclerview());
        list=new ArrayList<>();
        adapter=new MainListRecyclerviewAdapter(list,getContext());
        LinearLayoutManager manager=new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);


    }


    protected abstract int getFragmnetView();
    protected abstract int getRecyclerview();
    public abstract void initview() throws JSONException;

}
