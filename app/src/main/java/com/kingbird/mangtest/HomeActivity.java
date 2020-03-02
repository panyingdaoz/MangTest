package com.kingbird.mangtest;

import android.os.Bundle;

import com.kingbird.mangtest.utils.GlideImageLoader;
import com.socks.library.KLog;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @ClassName: HomeActivity
 * @Description: 首页
 * @Author: Pan
 * @CreateDate: 2020/1/17 17:05
 */
public class HomeActivity extends AppCompatActivity implements OnBannerListener {

    private Banner banner;
    private List<String> list_path = new ArrayList<>();
    private List<Integer> list_path2 = new ArrayList<>();
    private List<HomeContent> listCreative = new ArrayList<>();
    private List<HomeContent> listMango = new ArrayList<>();
    private List<HomeContent> listGolden = new ArrayList<>();
    private RecyclerView homeCreative, homeMango, homeGoldenBeeAudio;
    private String creative, content;
    private int resId;
    private String creative2, content2;
    private int resId2;
    private String creative3, content3;
    private int resId3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去除标题栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_home);

        initView();

        for (int i = 0; i < 3; i++) {
            resId = R.mipmap.home_48;
            KLog.e("文件ID = " + resId);
            creative = "《南泥湾》";
            content = "汪峰：搜罗民谣里的记忆";
            HomeContent creativeData = new HomeContent(creative, resId, content);
            listCreative.add(creativeData);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(HomeActivity.this);
        //设置方向为横向，不设置默认为纵向
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        homeCreative.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(listCreative);
        homeCreative.setNestedScrollingEnabled(true);
        homeCreative.scrollToPosition(adapter.getItemCount() - 1);
        homeCreative.setAdapter(adapter);

        for (int i = 0; i < 3; i++) {
            resId = R.mipmap.img_home_pic02;
            KLog.e("文件ID = " + resId);
            creative = "《南泥湾》";
            content = "汪峰：搜罗民谣里的记忆";
            HomeContent creativeData = new HomeContent(creative, resId, content);
            listMango.add(creativeData);
        }

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(HomeActivity.this);
        //设置方向为横向，不设置默认为纵向
        layoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        homeMango.setLayoutManager(layoutManager2);
        MyAdapter adapter2 = new MyAdapter(listMango);
        homeMango.setNestedScrollingEnabled(true);
        homeMango.scrollToPosition(adapter2.getItemCount() - 1);
        homeMango.setAdapter(adapter2);

        for (int i = 0; i < 3; i++) {
            resId = R.mipmap.img_home_pic03;
            KLog.e("文件ID = " + resId);
            creative = "哈喽葡星人";
            content = "汪峰：搜罗民谣里的记忆";
            HomeContent creativeData = new HomeContent(creative, resId, content);
            listGolden.add(creativeData);
        }

        LinearLayoutManager layoutManager3 = new LinearLayoutManager(HomeActivity.this);
        //设置方向为横向，不设置默认为纵向
        layoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        homeGoldenBeeAudio.setLayoutManager(layoutManager3);
        MyAdapter adapter3 = new MyAdapter(listGolden);
        homeGoldenBeeAudio.setNestedScrollingEnabled(true);
        homeGoldenBeeAudio.scrollToPosition(adapter3.getItemCount() - 1);
        homeGoldenBeeAudio.setAdapter(adapter3);
    }

    private void initView() {
        banner = findViewById(R.id.banner);
        homeCreative = findViewById(R.id.recyclerViewHorizontal);
        homeMango = findViewById(R.id.recyclerViewHorizonta2);
        homeGoldenBeeAudio = findViewById(R.id.recyclerViewHorizonta3);

//        //放图片地址的集合
//        list_path = new ArrayList<>();

        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg");
        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic259ohaj30ci08c74r.jpg");
        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2b16zuj30ci08cwf4.jpg");
        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2e7vsaj30ci08cglz.jpg");

        list_path2.add(R.drawable.home_215);
        list_path2.add(R.drawable.img_home_banner);
        list_path2.add(R.drawable.home_215);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(list_path2);
        //banner设置方法全部调用完毕时最后调用
        banner.start();

    }

    @Override
    public void OnBannerClick(int position) {
        KLog.e("点击了——" + position + "——图片");
    }
}
