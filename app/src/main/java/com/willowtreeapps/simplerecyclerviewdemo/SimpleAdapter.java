package com.willowtreeapps.simplerecyclerviewdemo;

import android.support.v7.widget.RecyclerView;
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
        return null;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.item_simple_itemview;
    }
}
