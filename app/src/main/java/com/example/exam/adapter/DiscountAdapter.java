package com.example.exam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam.R;
import com.example.exam.model.Discount;

import java.util.ArrayList;

public class DiscountAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Discount> discounts;

    public DiscountAdapter(Context context, ArrayList<Discount> discounts) {
        this.context = context;
        this.discounts = discounts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dicount_view,parent,false);
        return new DiscountViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Discount discount = discounts.get(position);
    }

    @Override
    public int getItemCount() {
        return discounts.size();
    }

    private class DiscountViewHolder extends RecyclerView.ViewHolder {
        public DiscountViewHolder(View view) {
            super(view);
        }
    }
}
