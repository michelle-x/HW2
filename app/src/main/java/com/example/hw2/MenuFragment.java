package com.example.hw2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MenuFragment extends Fragment {

    private RecyclerView recyclerView;

    public MenuFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_recycler, container, false);


        recyclerView = view.findViewById(R.id.rv_menu);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        FoodAdapter articleAdapter = new FoodAdapter();

        articleAdapter.setData(MenuDatabase.getAllFoods());
        recyclerView.setAdapter(articleAdapter);

        return view;
    }


}
