package com.example.kidney.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidney.Model.History;
import com.example.kidney.R;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {


    Context context;
    List<History> data;


    public HistoryAdapter(Context context, List<History> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_history, parent, false);

        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull HistoryAdapter.MyViewHolder holder, int position) {

        holder.duration.setText(data.get(position).getDuration());
        holder.drowsiness.setText(data.get(position).getDrowsiness() + "");
        holder.change.setText(data.get(position).getChange() + "");
        holder.hands.setText(data.get(position).getHands() + "");
        holder.ex_protein.setText(data.get(position).getEx_protein() + "");
        holder.urinary.setText(data.get(position).getUrinary() + "");
        holder.urinary_color.setText(data.get(position).getUrinary_color() + "");
        holder.urinary_volume.setText(data.get(position).getUrinary_volume() + "");
        holder.hospital_history.setText(data.get(position).getHospital_history() + "");
        holder.date.setText(data.get(position).getDate() + "");

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        TextView duration, drowsiness, change, hands, ex_protein, urinary, urinary_color, urinary_volume, hospital_history, date;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            duration = itemView.findViewById(R.id.durationOfDisease);
            drowsiness = itemView.findViewById(R.id.drowsiness);
            change = itemView.findViewById(R.id.changesCreatinine);
            hands = itemView.findViewById(R.id.handsAndFoot);
            ex_protein = itemView.findViewById(R.id.ex_protein);
            urinary = itemView.findViewById(R.id.urinary);
            urinary_color = itemView.findViewById(R.id.urinary_color);
            urinary_volume = itemView.findViewById(R.id.urinary_volume);
            hospital_history = itemView.findViewById(R.id.hospital_history);
            date = itemView.findViewById(R.id.dateOfRegister);

        }
    }
}
