package com.example.doanltdd.account;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.doanltdd.R;
import com.example.doanltdd.function.BottomNavigationViewSetting;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AccountActivity extends AppCompatActivity {
    private static final String TAG = "AccountActivity";
    private static final int ACTIVITY_NUMBER = 4;
    ScrollView scrollView;

    public void onClick_img_account(View view) {
        Toast.makeText(AccountActivity.this,"Click Image Tài Khoản",Toast.LENGTH_SHORT).show();
    }


    public void onClick_group(View view) {
        Toast.makeText(AccountActivity.this,"Click Nhóm",Toast.LENGTH_SHORT).show();
    }
    public void onClick_tool(View view) {
        Toast.makeText(AccountActivity.this,"Click Công cụ",Toast.LENGTH_SHORT).show();
    }
    public void onClick_setting(View view) {
        Toast.makeText(AccountActivity.this,"Click Cài đặt",Toast.LENGTH_SHORT).show();
    }
    public void onClick_help(View view) {
        Toast.makeText(AccountActivity.this,"Click Hỗ trợ",Toast.LENGTH_SHORT).show();
    }
    public void onClick_about(View view) {
        Toast.makeText(AccountActivity.this,"Click Giới thiệu",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        setupBottomNavigationView();

    }

    private void setupBottomNavigationView(){
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewSetting.enableNavigation(AccountActivity.this, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUMBER);
        menuItem.setChecked(true);
    }
}
