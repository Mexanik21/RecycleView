package com.example.exam.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam.MainActivity;
import com.example.exam.R;
import com.example.exam.activity.SecondActivity;
import com.example.exam.model.Member;
import com.example.exam.model.Service;

import java.util.ArrayList;

public class ServiceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    private ArrayList<Service> services;

    public ServiceAdapter(Context context, ArrayList<Service> services) {
        this.context = context;
        this.services = services;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_service_view,parent,false);
        return new ServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final Service service = services.get(position);
        if(holder instanceof ServiceViewHolder){
//            LinearLayout lay_click = ((ServiceViewHolder) holder).lay_click;
//            lay_click.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    context.;
//                }
//            });

        }
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    private class ServiceViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lay_click;
        public ServiceViewHolder(View view) {
            super(view);
            lay_click = view.findViewById(R.id.lay_click);
        }
    }
}
