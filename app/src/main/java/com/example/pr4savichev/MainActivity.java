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
        EditText _name = findViewById(R.id.editTextText);
        String strName = _name.getText().toString();

        setContentView(R.layout.step_2);

        TextView tv =findViewById(R.id.textView);
        tv.setText("Очень приятно познакомиться " + strName + "\nМеня зовут Умный.\nСколько тебе лет?");
    }

    public void onStepSex(View view){
        EditText _age = findViewById(R.id.editTextText);
        String strAge = _age.getText().toString();

        setContentView(R.layout.step_3);
        TextView tv =findViewById(R.id.textView);
        tv.setText("Ничего себе ты большой, целых " + strAge + " лет\nКакого ты пола?");
    }
    public void onStepEmail(View view){
        setContentView(R.layout.step_4);
    }
}