package com.jyoung.exrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.adapter.viewholder.ListBaseViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListHeaderViewHolder;
import com.jyoung.exrecyclerview.model.ListItem;

import java.util.ArrayList;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListAdapter extends RecyclerView.Adapter<ListBaseViewHolder> {

    @NonNull
    @Override
    public ListBaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_header, parent, false);
        return new ListHeaderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBaseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
