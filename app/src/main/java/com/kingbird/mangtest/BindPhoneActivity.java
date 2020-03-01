package com.kingbird.mangtest;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;

import static com.kingbird.mangtest.utils.BaseUtils.getCode;

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
