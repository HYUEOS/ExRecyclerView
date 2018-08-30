package com.jyoung.exrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.jyoung.exrecyclerview.adapter.viewholder.ListBaseViewHolder;
import com.jyoung.exrecyclerview.model.ListDialog;
import com.jyoung.exrecyclerview.model.ListItem;
import com.jyoung.exrecyclerview.model.ListSnackbar;
import com.jyoung.exrecyclerview.model.ListToast;

import java.util.ArrayList;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public abstract class ListAdapter extends RecyclerView.Adapter<ListBaseViewHolder> {
    protected ArrayList<ListItem> items;

    protected final int TYPE_HEADER = 0;
    protected final int TYPE_TOAST = 1;
    protected final int TYPE_SNACK = 2;
    protected final int TYPE_DIALOG = 3;

    public ListAdapter() {
        this.items = new ArrayList<>();
    }

    public void setItems(ArrayList<ListItem> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ListBaseViewHolder holder, int position) {
        if (items == null || position < 0 || position >= getItemCount()) return;

        final ListItem item = items.get(position);

        if (item == null) return;

        holder.itemView.setTag(item);
        holder.setData(item);
    }

    @Override
    public int getItemViewType(int position) {
        if (items == null || position < 0 || position >= getItemCount()) return TYPE_HEADER;

        final ListItem item = items.get(position);

        if (item instanceof ListToast) {
            return TYPE_TOAST;
        } else if (item instanceof ListSnackbar) {
            return TYPE_SNACK;
        } else if (item instanceof ListDialog) {
            return TYPE_DIALOG;
        } else {
            return TYPE_HEADER;
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
