package com.example.sinistro.dayworker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText nameET, passwordET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameET = (EditText)findViewById(R.id.usernameEntry);
        passwordET = (EditText)findViewById(R.id.password);

        final Button entrar = (Button) findViewById(R.id.entrar);
        final TextView register = (TextView)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View v) {
              Intent registrarInt = new Intent(LoginActivity.this, UserRegisterActivity.class);
              LoginActivity.this.startActivity(registrarInt);
            }
        });

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLogin();
            }
        });

    }

    public void onLogin(){
        String username = nameET.getText().toString();
        String password = passwordET.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password); // We can pass multiple arguements here
    }
}
