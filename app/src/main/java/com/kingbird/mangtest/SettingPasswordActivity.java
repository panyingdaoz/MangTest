package com.kingbird.mangtest;

import android.os.Bundle;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @ClassName: SettingPasswordActivity
 * @Description: 设置密码
 * @Author: Pan
 * @CreateDate: 2020/2/28 14:05
 */
public class SettingPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去除标题栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_setting_password);
    }
}
