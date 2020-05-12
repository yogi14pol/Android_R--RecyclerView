package com.clicks.yogi.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MyCalender> calenderList = new ArrayList<>();
    MyAdapter mAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerViewID);

        mAdapter = new MyAdapter(MainActivity.this,calenderList);

        RecyclerView.LayoutManager mLayoutManager = new
                LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        MyCalenderData();
    }

    private void MyCalenderData() {

        MyCalender ca1 = new MyCalender("January", "Monday");
        calenderList.add(ca1);

        MyCalender ca2 = new MyCalender("February", "Tuesday");
        calenderList.add(ca2);

        MyCalender ca3 = new MyCalender("March", "Wednesday");
        calenderList.add(ca3);

        MyCalender ca4 = new MyCalender("April", "Thursday");
        calenderList.add(ca4);

        MyCalender ca5 = new MyCalender("May", "Monday");
        calenderList.add(ca5);

        MyCalender ca6 = new MyCalender("June", "Tuesday");
        calenderList.add(ca6);

        MyCalender ca7 = new MyCalender("July", "Wednesday");
        calenderList.add(ca7);

        mAdapter.notifyDataSetChanged();
    }
}