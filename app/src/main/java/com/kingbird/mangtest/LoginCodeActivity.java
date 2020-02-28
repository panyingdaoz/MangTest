package com.kingbird.mangtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kingbird.mangtest.ui.login.LoginActivity;

import static com.kingbird.mangtest.utils.BaseUtils.getCode;

public class LoginCodeActivity extends AppCompatActivity {

    private ImageView mImageViewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);

        mImageViewCode = findViewById(R.id.imageViewCode);
        getCode(mImageViewCode);
    }

    public void onAccountLogin(View view) {
        Intent intent = new Intent(LoginCodeActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
