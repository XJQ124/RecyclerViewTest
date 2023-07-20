package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewtest.adapter.RVAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    RVAdapter rvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);

        //设置布局管理器i
        LinearLayoutManager gm = new LinearLayoutManager(this);
        rv.setLayoutManager(gm);

        List<ImageItem>imageItems = new ArrayList<>();
        imageItems.add(new ImageItem(R.drawable.birld,"鸟"));
        imageItems.add(new ImageItem(R.drawable.chengbao,"城堡"));
        imageItems.add(new ImageItem(R.drawable.dunhuang,"敦煌"));
        imageItems.add(new ImageItem(R.drawable.park,"公园"));
        imageItems.add(new ImageItem(R.drawable.river,"河流"));
        //设置适配器
        rvAdapter = new RVAdapter(imageItems);
        rv.setAdapter(rvAdapter);
    }
}