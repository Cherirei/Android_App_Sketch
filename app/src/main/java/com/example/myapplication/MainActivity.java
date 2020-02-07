package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Login;
    EditText Username, Password;
    TextView Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login =(Button)findViewById(R.id.btn_login);
        Username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        Title = (TextView) findViewById(R.id.Welcome);

    }
    public void login (View view){
        String username, password;

        username = Username.getText().toString();
        password = Password.getText().toString();
        Toast text = Toast.makeText(this,"your username and password are: " + username + ", "+ password, Toast.LENGTH_SHORT);
        text.show();
        if (username==password){

            Toast  text1 = Toast.makeText(this,"welcome choose", Toast.LENGTH_SHORT);
            text.show();
        }
        else {
            Toast  text1 = Toast.makeText(this,"Wrong Password", Toast.LENGTH_SHORT);
            text.show();
            Title.setText("wrong password");
        }


    }

}

