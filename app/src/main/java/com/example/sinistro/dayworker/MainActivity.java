package com.example.sinistro.dayworker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button login = (Button)findViewById(R.id.findWork);

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent findInt = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(findInt);
            }
        });

    }


//    @Override
//    public void onClick(View v) {
//        switch(v.getId()){
//            case R.id.findWork:
//                Intent registrarInt = new Intent(MainActivity.this, UserRegisterActivity.class);
//                MainActivity.this.startActivity(registrarInt);
//    }
}
