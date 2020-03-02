package com.kingbird.mangtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.hymanme.tagflowlayout.TagFlowLayout;

import java.util.Objects;

/**
 * @ClassName: HomeSearchGistoryActivity
 * @Description: 首页-搜索-记录
 * @Author: Pan
 * @CreateDate: 2020/3/3 14:05
 */
public class HomeSearchGistoryActivity extends AppCompatActivity {

    private TagFlowLayout mTagFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去除标题栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_home_search_gistory);

        initView();
    }

    private void initView() {
        mTagFlowLayout = findViewById(R.id.tag_flow_layout);
        mTagFlowLayout.setTitle("记录在此：");
        mTagFlowLayout.setTitleTextColor(getResources().getColor(R.color.colorPrimaryDark));
        mTagFlowLayout.setTitleTextSize(12);
        //最小显示高度(单位dp)
        mTagFlowLayout.setMinVisibleHeight(100);
        //最大显示高度(单位dp)
        mTagFlowLayout.setMaxVisibleHeight(400);
        mTagFlowLayout.setAnimationDuration(600);
        //设置背景颜色
        mTagFlowLayout.setBackGroundColor(getResources().getColor(R.color.primary_text));
    }
}
