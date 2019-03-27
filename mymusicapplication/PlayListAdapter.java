package com.eylemgokdemir.mymusicapplication;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayListAdapter extends BaseAdapter {

    public  ArrayList<PlayList> playLists=new ArrayList<>();
    public Context context;

    @Override
    public int getCount() {
        return playLists.size();
    }

    @Override
    public Object getItem(int position) {
        return playLists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(context,R.layout.playlist_item,null);

        TextView textViewTitle=view.findViewById(R.id.textViewTitle);
        TextView textViewQuantity=view.findViewById(R.id.textViewQuantity);
        ImageView imageViewLogo=view.findViewById(R.id.imageViewLogo);

        textViewTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Main2Activity.class);
                context.startActivity(intent);
            }
        });

        PlayList currentitem=playLists.get(position);

        textViewTitle.setText(currentitem.title);
        textViewQuantity.setText(currentitem.quantity);
        imageViewLogo.setImageResource(currentitem.logo);

        return view ;
    }
}
