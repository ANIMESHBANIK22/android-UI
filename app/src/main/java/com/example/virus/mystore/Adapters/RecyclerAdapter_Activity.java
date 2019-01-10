package com.example.virus.mystore.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.virus.mystore.R;
import com.example.virus.mystore.model_classes.Sub_Details;

import java.util.List;

public class RecyclerAdapter_Activity  extends RecyclerView.Adapter<RecyclerAdapter_Activity.ViewHolder> {

    private Context context;
    private List<Sub_Details> sub_details;

    public RecyclerAdapter_Activity(Context context, List sub_details) {
        this.context = context;
        this.sub_details = sub_details;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_activity_notifition, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(sub_details.get(position));

        Sub_Details pu = sub_details.get(position);

        holder.pName.setText(pu.getPersonName());
        holder.pJobProfile.setText(pu.getJobProfile());

    }

    @Override
    public int getItemCount() {
        return sub_details.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView pName;
        public TextView pJobProfile;

        public ViewHolder(View itemView) {
            super(itemView);

            pName = (TextView) itemView.findViewById(R.id.pNametxt);
            pJobProfile = (TextView) itemView.findViewById(R.id.pJobProfiletxt);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Sub_Details cpu = (Sub_Details) view.getTag();

                    Toast.makeText(view.getContext(), cpu.getPersonName()+" is "+ cpu.getJobProfile(), Toast.LENGTH_SHORT).show();

                }
            });

        }
    }

}