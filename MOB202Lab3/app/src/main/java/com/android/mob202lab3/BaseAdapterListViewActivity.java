package com.android.mob202lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class BaseAdapterListViewActivity extends AppCompatActivity {
    ListView listView;
    People people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter_list_view);
        listView = findViewById(R.id.listPeople);
        List<People> list = new ArrayList<>();

        people = new People();
        people.avatar = R.drawable.kimbap;
        people.name = "kim bap";
        list.add(people);
        people = new People();
        people.avatar = R.drawable.kimchi;
        people.name = "kim chi";
        list.add(people);
        people = new People();
        people.avatar = R.drawable.kimheesun;
        people.name = "kim hee sun";
        list.add(people);
        people = new People();
        people.avatar = R.drawable.kimnamjoo;
        people.name = "kim nam joo";
        list.add(people);
        people = new People();
        people.avatar = R.drawable.kimsoeun;
        people.name = "kim so eun";
        list.add(people);
        people = new People();
        people.avatar = R.drawable.kimtaehee;
        people.name = "kim tae hee";
        list.add(people);

        peopleAdapter adapter = new peopleAdapter(list);
        listView.setAdapter(adapter);
    }
}