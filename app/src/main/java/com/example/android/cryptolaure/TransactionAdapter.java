package com.example.android.cryptolaure;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {
    public LinkedList<Transaction> mWordList;
    private LayoutInflater mInflater;
    public TransactionAdapter(Context context,
                           LinkedList<Transaction> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }
    @Override
    public TransactionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Create view from layout
        View mItemView = mInflater.inflate(
                R.layout.transaction_layout, parent, false);
        return new TransactionViewHolder(mItemView, this);
    }
    @Override
    public void onBindViewHolder(
            TransactionViewHolder holder, int position) {
        // Retrieve the data for that position
        Transaction mCurrent = mWordList.get(position);
        // Add the data to the view
        holder.statutItemView.setText(mCurrent.getStatut());
        holder.montantItemView.setText(mCurrent.getMontantString());
        holder.transactionItemView.setText(mCurrent.getIdTransactionString());
        holder.addresseItemView.setText(mCurrent.getAdresse());
    }
    @Override
    public int getItemCount() {
        // Return the number of data items to display
        return mWordList.size();
    }
    public class TransactionViewHolder extends RecyclerView.ViewHolder {
        private TextView transactionItemView;
        private TextView montantItemView;
        private TextView statutItemView;
        private TextView addresseItemView;
        private final  TransactionAdapter mAdapter;
        public TransactionViewHolder(View itemView, TransactionAdapter adapter) {
            super(itemView);
            // Get the layout
            transactionItemView = itemView.findViewById(R.id.transactionIdText);
            addresseItemView = itemView.findViewById(R.id.adresseIdText);
            montantItemView = itemView.findViewById(R.id.montantIdText);
            statutItemView = itemView.findViewById(R.id.statusIdText);
            // Associate with this adapter
            this.mAdapter = adapter;
            // Add click listener, if desired
            //itemView.setOnClickListener(this.);
        }
// Implement onClick() if desired

    }



}

