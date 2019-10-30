package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView= findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter= new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<model> getMyList(){

        ArrayList<model> models =new ArrayList<>();
        model m = new model();
        m.setTitle("Siswanto");
        m.setDeskripsi("Bapak");
        m.setImg(R.drawable.ebes);
        models.add(m);

         m = new model();
        m.setTitle("Renti Ningsih");
        m.setDeskripsi("Ibuk");
        m.setImg(R.drawable.memes);
        models.add(m);

         m = new model();
        m.setTitle("Ryo Amogha");
        m.setDeskripsi("Anak");
        m.setImg(R.drawable.aku);
        models.add(m);

        return models;
    }
}
