package com.eylemgokdemir.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Locale;

public class CustomAdapter extends BaseAdapter {
    /*TextView textView1;
    ImageView ımageView;
    Button button1;
    TextView textView2;
    Button button2;
    Button button3;*/

    ArrayList<Category> categories=new ArrayList<>();

    public CustomAdapter(ArrayList<Category> categories){
        this.categories=categories;
    }



    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        return categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        final View v= (View) View.inflate(convertView.getContext(),R.layout.activity_list_item,null);
        TextView textView1Title=v.findViewById(R.id.textViewTitle);
        ImageView imageViewLogo=v.findViewById(R.id.imageViewLogo);
        TextView textView2Quantity=v.findViewById(R.id.textView2Quantity);

        Category currentItem=categories.get(position);

        textView1Title.setText(currentItem.title);
        imageViewLogo.setImageResource(currentItem.logo);
        textView2Quantity.setText(String.valueOf(currentItem.quantity));

        textView1Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

        return v;
    }
}
