package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PetAdapter petAdapter;
    private List<Pet> petList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        petList.add(new Pet("Барон", "Лабрадор", R.drawable.ic_launcher_foreground));
        petList.add(new Pet("Мурка", "Персидская", R.drawable.ic_launcher_foreground));


        petAdapter = new PetAdapter(this, petList);
        recyclerView.setAdapter(petAdapter);
    }
}