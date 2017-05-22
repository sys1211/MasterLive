package com.example.tf.masterlive.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/5/22.
 */

public class TabLayoutFragmentadapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> arrayList;
    private Context context;
    private ArrayList<String> title;
    public TabLayoutFragmentadapter(FragmentManager fm, ArrayList<Fragment> arrayList, ArrayList<String> title) {
        super(fm);
        this.arrayList=arrayList;

        this.title=title;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
}
