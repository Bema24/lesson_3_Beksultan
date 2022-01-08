package com.example.lesson_3_beksultan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycleViewFirst;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> number = new ArrayList<>();
    private AdapterPerson adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleViewFirst = findViewById(R.id.recycleViewFirst);
        loadData();
        adapter = new AdapterPerson(names, number);
        recycleViewFirst.setAdapter(adapter);
    }
    private void loadData() {
        names.add("Bermet");
        number.add("+996555773011");
        names.add("Chyngyzkhan");
        number.add("+996505003506");
        names.add("Arlen");
        number.add("+996552515761");
        names.add("Tima");
        number.add("+996999922892");
        names.add("Nurai");
        number.add("+996705003506");
        names.add("Bepa");
        number.add("+996706003506");
        names.add("Aibek");
        number.add("+996552210731");
        names.add("Aidamir");
        number.add("+996507014860");
        names.add("Tima2");
        number.add("+996702339565");
        names.add("Zumrad");
        number.add("+996709232366");
        names.add("Bakyt");
        number.add("+996550428282");
        names.add("Mahabat");
        number.add("+996555781089");
        names.add("Perizat");
        number.add("+996755451535");
        names.add("Dastan");
        number.add("+996501781089");

    }
}