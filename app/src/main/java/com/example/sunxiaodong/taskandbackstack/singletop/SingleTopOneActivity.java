package com.example.sunxiaodong.taskandbackstack.singletop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.sunxiaodong.taskandbackstack.R;

/**
 * 启动模式为：singleTop
 */
public class SingleTopOneActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = SingleTopOneActivity.class.getSimpleName();
    private static final String SXD = "sxd";

    private Button mGoStandardTwoBtn;
    private Button mGoSingleTopOneBtn;
    private Button mGoSingleTaskOneBtn;
    private Button mGoSingleInstanceOneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singletop_one_activity);
        initView();
        Log.i(SXD, TAG + "--taskId:" + getTaskId());//获取当前Activity所在Task的id
    }

    private void initView() {
        mGoStandardTwoBtn = (Button) findViewById(R.id.go_standard_two);
        mGoStandardTwoBtn.setOnClickListener(this);

        mGoSingleTopOneBtn = (Button) findViewById(R.id.go_singletop_one);
        mGoSingleTopOneBtn.setOnClickListener(this);

        mGoSingleTaskOneBtn = (Button) findViewById(R.id.go_singletask_one);
        mGoSingleTaskOneBtn.setOnClickListener(this);

        mGoSingleInstanceOneBtn = (Button) findViewById(R.id.go_singleinstance_one);
        mGoSingleInstanceOneBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go_standard_two:
                goStandardTwo();
                break;
            case R.id.go_singletop_one:
                goSingleTopOne();
                break;
            case R.id.go_singletask_one:
                goSingleTaskOne();
                break;
            case R.id.go_singleinstance_one:
                goSingleInstanceOne();
                break;
        }
    }

    private void goStandardTwo() {

    }

    private void goSingleTopOne() {

    }

    private void goSingleTaskOne() {

    }

    private void goSingleInstanceOne() {

    }

}