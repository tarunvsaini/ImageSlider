package com.example.tarun.imageslider;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Tarun on 10-09-2016.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {

    private Context mContext;
    private List<Model> ModelList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, desc;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            desc = (TextView) view.findViewById(R.id.desc);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);

        }
    }


    public DataAdapter(Context mContext, List<Model> ModelList) {
        this.mContext = mContext;
        this.ModelList = ModelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Model Model = ModelList.get(position);
        holder.title.setText(Model.getName());
        holder.desc.setText(Model.getDesc());

        // loading Model cover using Glide library
        Glide.with(mContext).load(Model.getThumbnail()).into(holder.thumbnail);


    }



    @Override
    public int getItemCount() {
        return ModelList.size();
    }
}
