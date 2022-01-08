package com.example.lesson_3_beksultan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class Second extends AppCompatActivity {
    private RecyclerView recycleViewSecond;
    private ArrayList<String> namePersonContact = new ArrayList<>();
    private AdapterPerson adapterPersonContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recycleViewSecond = findViewById(R.id.recycleViewSecond);
        loadData();
        //  adapterPersonContact = new AdapterPerson(null, null, namePersonContact);
        recycleViewSecond.setAdapter(adapterPersonContact);
    }

    private void loadData() {
        namePersonContact.add("Bem");
        namePersonContact.add("Bem");
        namePersonContact.add("Bem");
        namePersonContact.add("Bem");
        namePersonContact.add("Bem");
        namePersonContact.add("Bem");
        namePersonContact.add("Bem");
    }
}
