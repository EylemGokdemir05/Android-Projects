package com.eylemgokdemir.myapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    public ArrayList<List> lists=new ArrayList<>();
    public Context context;

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(context,R.layout.list_item,null);

        ImageView imageView=view.findViewById(R.id.imageViewLogo);
        TextView textView1=view.findViewById(R.id.textViewTitle);


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Main2Activity.class);
                context.startActivity(intent);

            }
        });

        List currentitem=lists.get(position);

        imageView.setImageResource(currentitem.logo);
        textView1.setText(currentitem.title);


        return view;
    }
}
