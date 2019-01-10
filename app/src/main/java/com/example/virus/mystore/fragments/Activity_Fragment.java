package com.example.virus.mystore.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.virus.mystore.Adapters.RecyclerAdapter_Activity;
import com.example.virus.mystore.R;
import com.example.virus.mystore.model_classes.Sub_Details;

import java.util.ArrayList;
import java.util.List;

public class Activity_Fragment extends Fragment {
    View root;
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<Sub_Details> sub_item_List;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_activity_, container, false);
        dataListRecycler();

        return root;
    }

    private void dataListRecycler(){

        recyclerView = (RecyclerView) root.findViewById(R.id.recycleViewContainer);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        sub_item_List = new ArrayList<>();

        //Adding Data into ArrayList
        sub_item_List.add(new Sub_Details("Animesh Banik","SYMB Technologies"));
        sub_item_List.add(new Sub_Details("Animesh Banik","SYMB Technologies"));
        sub_item_List.add(new Sub_Details("Animesh Banik","SYMB Technologies"));
        sub_item_List.add(new Sub_Details("Animesh Banik","SYMB Technologies"));
        sub_item_List.add(new Sub_Details("Animesh Banik","SYMB Technologies"));
        sub_item_List.add(new Sub_Details("Animesh Banik","SYMB Technologies"));
        sub_item_List.add(new Sub_Details("Animesh Banik","SYMB Technologies"));
        sub_item_List.add(new Sub_Details("Animesh Banik","SYMB Technologies"));


        mAdapter = new RecyclerAdapter_Activity(getActivity(), sub_item_List);

        recyclerView.setAdapter(mAdapter);

    }
}