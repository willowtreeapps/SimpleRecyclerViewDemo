package com.willowtreeapps.simplerecyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter {

    private List<SimpleViewModel> models = new ArrayList<>();

    public SimpleAdapter(final List<SimpleViewModel> viewModels) {
        if (viewModels != null) {
            this.models.addAll(viewModels);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ((SimpleViewHolder) holder).bindData(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.item_simple_itemview;
    }
}
