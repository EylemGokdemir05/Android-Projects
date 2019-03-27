package com.eylemgokdemir.mymusicapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends BaseAdapter {

    public ArrayList<Song> songs=new ArrayList<>();
    public Context context;

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return songs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(context,R.layout.song_item,null);

        TextView textView1=view.findViewById(R.id.sarkiAdi);
        TextView textView2=view.findViewById(R.id.sarkiciAdi);

        Song currentitem=songs.get(position);

        textView1.setText(currentitem.sarki);
        textView2.setText(currentitem.sarkici);

        return view;
    }
}
