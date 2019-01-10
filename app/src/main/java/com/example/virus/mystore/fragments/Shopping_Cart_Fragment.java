package com.example.virus.mystore.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.virus.mystore.R;
import com.example.virus.mystore.SeToolbarTitle;

public class Shopping_Cart_Fragment extends Fragment {
View root;
SeToolbarTitle seToolbarTitle;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        seToolbarTitle = (SeToolbarTitle) getContext();
    }
    public static Shopping_Cart_Fragment newInstance() {
        Shopping_Cart_Fragment fragment = new Shopping_Cart_Fragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      root = inflater.inflate(R.layout.fragment_shopping__cart_, container, false);

      return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        seToolbarTitle.onsetTtitle("Shopping Cart");
    }
}
