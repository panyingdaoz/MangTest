package com.kingbird.mangtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

/**
 * @ClassName: CopyrightTransactionActivity
 * @Description: 版权交易
 * @Author: Pan
 * @CreateDate: 2020/3/3 15:05
 */
public class CopyrightTransactionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //去除标题栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copyright_transaction);
    }
}
