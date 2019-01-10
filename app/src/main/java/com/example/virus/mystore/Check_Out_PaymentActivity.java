package com.example.virus.mystore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.kofigyan.stateprogressbar.StateProgressBar;

public class Check_Out_PaymentActivity extends AppCompatActivity {
    String[] descriptionData = {"Shopping", "Payment", "Review"};
    Switch Switchs;
    RelativeLayout heding_layout;
    LinearLayout apply_row;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check__out__payment);
        ImageView back_button = findViewById(R.id.back_button);
        heding_layout =(RelativeLayout) findViewById(R.id.heding);
        apply_row = (LinearLayout) findViewById(R.id.apply_row);
        apply_row.setVisibility(View.INVISIBLE);
        Switchs = (Switch) findViewById(R.id.simpleSwitch);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);

    }

    @Override
    protected void onResume() {
        super.onResume();
        simpleSwitchCase();
    }

    private void simpleSwitchCase(){

        Switchs.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            Toast.makeText(Check_Out_PaymentActivity.this, "Switch is On", Toast.LENGTH_SHORT).show();
                            apply_row.setVisibility(View.VISIBLE);
                            heding_layout.setVisibility(View.INVISIBLE);
                        } else {
                            apply_row.setVisibility(View.INVISIBLE);
                            heding_layout.setVisibility(View.VISIBLE);

                        }
                    }
                });




    }
}
