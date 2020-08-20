package edu.data.data_sns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View view) {
                    Log.d("Data_SNS", "Login Button Clicked!!!");

                    Intent intent = new Intent(MainActivity.this, FeedActivity.class);
                    startActivity(intent);
                }
            }
        );

        Button signUpBtn = findViewById(R.id.signUp_btn);
        signUpBtn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        Log.d("DATA_SNS", "Sign Up Button Clicked!!!");

                        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}