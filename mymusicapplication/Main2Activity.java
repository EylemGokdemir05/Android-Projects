package com.eylemgokdemir.mymusicapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView2=findViewById(R.id.listViewSongs);

        SongAdapter adapter2=new SongAdapter();
        adapter2.songs=createSongs();
        adapter2.context=this;

        listView2.setAdapter(adapter2);
    }
    private ArrayList<Song> createSongs(){
        Song s1=new Song("Perfect","Ed Sheeran");
        Song s2=new Song("Shape of My Heart","Sting");
        Song s3=new Song("Halo","Beyonce");

        ArrayList<Song> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        return list;
    }
}
