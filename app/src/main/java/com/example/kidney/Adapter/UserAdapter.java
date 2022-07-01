package com.example.kidney.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidney.Model.User;
import com.example.kidney.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {


    Context context;
    List<User> data;


    public UserAdapter(Context context, List<User> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);

        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull UserAdapter.MyViewHolder holder, int position) {

        holder.name.setText(data.get(position).getName());
        holder.last_name.setText(data.get(position).getLastName());
        holder.age.setText(data.get(position).getAge());
        holder.weight.setText(data.get(position).getWeight());
        holder.height.setText(data.get(position).getHeight());
        holder.gender.setText(data.get(position).getGender());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, last_name, age, weight, height, gender;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameNAME);
            last_name = itemView.findViewById(R.id.last_name);
            age = itemView.findViewById(R.id.age);
            weight = itemView.findViewById(R.id.weight);
            height = itemView.findViewById(R.id.height);
            gender = itemView.findViewById(R.id.genderG);


        }
    }
}
