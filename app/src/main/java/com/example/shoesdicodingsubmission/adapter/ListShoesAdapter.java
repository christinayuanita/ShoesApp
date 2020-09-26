package com.example.shoesdicodingsubmission.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.shoesdicodingsubmission.R;
import com.example.shoesdicodingsubmission.model.Shoes;

import java.util.ArrayList;

public class ListShoesAdapter extends RecyclerView.Adapter<ListShoesAdapter.ListViewHolder> {

    private ArrayList<Shoes> listShoes;
    private OnItemClickCallback onItemClickCallback;

    public ListShoesAdapter(ArrayList<Shoes> listShoes) {
        this.listShoes = listShoes;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_shoes, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Shoes shoes = listShoes.get(position);
        Glide.with(holder.itemView.getContext())
                .load(shoes.getPhoto())
                .apply(new RequestOptions().override(550, 450))
                .into(holder.imgPhoto);
        holder.name.setText(shoes.getName());
        holder.detail.setText(shoes.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listShoes.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listShoes.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView name, detail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item);
            name = itemView.findViewById(R.id.shoes_name);
            detail = itemView.findViewById(R.id.shoes_detail);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Shoes data);
    }
}
