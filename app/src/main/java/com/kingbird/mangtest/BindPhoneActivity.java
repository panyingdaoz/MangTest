package com.kingbird.mangtest;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;

import static com.kingbird.mangtest.utils.BaseUtils.getCode;

/**
 * @ClassName: BindPhoneActivity
 * @Description: 绑定手机号
 * @Author: Pan
 * @CreateDate: 2020/2/27 10:05
 */
public class BindPhoneActivity extends AppCompatActivity {

    private ImageView mImageViewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去除标题栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_bind_phone);

        mImageViewCode = findViewById(R.id.imageViewCode);
        getCode(mImageViewCode);
    }
}
