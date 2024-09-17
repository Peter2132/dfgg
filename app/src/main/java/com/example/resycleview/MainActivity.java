package com.example.resycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list);

        StateAdapter catAdapter = new StateAdapter(this, states);

        recyclerView.setAdapter(catAdapter);
    }
    private void setInitialData(){
        states.add(new State("Берлин", "Германия", R.drawable.german));
        states.add(new State("Москва", "Россия", R.drawable.russia));
        states.add(new State("Рим", "Италия", R.drawable.itally));
    }
}
