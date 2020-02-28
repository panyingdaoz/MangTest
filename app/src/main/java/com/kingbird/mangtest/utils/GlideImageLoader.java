package com.kingbird.mangtest.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * ViewPager辅助类
 *
 * @author Panyingdao
 * @date 2019/1/21/021.
 */
public class GlideImageLoader extends ImageLoader {
  @Override
  public void displayImage(Context context, Object path, ImageView imageView) {
    Glide.with(context).load(path).into(imageView);
  }
}
