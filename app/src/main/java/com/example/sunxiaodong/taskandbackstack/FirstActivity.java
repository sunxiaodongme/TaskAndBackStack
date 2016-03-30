package com.example.sunxiaodong.taskandbackstack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = FirstActivity.class.getSimpleName();
    private static final String SXD = "sxd";

    private Button mGoSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        initView();
        Log.i(SXD, TAG + "--taskId:" + getTaskId());//获取当前Activity所在Task的id
    }

    private void initView() {
        mGoSecondActivity = (Button) findViewById(R.id.go_second_activity);
        mGoSecondActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go_second_activity:
                goSecondActivity();
                break;
        }
    }

    private void goSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
