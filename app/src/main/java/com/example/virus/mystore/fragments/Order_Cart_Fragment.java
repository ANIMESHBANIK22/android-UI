package com.example.virus.mystore.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.virus.mystore.Adapters.RecyclerAdapter_YourCart;
import com.example.virus.mystore.R;
import com.example.virus.mystore.SeToolbarTitle;
import com.example.virus.mystore.model_classes.YourCart_Model;

import java.util.ArrayList;
import java.util.List;

public class Order_Cart_Fragment extends Fragment {
    View root;
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<YourCart_Model> yourCart_models;

    SeToolbarTitle seToolbarTitle;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        seToolbarTitle = (SeToolbarTitle) getContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_order__cart_, container, false);
        dataListRecycler();
        return root;
    }

    private void dataListRecycler(){

        recyclerView = (RecyclerView) root.findViewById(R.id.recycleViewContainer);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        yourCart_models = new ArrayList<>();
        String item_name = getString(R.string.just_item);
        //Adding Data into ArrayList
        yourCart_models.add(new YourCart_Model(item_name,"153,74"));
        yourCart_models.add(new YourCart_Model(item_name,"153,74"));
        yourCart_models.add(new YourCart_Model(item_name,"153,74"));


        mAdapter = new RecyclerAdapter_YourCart(getActivity(), yourCart_models);

        recyclerView.setAdapter(mAdapter);

    }


    @Override
    public void onResume() {
        super.onResume();
        seToolbarTitle.onsetTtitle("mystore");
    }
}
