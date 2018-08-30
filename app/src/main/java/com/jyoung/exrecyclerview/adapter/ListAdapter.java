package com.jyoung.exrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.adapter.viewholder.ListBaseViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListDialogViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListHeaderViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListSnackBarViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListToastViewHolder;
import com.jyoung.exrecyclerview.model.ListDialog;
import com.jyoung.exrecyclerview.model.ListItem;
import com.jyoung.exrecyclerview.model.ListSnackBar;
import com.jyoung.exrecyclerview.model.ListToast;

import java.util.ArrayList;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListAdapter extends RecyclerView.Adapter<ListBaseViewHolder> {
    private ArrayList<ListItem> items;

    private final int TYPE_HEADER = 0;
    private final int TYPE_TOAST = 1;
    private final int TYPE_SNACK = 2;
    private final int TYPE_DIALOG = 3;

    public ListAdapter(ArrayList<ListItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ListBaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = null;

        switch (viewType) {
            case TYPE_TOAST:
                view = inflater.inflate(R.layout.linear_item, parent, false);
                return new ListToastViewHolder(view);
            case TYPE_SNACK:
                view = inflater.inflate(R.layout.linear_item, parent, false);
                return new ListSnackBarViewHolder(view);
            case TYPE_DIALOG:
                view = inflater.inflate(R.layout.linear_item, parent, false);
                return new ListDialogViewHolder(view);
            default:
                view = inflater.inflate(R.layout.list_header, parent, false);
                return new ListHeaderViewHolder(view);
        }
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
        } else if (item instanceof ListSnackBar) {
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
