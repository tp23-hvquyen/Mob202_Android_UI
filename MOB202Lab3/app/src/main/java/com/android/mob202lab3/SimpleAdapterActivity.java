
package com.android.mob202lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class SimpleAdapterActivity extends AppCompatActivity {
    ListView listView;
    List<HashMap<String,Object>> list;
    HashMap<String,Object> hm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        listView = findViewById(R.id.listView_lab3Lesson1);
        list = new ArrayList<HashMap<String, Object>>();
        hm = new HashMap<String,Object>();
        hm.put("name","Hancock");
        hm.put("age","18");
        hm.put("avatar",R.drawable.hancock);
        list.add(hm);
        hm = new HashMap<String,Object>();
        hm.put("name","Shank");
        hm.put("age","35");
        hm.put("avatar",R.drawable.shank);
        list.add(hm);
        String[] from = {"name", "age", "avatar"};
        int[] to = {R.id.tv_name_lab3lesson1, R.id.tv_age_lab3lesson1, R.id.img_lab3lesson1};
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, list, R.layout.items_simple_adapter_list_view, from, to);
        listView.setAdapter(simpleAdapter);
    }
}