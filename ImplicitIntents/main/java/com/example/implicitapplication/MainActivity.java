package com.example.implicitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void about(View view)
    {
        String url = "vvce.ac.in/about-us";
        Uri u =Uri.parse(("http://"+url));
        Intent i =new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
    public void location(View view)
    {
        String loc = "Vidyavardhaka College of Engineering";
        Uri u= Uri.parse(("geo:?q="+loc));
        Intent i= new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);

    }
    public void result(View view)
    {
        String url = "results.vtu.ac.in";
        Uri u =Uri.parse("http://"+url);
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);

    }
    public void call(View view)
    {
        String num="0821-4276200";
        Uri u =Uri.parse("tel:"+num);
        Intent i=new Intent(Intent.ACTION_DIAL,u);
        startActivity(i);
    }

}