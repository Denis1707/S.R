package com.example.myapplication;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Иван", 1, "+123456789"));
        persons.add(new Person("Мария", 2, "+987654321"));
        persons.add(new Person("Петр", 3, "+111222333"));

        PersonAdapter adapter = new PersonAdapter(this, persons);

        @SuppressLint("WrongViewCast") ListView listView = findViewById(R.id.textViewId);
        listView.setAdapter(adapter);
    }
}
