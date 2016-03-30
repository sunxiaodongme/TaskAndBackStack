package com.example.sunxiaodong.taskandbackstack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by sunxiaodong on 2016/3/30.
 */
public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = SecondActivity.class.getSimpleName();
    private static final String SXD = "sxd";

    private Button mGoThirdActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initView();
        Log.i(SXD, TAG + "--taskId:" + getTaskId());//获取当前Activity所在Task的id
    }

    private void initView() {
        mGoThirdActivity = (Button) findViewById(R.id.go_third_activity);
        mGoThirdActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go_third_activity:
                goThirdActivity();
                break;
        }
    }

    private void goThirdActivity() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

}