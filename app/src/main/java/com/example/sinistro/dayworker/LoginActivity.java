package com.example.sinistro.dayworker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText name = (EditText)findViewById(R.id.name);
        final EditText password = (EditText)findViewById(R.id.password);
        final Button entrar = (Button) findViewById(R.id.entrar);
        final TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View v) {
              Intent registrarInt = new Intent(LoginActivity.this, UserRegisterActivity.class);
              LoginActivity.this.startActivity(registrarInt);

            }
        });

    }
}
