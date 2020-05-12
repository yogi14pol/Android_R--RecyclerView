package com.clicks.yogi.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    Context ct;
    List<MyCalender> al;

    public MyAdapter(Context ct, List<MyCalender> al) {
        this.ct = ct;
        this.al = al;
    }

    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(ct);
        View v = li.inflate(R.layout.customize_layout,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyHolder holder, int position) {
        MyCalender calender = al.get(position);
        // set the data in items
        holder.months.setText(calender.getMonth());
        holder.weekdays.setText(calender.getWeekdays());
    }

    @Override
    public int getItemCount() {return al.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView months,weekdays;

        public MyHolder(View itemView) {
            super(itemView);
            months = itemView.findViewById(R.id.month);
            weekdays = itemView.findViewById(R.id.week);
        }
    }
}