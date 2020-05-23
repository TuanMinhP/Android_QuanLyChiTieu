package com.example.doanltdd.plan;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.doanltdd.R;
import com.example.doanltdd.function.BottomNavigationViewSetting;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PlanActivity extends AppCompatActivity {

    private static final String TAG = "PlanActivity";
    private static final int ACTIVITY_NUMBER = 3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        setupBottomNavigationView();

    }

    private void setupBottomNavigationView(){
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewSetting.enableNavigation(PlanActivity.this, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUMBER);
        menuItem.setChecked(true);
    }
}
