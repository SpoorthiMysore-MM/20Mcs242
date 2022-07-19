package com.example.passresults;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText uName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uName =findViewById(R.id.editText);

    }
    public void first(View view)
    {
        String username=uName.getText().toString();
        Intent i=new Intent(getApplicationContext(),SecindActivity.class);
        i.putExtra("enteredData",username);
        startActivity(i);

    }
}