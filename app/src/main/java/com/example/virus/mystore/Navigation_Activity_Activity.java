package com.example.virus.mystore;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.virus.mystore.Adapters.Nav_PagerAdapter;
import com.example.virus.mystore.fragments.Discover_Fragment;
import com.example.virus.mystore.fragments.Home_Fragment;
import com.example.virus.mystore.fragments.Order_Cart_Fragment;
import com.example.virus.mystore.fragments.Shopping_Cart_Fragment;


public class Navigation_Activity_Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,BottomNavigationView.OnNavigationItemSelectedListener,SeToolbarTitle {
    Toolbar toolbar;
    TabLayout tabLayout;
    TextView settitle;
    FrameLayout fragment_container;
    Fragment fragment=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation__);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        settitle = findViewById(R.id.settitle);
        fragment_container = findViewById(R.id.fragment_container);
        fragment_container.setVisibility(View.INVISIBLE);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
//---------------------------BottomNavigationView start here---------------------------------
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationBar);
        navigation.getMenu().getItem(0).setChecked(false);
        navigation.setOnNavigationItemSelectedListener(this);
        // navigation.getMenu().findItem(0).setChecked(true);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
/*
        if (savedInstanceState == null) {
            tabLayout.setVisibility(View.GONE);
            navigation.setSelectedItemId(R.id.shopping_cart); // change to whichever id should be default
        }*/
//------------------------------------------------------------
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        tabLayouts();
    }



    private void tabLayouts(){
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setVisibility(View.VISIBLE);
        tabLayout.addTab(tabLayout.newTab().setText("FOLLOWING"));
        tabLayout.addTab(tabLayout.newTab().setText("YOU"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final Nav_PagerAdapter adapter = new Nav_PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.ic_discover:
                    tabLayout.setVisibility(View.GONE);
                    loadFragment(new Discover_Fragment());
                    return true;
                case R.id.ic_import_contacts:

                    Toast.makeText(Navigation_Activity_Activity.this, "This Activity is not available",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.shopping_cart:
                    tabLayout.setVisibility(View.GONE);
                    loadFragment(new Shopping_Cart_Fragment());
                    return true;
                case R.id.ic_loyalty:
                    tabLayout.setVisibility(View.GONE);
                    loadFragment(new Order_Cart_Fragment());
                    return true;

                case R.id.ic_account:
                    tabLayout.setVisibility(View.GONE);
                    loadFragment(new Account_Fragment());
                    return true;
            }
            return loadFragment(fragment);
        }
    };



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            //loadFragment(new Home_Fragment());
            Intent i = new Intent(Navigation_Activity_Activity.this,NotficatiosActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_your_cart) {
            Intent i = new Intent(Navigation_Activity_Activity.this,Your_Cart_Activity.class);
            startActivity(i);
        } else if (id == R.id.nav_invite_friends) {
            Intent i = new Intent(Navigation_Activity_Activity.this,Invite_FriendsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        fragment_container.setVisibility(View.VISIBLE);
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }


    @Override
    public void onsetTtitle(String title) {
        settitle.setText(title);
    }
}