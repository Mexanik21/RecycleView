package com.example.exam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam.R;
import com.example.exam.model.Member;

import java.util.ArrayList;

public class ViewPagerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
    private ArrayList<Member> members;

    public ViewPagerAdapter(Context context, ArrayList<Member> members) {
        this.context = context;
        this.members = members;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewpager_view,parent,false);
        return new ViewPagerHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);
    }

    @Override
    public int getItemCount() {
        return members.size();
    }
    private class ViewPagerHolder extends RecyclerView.ViewHolder {
        public ViewPagerHolder(View view) {
            super(view);
        }
    }
}
