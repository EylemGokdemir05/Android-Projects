package com.eylemgokdemir.mymusicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listViewPlayList);

        PlayListAdapter adapter=new PlayListAdapter();
        adapter.playLists=createPlayLists();
        adapter.context=this;

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent);
            }
        });



    }
    private ArrayList<PlayList> createPlayLists(){
        PlayList p1=new PlayList("MyMood",R.drawable.mymood,"Eylem");
        PlayList p2=new PlayList("Pop",R.drawable.popicon,"Eylem");
        PlayList p3=new PlayList("Slow",R.drawable.slowicon ,"Eylem");

        ArrayList<PlayList> lists=new ArrayList<>();
        lists.add(p1);
        lists.add(p2);
        lists.add(p3);

        return lists;
    }
}
