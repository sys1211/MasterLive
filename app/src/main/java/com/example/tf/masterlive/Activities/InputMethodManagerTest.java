package com.example.tf.masterlive.Activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tf.masterlive.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/5/22.
 */

    public class InputMethodManagerTest extends Activity {

    private TextView mTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        imageView= (ImageView) findViewById(R.id.imageview_ser);
        mTextView = (TextView) findViewById(R.id.search_cancle);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //调用软键盘
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }, 100);


    }
}