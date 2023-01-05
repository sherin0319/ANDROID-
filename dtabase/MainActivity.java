package com.example.sjcet.database;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ContentValues;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText Name,Surname,Mark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.id.e1);
        setContentView(R.id.e2);
        setContentView(R.id.e3);

    }
    public void Create(View view){
        Cursor res=new Cursor;

        String userval="name";
        String surnameval="surname";
        String markval="mark";
        if(res==true)
        {
            Toast.makeText(getApplicationContext(),"Created successfully",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"not created",Toast.LENGTH_SHORT).show();
        }

    }
    public void Insert(View view){
        String userval=String("name".toString()+"\n");
        String surnameval=String("surname".toString()+"\n");
        String  markval=integer.parseint("mark".toString()+"\n");
        Boolean=("userval","surnameval","markval");
        if(res==true)
        {
            Toast.makeText(getApplicationContext(),"Data inserted successfully",Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(getApplicationContext(),"Data not inserted ",Toast.LENGTH_SHORT).show();
        }



    }
}
