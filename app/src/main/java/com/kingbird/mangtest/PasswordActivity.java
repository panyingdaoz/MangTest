package com.kingbird.mangtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;

import static com.kingbird.mangtest.utils.BaseUtils.getCode;

/**
 * @ClassName: PasswordActivity
 * @Description: 忘记密码
 * @Author: Pan
 * @CreateDate: 2020/1/17 17:05
 */
public class PasswordActivity extends AppCompatActivity {

    private ImageView mImageViewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去除标题栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_password);

        mImageViewCode = findViewById(R.id.imageViewCode);
        getCode(mImageViewCode);
    }

    public void onSubmit(View view) {
        Intent intent = new Intent(PasswordActivity.this, SettingPasswordActivity.class);
        startActivity(intent);
    }
}
