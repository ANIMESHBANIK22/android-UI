package com.example.virus.mystore.Adapters;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.virus.mystore.fragments.Activity_Fragment;
import com.example.virus.mystore.fragments.Descover_Fragment;
import com.example.virus.mystore.fragments.Following_Fragment;
import com.example.virus.mystore.fragments.Home_Fragment;
import com.example.virus.mystore.fragments.You_Fragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    public android.support.v4.app.Fragment getItem(int position){
        switch (position) {
            case 0:
                Home_Fragment home_fragment = new Home_Fragment();
                return home_fragment;
            case 1:
                Descover_Fragment descover_fragment = new Descover_Fragment();
                return descover_fragment;
            case 2:
                Activity_Fragment activity_fragment = new Activity_Fragment();
                return activity_fragment;
            case 3:
                Following_Fragment following_fragment = new Following_Fragment();
                return following_fragment;
            case 4:
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