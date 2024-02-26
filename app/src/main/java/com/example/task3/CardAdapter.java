package com.example.task3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder>
{
    Context context;
    ArrayList<com.example.task3.CardModel> models;


    public CardAdapter(Context context, ArrayList<com.example.task3.CardModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public CardAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_layout,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.MyViewHolder myViewHolder, int position) {
        myViewHolder.text.setText(models.get(position).getText());
        myViewHolder.iv.setImageResource(models.get(position).getImag());
    }

    @Override
    public int getItemCount() {
        return models.size();

    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView iv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.Rcv);
        }
    }
}
