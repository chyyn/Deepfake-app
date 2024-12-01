package com.example.deepfakedetector;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PrivacyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        ImageButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
