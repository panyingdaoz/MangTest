package com.kingbird.mangtest.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

import com.socks.library.KLog;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @ClassName: BaseUtils
 * @Description: java类作用描述
 * @Author: Pan
 * @CreateDate: 2020/2/25 9:55
 */
public class BaseUtils {

    public static void getCode(final ImageView codeView) {
        final Bitmap[] bitmap = {CodeUtils.getInstance().createBitmap()};
        final String[] code = {CodeUtils.getInstance().getCode()};
        codeView.setImageBitmap(bitmap[0]);
        codeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bitmap[0] = CodeUtils.getInstance().createBitmap();
                code[0] = CodeUtils.getInstance().getCode();
                codeView.setImageBitmap(bitmap[0]);
                KLog.e("点击验证码图片");
            }
        });
    }

    public static String getFromAssets(Context context, String fileName) {
        try {
            InputStreamReader inputReader = new InputStreamReader(context.getResources().getAssets().open(fileName));
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line;
            String result = "";
            while ((line = bufReader.readLine()) != null) {
                result += line;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "22";
    }
}
