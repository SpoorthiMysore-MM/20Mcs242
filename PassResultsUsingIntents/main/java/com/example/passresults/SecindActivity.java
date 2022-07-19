package com.example.passresults;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secind);

    TextView txt=findViewById(R.id.textView);
    String username =getIntent().getStringExtra("enteredData");
    txt.setText(username);
    }
}