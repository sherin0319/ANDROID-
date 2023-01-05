package com.example.sjcet.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText email,password,username,dob,gender;
        Button SIGNUP,SIGN UP WITH FACEBOOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Registrarion reg=new Registration;
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"sign up",Toast.LENGTH_SHORT).show();
    }
}
