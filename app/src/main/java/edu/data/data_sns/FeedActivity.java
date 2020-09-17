package edu.data.data_sns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        Button signUp2Btn = findViewById(R.id.signUp2_btn);
        signUp2Btn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        Log.d("DATA_SNS", "Sign Up Button Clicked!!! (in FeedActivity)");

                        Intent intent = new Intent(FeedActivity.this, SignupActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}