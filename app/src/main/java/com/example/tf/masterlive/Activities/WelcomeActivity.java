package com.example.tf.masterlive.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.view.Window;

import com.example.tf.masterlive.R;

public class WelcomeActivity extends Activity {
    private Handler hd=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Intent i=new Intent(WelcomeActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);
        hd.sendEmptyMessageDelayed(100,3000);
    }
}
