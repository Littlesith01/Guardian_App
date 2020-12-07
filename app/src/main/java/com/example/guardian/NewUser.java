package com.example.guardian;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class NewUser extends AppCompatActivity {
    // Write out to a database
    String ServerURL = "";
    EditText name, email, password, username;
    Button createUser;
    String tempName, tempEmail, tempPassword, tempUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user_screen);

        name = (EditText) findViewById(R.id.editTextName);
        username = (EditText) findViewById(R.id.editTextUsername);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        password = (EditText) findViewById(R.id.editTextTextPassword2);
        createUser = (Button) findViewById(R.id.createUserButton);

        createUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
                UserInfo(tempName, tempEmail, tempPassword, tempUsername);
                Intent intent = new Intent(NewUser.this, Password_manager.class);
                startActivity(intent);
            }
        });
    }

    public void getData() {
        tempName = name.getText().toString();
        tempEmail = email.getText().toString();
        tempPassword = password.getText().toString();
        tempUsername = username.getText().toString();
    }

    public void UserInfo(final String name, final String email, final String password, final String username) {
        class FileTask extends AsyncTask<String, Void, String> {
            @Override
            protected String doInBackground(String... strings) {
                String nameHolder = name;
                String emailHolder = email;
                String usernameHolder = username;
                String passwordHolder = password;

                return null;
            }
        }
    }
}