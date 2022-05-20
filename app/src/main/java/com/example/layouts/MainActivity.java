package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNav_view = findViewById(R.id.bottomNavigationView);
        RecyclerView recyclerView = findViewById(R.id.bottom_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BottomSheetAdapter());

        ChildItem item1 = new ChildItem("Item1", "Item1a", "");
        ChildItem item2 = new ChildItem("Item2", "Item2a", "");
        ChildItem item3 = new ChildItem("Item3", "Item3a", "");
        ChildItem item4 = new ChildItem("Item4", "Item4a", "");
        ChildItem item5 = new ChildItem("Item5", "Item5a", "");
        List<ChildItem> childItemList = new ArrayList<>();
        childItemList.add(item1);
        childItemList.add(item2);
        childItemList.add(item3);
        childItemList.add(item3);
        childItemList.add(item4);
        childItemList.add(item5);

        ParentItem parentItem1 = new ParentItem("Recommendation1", childItemList);
        ParentItem parentItem2 = new ParentItem("Recommendation2", childItemList);
        ParentItem parentItem3 = new ParentItem("Recommendation3", childItemList);
        ParentItem parentItem4 = new ParentItem("Recommendation4", childItemList);
        ParentItem parentItem5 = new ParentItem("Recommendation5", childItemList);
        ParentItem parentItem6 = new ParentItem("Recommendation6", childItemList);

        List<ParentItem> parentItemList = new ArrayList<>();
        parentItemList.add(parentItem1);
        parentItemList.add(parentItem2);
        parentItemList.add(parentItem3);
        parentItemList.add(parentItem4);
        parentItemList.add(parentItem5);
        parentItemList.add(parentItem6);

        ParentAdapter parentAdapter1 = new ParentAdapter(parentItemList);
        RecyclerView parentRecyclerView = findViewById(R.id.parent);
        parentRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        parentRecyclerView.setAdapter(parentAdapter1);






    }
}