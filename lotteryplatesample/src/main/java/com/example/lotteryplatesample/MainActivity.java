package com.example.lotteryplatesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.hjm.lotteryplate.LotteryDisk;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private String[] strs = {"镭老板白金卡", "雷达宝×1", "套餐优惠铂金券", "锦囊×1", "镭老板白银卡", "套餐优惠银券",
            "免税银卡", "1000元天猫卡", "iPhone 7", "雷达币×1", "免税金卡", "套餐优惠金券"};
    private LotteryDisk mLotteryDisk;
    private ImageView mGo;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLotteryDisk = (LotteryDisk) findViewById(R.id.activity_lotteryplate_rotatePan);
        mEditText = (EditText) findViewById(R.id.stopPosition);
        mGo = (ImageView) findViewById(R.id.activity_lotteryplate_go);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditText.getText().toString().trim())) {
                    Toast.makeText(MainActivity.this, "请输入position", Toast.LENGTH_SHORT).show();
                    return;
                }
                int stopPosition = Integer.valueOf(mEditText.getText().toString());
                mLotteryDisk.startRotate(stopPosition);
            }
        });

        mLotteryDisk.setAnimationEndListener(new LotteryDisk.AnimationEndListener() {
            @Override
            public void endAnimation(int position) {
                Log.e(TAG, "position: "+position+"; 礼物: "+strs[position]);
                Toast.makeText(MainActivity.this, "position: "+position+"; 奖品: "+strs[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
