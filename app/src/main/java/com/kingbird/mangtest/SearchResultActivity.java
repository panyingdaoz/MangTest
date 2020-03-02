package com.kingbird.mangtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;


/**
 * @ClassName: SearchResultActivity
 * @Description: 首页-搜索-结果
 * @Author: Pan
 * @CreateDate: 2020/3/3 14:41
 */
public class SearchResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //去除标题栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
    }
}
