package com.android.mob202lab3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class peopleAdapter extends BaseAdapter {
    List<People> peopleList;
    public peopleAdapter(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    @Override
    public int getCount() {
        return peopleList.size();
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
        PeopleHolder peopleHolder;
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_base_adapter_list_view, parent, false);
            peopleHolder = new PeopleHolder();
            peopleHolder.avatar = convertView.findViewById(R.id.img_lab3lesson4);
            peopleHolder.tv_name = convertView.findViewById(R.id.tv_name_lab3lesson4);
            convertView.setTag(peopleHolder);
        }else {
            peopleHolder = (PeopleHolder) convertView.getTag();
        }


        People People = peopleList.get(position);

        peopleHolder.avatar.setImageResource( People.avatar);
        peopleHolder.tv_name.setText( People.name);

        return convertView;
    }
    class PeopleHolder{
        ImageView avatar;
        TextView tv_name;
    }
}
