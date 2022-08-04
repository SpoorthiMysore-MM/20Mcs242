package com.example.facebookapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void friends(View view){
        Intent i=new Intent(this,FriendsActivity2.class);
        startActivity(i);
    }
    public void chat(View view){
        Intent i=new Intent(this,ChattsActivity2.class);
        startActivity(i);
    }
    public void notification(View view){
        Intent i=new Intent(this,NotificationActivity2.class);
        startActivity(i);
    }
    public void settings(View view){
        Intent i=new Intent(this,SettingsActivity2.class);
        startActivity(i);
    }

}