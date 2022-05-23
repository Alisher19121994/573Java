package com.example.a573java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView content_rec, shorts_rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        content_rec = findViewById(R.id.recyclerView_1_id);
        content_rec.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        shorts_rec = findViewById(R.id.recyclerView_2_id);
        shorts_rec.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        getAdapter1(data1());
        getAdapter2(data2());

    }

    ArrayList<Contents> data1() {
        ArrayList<Contents> list = new ArrayList<>();
        list.add(new Contents("Masha va Medved"));
        list.add(new Contents("Masha va Medved"));
        list.add(new Contents("Masha va Medved"));
        list.add(new Contents("Masha va Medved"));
        list.add(new Contents("Masha va Medved"));
        list.add(new Contents("Masha va Medved"));
        list.add(new Contents("Masha va Medved"));
        list.add(new Contents("Masha va Medved"));
        list.add(new Contents("Masha va Medved"));
        return list;
    }

    ArrayList<Shorts> data2() {
        ArrayList<Shorts> list = new ArrayList<>();
        list.add(new Shorts(R.drawable.rasm1, "Masha va Medved", "777K views"));
        list.add(new Shorts(R.drawable.rasm2, "Masha va Medved", "18K views"));
        list.add(new Shorts(R.drawable.rasm4, "Masha va Medved", "87K views"));
        list.add(new Shorts(R.drawable.rasm5, "Masha va Medved", "17K views"));
        list.add(new Shorts(R.drawable.rasm6, "Masha va Medved", "1K views"));
        list.add(new Shorts(R.drawable.rasm7, "Masha va Medved", "18M views"));
        list.add(new Shorts(R.drawable.rasm9, "Masha va Medved", "187K views"));
        return list;
    }

    void getAdapter1(ArrayList<Contents> list) {
        Adapter_1 adapter_1 = new Adapter_1(this, list);
        content_rec.setAdapter(adapter_1);
    }

    void getAdapter2(ArrayList<Shorts> list) {
        Adapter_2 adapter_2 = new Adapter_2(this, list);
        shorts_rec.setAdapter(adapter_2);
    }
}