package com.example.virus.mystore.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.virus.mystore.R;
import com.example.virus.mystore.model_classes.YourCart_Model;

import java.util.List;

public class RecyclerAdapter_YourCart extends RecyclerView.Adapter<RecyclerAdapter_YourCart.ViewHolder> {

    private Context context;
    private List<YourCart_Model> yourCart_models;

    public RecyclerAdapter_YourCart(Context context, List yourCart_models) {
        this.context = context;
        this.yourCart_models = yourCart_models;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.your_cart_items, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(yourCart_models.get(position));

        YourCart_Model pu = yourCart_models.get(position);

        holder.item_name.setText(pu.getItem_name());
        holder.item_price.setText(pu.getItem_price());

    }

    @Override
    public int getItemCount() {
        return yourCart_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView item_name;
        public TextView item_price;

        public ViewHolder(View itemView) {
            super(itemView);

            item_name = (TextView) itemView.findViewById(R.id.item_name);
            item_price = (TextView) itemView.findViewById(R.id.item_price);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    YourCart_Model cpu = (YourCart_Model) view.getTag();

                    Toast.makeText(view.getContext(), cpu.getItem_name()+" is "+ cpu.getItem_price(), Toast.LENGTH_SHORT).show();

                }
            });

        }
    }

}