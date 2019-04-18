package com.example.jeewantha.kongcept;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RetrofitAdapter extends RecyclerView.Adapter<RetrofitAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<ModelRecycler> dataModelArrayList;

    public RetrofitAdapter(Context ctx, ArrayList<ModelRecycler> dataModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
    }

    @Override
    public RetrofitAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.retro_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RetrofitAdapter.MyViewHolder holder, int position) {

        Picasso.get().load(dataModelArrayList.get(position).getImgURL()).into(holder.iv);
        holder.name.setText(dataModelArrayList.get(position).getName());
        holder.email.setText(dataModelArrayList.get(position).getEmail());
        holder.branchName.setText(dataModelArrayList.get(position).getBranchName());
        holder.bankName.setText(dataModelArrayList.get(position).getBankName());

    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView email, name, branchName,bankName;
        ImageView iv;

        public MyViewHolder(View itemView) {
            super(itemView);

            email = (TextView) itemView.findViewById(R.id.email);
            name = (TextView) itemView.findViewById(R.id.name);
            branchName = (TextView) itemView.findViewById(R.id.branchName);
            bankName = (TextView) itemView.findViewById(R.id.bankName);
            iv = (ImageView) itemView.findViewById(R.id.iv);
        }

    }
}
