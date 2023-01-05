package com.example.sjcet.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite;
import android.database.sqliteOpenHelper;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MyDatabase extends AppCompatActivity {
    EditText Name,Surname,Mark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StringBuffer string=new StringBuffer();
        setContentView(R.layout.activity_my_database);
        setContentView(R.id.et1);

    }
    public void create(View view)
    {
        CREATE(userval iNTERGER PRIMARY KEY,AUTOINCREMENT)name text,surnmae text,mark int);
        StringBuffer("name".toString()+"\n");
        StringBuffer("surname".toString()+"\n");
        StringBuffer("mark".toString()+"\n");
    }

    public void insert(View view)
    {
        StringBuffer("surname".toString(0)+"\n");
        StringBuffer("surname".toString(1)+"\n");
        StringBuffer("mark".toString(2)+"\n");
        if(result==-1)
        {
            return true;
        }else{
            return false;
        }
    }
}
