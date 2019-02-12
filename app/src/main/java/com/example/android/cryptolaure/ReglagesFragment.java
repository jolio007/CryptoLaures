package com.example.android.cryptolaure;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ReglagesFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ArrayList<Item> ItemList = new ArrayList<>();
        ItemList.add(new Item("Réglages personnel"));
        ItemList.add(new Item("Gestion de compte"));
        ItemList.add(new Item("Sécurite"));
        ItemList.add(new Item("Préférence"));
        ItemList.add(new Item("Déconnexion"));




        return inflater.inflate(R.layout.fragment_reglages,container,false);
    }
}
