package com.android.mob202lab3;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AppAdapter extends BaseAdapter {
    List<App> appList;
    public AppAdapter(List<App> appList) {
        this.appList = appList;
    }

    @Override
    public int getCount() {
        return appList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AppHolder appHolder;
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_grid_view, parent, false);
            appHolder = new AppHolder();
            appHolder.icon = convertView.findViewById(R.id.img_lab3lesson3);
            appHolder.tv_nameApp = convertView.findViewById(R.id.tv_name_app_lab3lesson3);
            convertView.setTag(appHolder);
        }else {
            appHolder = (AppHolder) convertView.getTag();
        }


        App app = appList.get(position);

        appHolder.icon.setImageResource( app.icon);
        appHolder.tv_nameApp.setText( app.nameApp);

        return convertView;
    }
    class AppHolder{
        ImageView icon;
        TextView tv_nameApp;
    }
}
