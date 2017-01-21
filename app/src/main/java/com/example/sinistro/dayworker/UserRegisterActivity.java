package com.example.sinistro.dayworker;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class UserRegisterActivity extends AppCompatActivity implements View.OnClickListener{
    private static final int RESULT_PIC = 1;

    ImageView imagen;
    Button upload;
    private String full_name;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);
        imagen = (ImageView)findViewById(R.id.userPic);
        upload = (Button)findViewById(R.id.uploadPic);
        registerButton = (Button) findViewById(R.id.register);
        imagen.setOnClickListener(this);
        upload.setOnClickListener(this);
        registerButton.setOnClickListener(this);

        final EditText name = (EditText)findViewById(R.id.usernameEntry);
        final EditText tools = (EditText)findViewById(R.id.tools);
        final EditText skills = (EditText)findViewById(R.id.skills);
        final EditText location = (EditText)findViewById(R.id.location);
        final EditText transportation = (EditText)findViewById(R.id.transportation);
        final EditText password = (EditText)findViewById(R.id.password);

        full_name = name.getText().toString();
}

    @Override
    public void onClick(View v) {
        Log.i("Button", v.toString());
        switch(v.getId()){
            case R.id.userPic:
                Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_PIC);
                break;
            case R.id.register:
                Log.i("Button register", "Made it!");
                Toast.makeText( getApplicationContext(),"Request Away!", Toast.LENGTH_SHORT).show();
                sendData();
                break;
            case R.id.uploadPic:
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RESULT_PIC && resultCode == RESULT_OK && data != null){
            Uri selectedImage = data.getData();
            imagen.setImageURI(selectedImage);
        }
    }

    void sendData(){
        String path = "https://127.0.0.1:3306";


    }
}
