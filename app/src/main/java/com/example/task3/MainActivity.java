package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int[] images = {R.drawable.icon25,R.drawable.icon26,
            R.drawable.icon27,R.drawable.icon28,R.drawable.icon29,R.drawable.icon30,
            R.drawable.icon31,R.drawable.icon32,R.drawable.icon33,R.drawable.icon34,
            R.drawable.icon35,R.drawable.icon36,R.drawable.icon37,R.drawable.icon38,
            R.drawable.icon39,R.drawable.icon40,R.drawable.icon41,R.drawable.icon42,
            R.drawable.icon43,R.drawable.icon44};
    ArrayList<com.example.task3.CardModel> models=new ArrayList<>();
    com.example.task3.CardAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpModel();
        adapter = new com.example.task3.CardAdapter(this, models);
        RecyclerView recyclerView = findViewById(R.id.Rcv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter); // Set the adapter to the RecyclerView
    }

    private void setUpModel() {
        String []text = getResources().getStringArray(R.array.class.getModifiers());
        for(int i=0;i<text.length;i++)
        {
            models.add(new com.example.task3.CardModel(text[i], images[i]));
        }
    }
}