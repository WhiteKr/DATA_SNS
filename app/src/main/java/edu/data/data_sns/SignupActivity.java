package edu.data.data_sns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
//
        final CheckBox maleCheckbox = (CheckBox) findViewById(R.id.signUp_checkMale_checkBox);
        final CheckBox femaleCheckbox = (CheckBox) findViewById(R.id.signUp_checkFemale_checkBox);

        maleCheckbox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (maleCheckbox.isChecked() && femaleCheckbox.isChecked()) {
                    femaleCheckbox.setChecked(false);
                }
            }
        });
        femaleCheckbox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (femaleCheckbox.isChecked() && maleCheckbox.isChecked()) {
                    maleCheckbox.setChecked(false);
                }
            }
        });

        Button backBtn = findViewById(R.id.signUp_back_btn);
        backBtn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        Log.d("DATA_SNS", "Back Button Clicked!!!");
                        finish();
                    }
                }
        );
    }
}