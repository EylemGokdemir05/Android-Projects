package com.eylemgokdemir.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        /*buttonlogin=findViewById(R.id.button_login);
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Deneme","Buton tıklandı.");
                Intent intent=new Intent(getApplicationContext(),WelcomeActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("isim","eylem");

                startActivity(intent);
            }
        });*/
    }


    @Override
    protected void onResume() {
        super.onResume();

    }
}
