package com.example.sinistro.dayworker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.widget.Button;
import android.widget.EditText;

public class UserRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        final EditText name = (EditText)findViewById(R.id.name);
        final EditText tools = (EditText)findViewById(R.id.tools);
        final EditText skills = (EditText)findViewById(R.id.skills);
        final EditText location = (EditText)findViewById(R.id.location);
        final EditText transportation = (EditText)findViewById(R.id.transportation);
        final EditText password = (EditText)findViewById(R.id.password);
        final Button registrar = (Button) findViewById(R.id.registrar);
    }
}
