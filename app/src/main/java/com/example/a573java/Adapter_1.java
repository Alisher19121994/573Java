package com.example.a573java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Contents> list;

    public Adapter_1(Context context, ArrayList<Contents> list) {
        this.context = context;
        this.list = list;
    }

    int EXPLORE = 0;
    int CONTENTS = 1;

    boolean isHeader(int position) {
        return position == 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (isHeader(position)) {
            return EXPLORE;
        } else {
            return CONTENTS;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == EXPLORE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.explore, parent, false);
            return new ExploreViewHolder(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contents, parent, false);
        return new ContentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Contents contents = list.get(position);
        if (holder instanceof ExploreViewHolder) {
        }
        if (holder instanceof ContentsViewHolder) {
            ((ContentsViewHolder) holder).textView.setText(contents.content);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ExploreViewHolder extends RecyclerView.ViewHolder {
        public ExploreViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class ContentsViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ContentsViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.contents_text_id);
        }
    }
}
