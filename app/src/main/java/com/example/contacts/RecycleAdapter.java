package com.example.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contacts.databinding.ItemLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {

    private Context context;
    private List<Beer> beers = new ArrayList<>();

    public RecycleAdapter(Context context, List<Beer> beers) {
        this.context = context;
        this.beers = beers;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        ItemLayoutBinding itemLayoutBinding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()), R.layout.item_layout, viewGroup, false);

        MyViewHolder myViewHolder = new MyViewHolder(itemLayoutBinding);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {



    Beer beer = beers.get(i);
    viewHolder.itemLayoutBinding.setBeer(beer);

    }
    @Override
    public int getItemCount() {
        return beers.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ItemLayoutBinding itemLayoutBinding;
        public MyViewHolder(@NonNull ItemLayoutBinding itemView) {

            super(itemView.getRoot());
            itemLayoutBinding = itemView;
        }
    }
}
