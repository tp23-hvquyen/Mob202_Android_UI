package com.android.mob202lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    List<HashMap<String,Object>> list;
    HashMap<String,Object> hm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner = findViewById(R.id.spinner_nationality);
        list = new ArrayList<HashMap<String, Object>>();
        hm = new HashMap<String,Object>();
        hm.put("nationality","Russian");
        hm.put("ensign",R.drawable.img1);
        list.add(hm);
        hm = new HashMap<String,Object>();
        hm.put("nationality","Canadian");
        hm.put("ensign",R.drawable.img2);
        list.add(hm);
        hm = new HashMap<String,Object>();
        hm.put("nationality","Vietnamese");
        hm.put("ensign",R.drawable.img3);
        list.add(hm);
        hm = new HashMap<String,Object>();
        hm.put("nationality","Tibetan");
        hm.put("ensign",R.drawable.img4);
        list.add(hm);
        hm = new HashMap<String,Object>();
        hm.put("nationality","British");
        hm.put("ensign",R.drawable.img5);
        list.add(hm);
        String[] from = {"nationality", "ensign"};
        int[] to = {R.id.tv_nationality_lab3lesson2, R.id.img_lab3lesson2};
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, list, R.layout.items_spinner, from, to);
        spinner.setAdapter(simpleAdapter);
    }
}