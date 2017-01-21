package com.example.sinistro.dayworker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        final EditText name = (EditText)findViewById(R.id.usernameEntry);
        final TextView welcome = (TextView)findViewById(R.id.bienvenido);
    }
}
