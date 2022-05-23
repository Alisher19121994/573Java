package com.example.a573java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Shorts> list;

    public Adapter_2(Context context, ArrayList<Shorts> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shorts_video, parent, false);
        return new ShortsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Shorts shorts = list.get(position);

        if (holder instanceof ShortsViewHolder) {
            ((ShortsViewHolder) holder).imageView.setImageResource(shorts.image);
            ((ShortsViewHolder) holder).textView1.setText(shorts.title);
            ((ShortsViewHolder) holder).textView2.setText(shorts.views);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ShortsViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1;
        TextView textView2;

        public ShortsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.shorts_videos_image_id);
            textView1 = itemView.findViewById(R.id.shorts_text_1_id);
            textView2 = itemView.findViewById(R.id.shorts_text_2_id);
        }
    }
}
