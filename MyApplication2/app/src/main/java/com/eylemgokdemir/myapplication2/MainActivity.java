package com.eylemgokdemir.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import static com.eylemgokdemir.myapplication2.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        ListView listView=findViewById(R.id.listView);

        Button button=findViewById(R.id.ButtonNextActivity);

        CustomAdapter customAdapter=new CustomAdapter(createCategoryList());


        listView.setAdapter(customAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private ArrayList<Category> createCategoryList(){
        Category c1=new Category("Elektronik",R.drawable.ic_launcher_background,4);
        Category c2=new Category("Beyaz Eşya",R.drawable.ic_launcher_foreground,4);
        Category c3=new Category("Otomobil",R.drawable.ic_launcher_foreground,4);
        Category c4=new Category("Kıyafet",R.drawable.ic_launcher_background,4);

        ArrayList<Category> list=new ArrayList<Category>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        return list;


    }
}
