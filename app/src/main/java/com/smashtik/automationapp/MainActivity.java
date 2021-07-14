package com.smashtik.automationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.smashtik.automationapp.ui.dataadapter.LongListActivity;
import com.smashtik.automationapp.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private Button goToList;
    private Button goToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToList = findViewById(R.id.gotolist);
        goToLogin = findViewById(R.id.gotologin);
        goToList.setOnClickListener(v -> openLongListActivity());
        goToLogin.setOnClickListener(v ->openLoginActivity());

    }

    public void openLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void openLongListActivity() {
        Intent intent = new Intent(this,LongListActivity.class);
        startActivity(intent);
    }
    
    private void createIntentAndStartActivity(Object activity){
        Intent intent = new Intent(this, activity.getClass());
        startActivity(intent);
    }
}