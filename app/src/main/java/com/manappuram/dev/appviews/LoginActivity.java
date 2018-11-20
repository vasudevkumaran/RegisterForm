package com.manappuram.dev.appviews;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText userNameEdit;
    private EditText passwordEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d("LoginActivity","onCreate Called");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("LOGIN");
        userNameEdit = findViewById(R.id.uname_ed);
        passwordEdit = findViewById(R.id.pass_ed);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LoginActivity","onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LoginActivity","onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LoginActivity","onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LoginActivity","onDestroy Called");
    }

    public void onLoginPressed(View view){
        if (userNameEdit.getText().toString().equals("admin")
                && passwordEdit.getText().toString().equals("admin")){
            //login success
        }else{
            //login failed
            Toast.makeText(this,
                    "Login Failed",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void onRegPressed(View view){
        Log.d("LoginActivity","Register button pressed");
        Intent intent = new Intent(
                LoginActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
