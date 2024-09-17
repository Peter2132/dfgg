package com.example.resycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        // Получаем данные из Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String capital = intent.getStringExtra("capital");
        int flagResource = intent.getIntExtra("flagResource", -1);

        // Инициализируем элементы UI
        TextView nameView = findViewById(R.id.name2);
        TextView capitalView = findViewById(R.id.capital2);
        ImageView flagView = findViewById(R.id.flag2);

        // Устанавливаем полученные данные
        nameView.setText(name);
        capitalView.setText(capital);
        flagView.setImageResource(flagResource);
    }
}
