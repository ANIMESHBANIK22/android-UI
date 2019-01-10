package com.example.virus.mystore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;

import com.example.virus.mystore.Adapters.RecyclerAdapter_YourCart;
import com.example.virus.mystore.model_classes.YourCart_Model;
import com.kofigyan.stateprogressbar.StateProgressBar;

import java.util.ArrayList;
import java.util.List;

public class Check_Out_Review_Activity extends AppCompatActivity {
    String[] descriptionData = {"Shopping", "Payment", "Review"};
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<YourCart_Model> yourCart_models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check__out__review_);
        ImageView back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);
        dataListRecycler();
    }

    private void dataListRecycler(){

        recyclerView = (RecyclerView) findViewById(R.id.recycleViewReview);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        yourCart_models = new ArrayList<>();
        //Adding Data into ArrayList
        yourCart_models.add(new YourCart_Model("Stylish Clothes Item Simple","153,74"));
        yourCart_models.add(new YourCart_Model("Stylish Clothes Item Simple","153,74"));



        mAdapter = new RecyclerAdapter_Review(this, yourCart_models);

        recyclerView.setAdapter(mAdapter);

    }
}
