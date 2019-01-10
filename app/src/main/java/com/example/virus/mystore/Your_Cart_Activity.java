package com.example.virus.mystore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;


import com.example.virus.mystore.Adapters.RecyclerAdapter_YourCart;
import com.example.virus.mystore.model_classes.YourCart_Model;

import java.util.ArrayList;
import java.util.List;

public class Your_Cart_Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<YourCart_Model> yourCart_models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your__cart_);
        ImageView back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        dataListRecycler();
    }

    private void dataListRecycler(){

        recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        yourCart_models = new ArrayList<>();
        String item_name = getString(R.string.just_item);
        //Adding Data into ArrayList
        yourCart_models.add(new YourCart_Model(item_name,"153,74"));


        mAdapter = new RecyclerAdapter_YourCart(this, yourCart_models);

        recyclerView.setAdapter(mAdapter);

    }


}
