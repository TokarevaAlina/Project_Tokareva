package ru.startandroid.project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<RecyclerItem> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i = 0; i < 13; i++) {
            listItems.add(new RecyclerItem("Item " + (i + 1), "Welcome to Torisan channel, this is description of item " + (i + 1)));
        }

        adapter = new MyAdapter(listItems);
        recyclerView.setAdapter(adapter);

        //Log.d("Ddd", String.valueOf(listItems.size()));
    }
}