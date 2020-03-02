package com.kingbird.mangtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kingbird.mangtest.ui.login.LoginActivity;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;

import static com.kingbird.mangtest.utils.BaseUtils.getCode;

/**
 * @ClassName: LoginCodeActivity
 * @Description: 验证码登录
 * @Author: Pan
 * @CreateDate: 2020/2/26 9:05
 */
public class LoginCodeActivity extends AppCompatActivity {

    private ImageView mImageViewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去除标题栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_login_code);

        mImageViewCode = findViewById(R.id.imageViewCode);
        getCode(mImageViewCode);
    }

    public void onAccountLogin(View view) {
        Intent intent = new Intent(LoginCodeActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
