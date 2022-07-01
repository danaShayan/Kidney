package com.example.kidney.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidney.Model.Sonography;
import com.example.kidney.R;

import java.util.ArrayList;
import java.util.List;

public class SonographyAdapter extends RecyclerView.Adapter<SonographyAdapter.MyViewHolder> {


    Context context;
    List<Sonography> data = new ArrayList<>();


    public SonographyAdapter(Context context, List<Sonography> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_sonography, parent, false);

        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull SonographyAdapter.MyViewHolder holder, int position) {

        holder.date.setText(data.get(position).getDate() + "");
        holder.result.setText(data.get(position).getResult() + "");
        holder.report.setText(data.get(position).getReport() + "");
        holder.next.setText(data.get(position).getNext() + "");


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        TextView date, result, next, report;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.dateOfTest);
            result = itemView.findViewById(R.id.resultOfTest);
            next = itemView.findViewById(R.id.nextReport);
            report = itemView.findViewById(R.id.report);

        }
    }
}