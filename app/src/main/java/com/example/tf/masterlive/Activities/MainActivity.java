package com.example.tf.masterlive.Activities;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.tf.masterlive.R;
import com.example.tf.masterlive.fragment.FindFragment;
import com.example.tf.masterlive.fragment.LiveFragment;
import com.example.tf.masterlive.fragment.MineFragment;
import com.example.tf.masterlive.fragment.RankFragment;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup rg;
    private RadioButton[] rbarr;
    private ArrayList<Fragment> list;
    private FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {
        rg= (RadioGroup) findViewById(R.id.home_rg);
        fm=getSupportFragmentManager();
        list=new ArrayList<>();
        LiveFragment lf=new LiveFragment();
        RankFragment rf=new RankFragment();
        FindFragment ff=new FindFragment();
        MineFragment mf=new MineFragment();
        list.add(lf);
        list.add(rf);
        list.add(ff);
        list.add(mf);
        rbarr=new RadioButton[rg.getChildCount()];
        for (int i = 0; i < rg.getChildCount(); i++) {
            rbarr[i]= (RadioButton) rg.getChildAt(i);
        }
        rbarr[0].setChecked(true);
        rg.setOnCheckedChangeListener(this);
        fm.beginTransaction().add(R.id.home_fl1, list.get(0)).commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId){
            case R.id.home_rb1:
                rbshow(checkedId);
                break;
            case R.id.home_rb2:
                rbshow(checkedId);
                break;
            case R.id.home_rb3:
                rbshow(checkedId);
                break;
            case R.id.home_rb4:
                rbshow(checkedId);
                break;
            default:
                break;
        }
    }
    private int num=0;
    private void rbshow(int checkedId) {
        FragmentTransaction ft=fm.beginTransaction();
        for (int i = 0; i < rg.getChildCount(); i++) {
            if (rbarr[i].getId() == checkedId) {
                if (list.get(i).isAdded()) {
                    ft.show(list.get(i)).hide(list.get(num)).commit();
                } else {
                    ft.add(R.id.home_fl1, list.get(i)).hide(list.get(num)).commit();
                }
                num = i;
            }
        }
    }
}
