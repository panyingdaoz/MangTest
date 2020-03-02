package com.kingbird.mangtest.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.youth.banner.loader.ImageLoader;

/**
 * ViewPager辅助类
 *
 * @author Panyingdao
 * @date 2019/1/21/021.
 */
public class GlideImageLoaderFillet extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        //设置图片圆角角度
        RoundedCorners roundedCorners = new RoundedCorners(6);
        //通过RequestOptions扩展功能
        RequestOptions options = RequestOptions.bitmapTransform(roundedCorners);
        Glide.with(context).load(path).apply(options).into(imageView);
    }
}
