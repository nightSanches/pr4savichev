package com.example.pr4savichev;

import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStepAge(View view){
        setContentView(R.layout.step_2);
    }

    public void onStepSex(View view){
        setContentView(R.layout.step_3);
    }
    public void onStepEmail(View view){
        setContentView(R.layout.step_4);
    }
}