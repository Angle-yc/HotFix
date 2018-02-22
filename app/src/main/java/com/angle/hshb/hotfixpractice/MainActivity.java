package com.angle.hshb.hotfixpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements HotFixApplication.MsgDisplayListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"第二次启动",Toast.LENGTH_LONG).show();
    }

    @Override
    public void handle(String msg) {
        Log.i("hot_fix===",msg);
    }
}
