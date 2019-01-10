package com.example.virus.mystore.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.virus.mystore.NotficatiosActivity;
import com.example.virus.mystore.R;
import com.example.virus.mystore.model_classes.Nav_model_You;

import java.util.List;

public class Nav_RecyclerAdapter_You extends RecyclerView.Adapter<Nav_RecyclerAdapter_You.ViewHolder> {

    private Context context;
    private List<Nav_model_You> nav_model_you;

    public Nav_RecyclerAdapter_You(Context context, List nav_model_you) {
        this.context = context;
        this.nav_model_you = nav_model_you;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_you_nav, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(nav_model_you.get(position));

        Nav_model_You pu = nav_model_you.get(position);

        holder.pName.setText(pu.getPersonName());
        holder.pJobProfile.setText(pu.getJobProfile());

    }

    @Override
    public int getItemCount() {
        return nav_model_you.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView pName;
        public TextView pJobProfile;

        public ViewHolder(final View itemView) {
            super(itemView);

            pName = (TextView) itemView.findViewById(R.id.pNametxt);
            pJobProfile = (TextView) itemView.findViewById(R.id.pJobProfiletxt);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Nav_model_You cpu = (Nav_model_You) view.getTag();

                    Toast.makeText(view.getContext(), cpu.getPersonName()+" is "+ cpu.getJobProfile(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context,NotficatiosActivity.class);
                    context.startActivity(intent);

                }
            });

        }
    }

}