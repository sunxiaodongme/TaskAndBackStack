package com.example.sunxiaodong.taskandbackstack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by sunxiaodong on 2016/3/30.
 */
public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ThirdActivity.class.getSimpleName();
    private static final String SXD = "sxd";

    private Button mGoFourthActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        initView();
        Log.i(SXD, TAG + "--taskId:" + getTaskId());//获取当前Activity所在Task的id
    }

    private void initView() {
        mGoFourthActivity = (Button) findViewById(R.id.go_fourth_activity);
        mGoFourthActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go_fourth_activity:
                goFourthActivity();
                break;
        }
    }

    private void goFourthActivity() {

    }

}