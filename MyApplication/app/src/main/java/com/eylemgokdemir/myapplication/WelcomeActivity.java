package com.eylemgokdemir.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class WelcomeActivity extends Activity {
    Button button;
    Button button2;
    EditText editText;
    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        listView=findViewById(R.id.listView);
        button=findViewById(R.id.buttonAdd);
        button2=findViewById(R.id.buttonAdd);
        editText=findViewById(R.id.editTextName);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_item);

        String[] strings={"eylem","gokdemir","jhkşn"};
        adapter.addAll(strings);
        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);

        Button button=findViewById(R.id.buttonAdd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItems();
            }
        });
        editText=findViewById(R.id.editTextName);
    }
    void addItems(){
        adapter.add(editText.getText().toString());
    }
    void showaddItems(){
        adapter.notifyDataSetChanged();

    }
}
