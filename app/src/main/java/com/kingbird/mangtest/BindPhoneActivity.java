package com.kingbird.mangtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import static com.kingbird.mangtest.utils.BaseUtils.getCode;

public class BindPhoneActivity extends AppCompatActivity {

    private ImageView mImageViewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind_phone);

        mImageViewCode = findViewById(R.id.imageViewCode);
        getCode(mImageViewCode);
    }
}
