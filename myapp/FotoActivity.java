package com.eylemgokdemir.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class FotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);

        ImageView imageView=findViewById(R.id.imageView);
        Button button=findViewById(R.id.buttonResimEkle);
        EditText editText=findViewById(R.id.editText);
        Button button1=findViewById(R.id.buttonKaydet);
    }
}
