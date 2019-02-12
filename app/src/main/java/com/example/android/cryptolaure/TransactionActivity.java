package com.example.android.cryptolaure;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TransactionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        MyAsyncTask bob = new MyAsyncTask();
        bob.execute();




    }

    private class MyAsyncTask extends AsyncTask<String, Void, LinkedList<Transaction>> {


        @Override
        protected LinkedList<Transaction> doInBackground(String... strings) {
            LinkedList<Transaction> words = new LinkedList<Transaction>();

            words.add(new Transaction((float) 1.0, "KFC 59000", "validé", 1));
            words.add(new Transaction((float) 2.0, "Mc Donald 59000", "pendingg", 2));


            return words;
        }


        protected void onPostExecute(LinkedList<Transaction> listeDeTransaction) {
            RecyclerView mRecyclerView = findViewById(R.id.transaction_recyclerview);
            TransactionAdapter mAdapter = new TransactionAdapter(TransactionActivity.this, listeDeTransaction);
            mRecyclerView.setAdapter(mAdapter);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(TransactionActivity.this));

        }

    }


}


