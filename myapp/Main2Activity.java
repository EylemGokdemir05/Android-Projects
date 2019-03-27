package com.eylemgokdemir.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView=findViewById(R.id.listViewHarita);

        ListAdapter listAdapter=new ListAdapter();
        listAdapter.lists=createLists();
        listAdapter.context=this;
        listView.setAdapter(listAdapter);

        Button haritayagec=findViewById(R.id.buttonHarita);

        haritayagec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
    private ArrayList<List> createLists(){

        List l1=new List(R.drawable.common_full_open_on_phone,"perfect");
        List l2=new List(R.drawable.common_full_open_on_phone,"perfect");
        List l3=new List(R.drawable.common_full_open_on_phone,"perfect");

        ArrayList<List> lists=new ArrayList<>();
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

        return lists;

    }
}
