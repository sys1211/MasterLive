package com.example.tf.masterlive.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tf.masterlive.Activities.InputMethodManagerTest;
import com.example.tf.masterlive.R;
import com.example.tf.masterlive.adapter.TabLayoutFragmentadapter;

import java.util.ArrayList;

/**
 * Created by TF on 2017/5/21.
 */

public class LiveFragment extends Fragment{
    private TabLayoutFragmentadapter myadapter;
    private ArrayList<Fragment> arrayList;
    private ArrayList<String> Tab_title;
    private ViewPager vp;
    private TabLayout tabLayout;
    private ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.livefragment,null);
        imageView= (ImageView) v.findViewById(R.id.search);
        vp= (ViewPager)v.findViewById(R.id.viewpager);
        tabLayout= (TabLayout)v.findViewById(R.id.tabLayout);
        arrayList=new ArrayList<>();
        arrayList.add(new Attentionfragment());
        arrayList.add(new HomePagefragment());
        arrayList.add(new Valuefragment());

        Tab_title=new ArrayList<>();
        Tab_title.add("关注");
        Tab_title.add("首页");
        Tab_title.add("价值");

        tabLayout.addTab(tabLayout.newTab().setText(Tab_title.get(0)));
        tabLayout.addTab(tabLayout.newTab().setText(Tab_title.get(1)));
        tabLayout.addTab(tabLayout.newTab().setText(Tab_title.get(2)));

        FragmentManager fragmentManager=getFragmentManager();
        myadapter=new TabLayoutFragmentadapter(fragmentManager,arrayList,Tab_title);
        vp.setAdapter(myadapter);
        tabLayout.setupWithViewPager(vp);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), InputMethodManagerTest.class);
                startActivity(intent);
            }
        });
        return v;
    }



}
