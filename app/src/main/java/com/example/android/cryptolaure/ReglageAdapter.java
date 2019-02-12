package com.example.android.cryptolaure;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReglageAdapter extends RecyclerView.Adapter<ReglageAdapter.UnViewHolder> {
    public static class UnViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public UnViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.reglage_item_textview);
        }
    }

    @NonNull
    @Override
    public UnViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

    }

    @Override
    public void onBindViewHolder(@NonNull UnViewHolder unViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
