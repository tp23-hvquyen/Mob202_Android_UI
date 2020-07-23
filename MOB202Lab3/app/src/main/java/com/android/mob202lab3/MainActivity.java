package com.android.mob202lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startLesson1(View view){
        Intent i = new Intent(this, SimpleAdapterActivity.class);
        startActivity(i);
    }
    public void startLesson2(View view){
        Intent i = new Intent(this, SpinnerActivity.class);
        startActivity(i);
    }
    public void startLesson3(View view){
        Intent i = new Intent(this, BaseAdapterGridViewActivity.class);
        startActivity(i);
    }
    public void startLesson4(View view){
        Intent i = new Intent(this, BaseAdapterListViewActivity.class);
        startActivity(i);
    }
}