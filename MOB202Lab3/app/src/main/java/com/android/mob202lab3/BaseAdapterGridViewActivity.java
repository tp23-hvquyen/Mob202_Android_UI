package com.android.mob202lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseAdapterGridViewActivity extends AppCompatActivity {
    GridView gridView;
    App app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter_grid_view);
        gridView = findViewById(R.id.gridView);
        List<App> list = new ArrayList<>();
        app = new App();
        app.icon = R.drawable.android;
        app.nameApp = "android";
        list.add(app);
        app = new App();
        app.icon = R.drawable.apple;
        app.nameApp = "apple";
        list.add(app);
        app = new App();
        app.icon = R.drawable.blogger;
        app.nameApp = "blogger";
        list.add(app);
        app = new App();
        app.icon = R.drawable.chrome;
        app.nameApp = "chrome";
        list.add(app);
        app = new App();
        app.icon = R.drawable.dell;
        app.nameApp = "dell";
        list.add(app);
        app = new App();
        app.icon = R.drawable.facebook;
        app.nameApp = "facebook";
        list.add(app);
        app = new App();
        app.icon = R.drawable.firefox;
        app.nameApp = "firefox";
        list.add(app);
        app = new App();
        app.icon = R.drawable.hp;
        app.nameApp = "hp";
        list.add(app);
        app = new App();
        app.icon = R.drawable.microsoft;
        app.nameApp = "microsoft";
        list.add(app);
        app = new App();
        app.icon = R.drawable.ie;
        app.nameApp = "ie";
        list.add(app);
        app = new App();
        app.icon = R.drawable.xbox;
        app.nameApp = "xbox";
        list.add(app);
        app = new App();
        app.icon = R.drawable.twitter;
        app.nameApp = "twitter";
        list.add(app);
        AppAdapter adapter = new AppAdapter(list);
        gridView.setAdapter(adapter);
    }
}