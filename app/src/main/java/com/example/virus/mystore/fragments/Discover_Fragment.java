package com.example.virus.mystore.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.virus.mystore.R;
import com.example.virus.mystore.SeToolbarTitle;


public class Discover_Fragment extends Fragment {

    SeToolbarTitle seToolbarTitle;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        seToolbarTitle = (SeToolbarTitle) getContext();
    }

    public static Discover_Fragment newInstance() {
        Discover_Fragment fragment = new Discover_Fragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_invite__friends_, container, false);
    }
    @Override
    public void onResume() {
        super.onResume();
        seToolbarTitle.onsetTtitle("Promo Codes");
    }
}
