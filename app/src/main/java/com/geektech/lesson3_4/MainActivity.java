package com.geektech.lesson3_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PersonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<Model> names = new ArrayList<>();
        adapter = new PersonAdapter(names);
        recyclerView.setAdapter(adapter);
        adapter.setNamePerson(names);

        names.add(new Model(R.drawable.photo_1, "Android"));
        names.add(new Model(R.drawable.photo_2, "C"));
        names.add(new Model(R.drawable.photo_3, "C++"));
        names.add(new Model(R.drawable.photo_4, "Java"));
        names.add(new Model(R.drawable.photo_5, "Kotlin"));
        names.add(new Model(R.drawable.photo_6, "Html"));
        names.add(new Model(R.drawable.photo_7, "Это Я"));
    }

}
