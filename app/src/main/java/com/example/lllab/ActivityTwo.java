package com.example.lllab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

public class ActivityTwo extends AppCompatActivity {

    private RecyclerView rView;
    private RecyclerView.Adapter dAdapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        rView = (RecyclerView) findViewById(R.id.listview);
        rView.setHasFixedSize(true);
        lManager = new LinearLayoutManager(this);
        rView.setLayoutManager(lManager);
        dAdapter = new RecyclerViewAdapter();
        rView.setAdapter(dAdapter);
    }
}
