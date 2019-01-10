package com.example.virus.mystore.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.virus.mystore.Adapters.Nav_RecyclerAdapter_You;
import com.example.virus.mystore.R;
import com.example.virus.mystore.model_classes.Nav_model_You;

import java.util.ArrayList;
import java.util.List;


public class You_Fragment extends Fragment {
    View root;
    RecyclerView recyclerView;
    Nav_RecyclerAdapter_You mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<Nav_model_You> sub_item_List;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_you_, container, false);
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
        sub_item_List.add(new Nav_model_You("Lairy Karmin","Added 10 comments on this."));
        sub_item_List.add(new Nav_model_You("Lairy Karmin","Added 10 comments on this."));
        sub_item_List.add(new Nav_model_You("Lairy Karmin","Added 10 comments on this."));
        sub_item_List.add(new Nav_model_You("Lairy Karmin","Added 10 comments on this."));
        sub_item_List.add(new Nav_model_You("Lairy Karmin","Added 10 comments on this."));
        sub_item_List.add(new Nav_model_You("Lairy Karmin","Added 10 comments on this."));

        mAdapter = new Nav_RecyclerAdapter_You(getActivity(), sub_item_List);

        recyclerView.setAdapter(mAdapter);

    }
}