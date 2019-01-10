package com.example.virus.mystore.Adapters;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.virus.mystore.fragments.Activity_Fragment;
import com.example.virus.mystore.fragments.Descover_Fragment;
import com.example.virus.mystore.fragments.Following_Fragment;
import com.example.virus.mystore.fragments.Home_Fragment;
import com.example.virus.mystore.fragments.You_Fragment;

public class Nav_PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public Nav_PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    public android.support.v4.app.Fragment getItem(int position){
        switch (position) {

            case 0:
                Following_Fragment following_fragment = new Following_Fragment();
                return following_fragment;
            case 1:
                You_Fragment you_fragment = new You_Fragment();
                return you_fragment;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}