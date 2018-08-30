package com.jyoung.exrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.adapter.viewholder.ListBaseViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListDialogViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListHeaderViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListSnackbarViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListToastViewHolder;
import com.jyoung.exrecyclerview.model.ListHeader;
import com.jyoung.exrecyclerview.model.ListItem;

import java.util.ArrayList;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class GridAdapter extends ListAdapter {
    public GridAdapter(ArrayList<ListItem> items) {
        super(items);
    }

    public boolean isHeader(int position) {
        if (items == null || position < 0 || position >= getItemCount()) return true;

        final ListItem item = items.get(position);

        if (item == null || item instanceof ListHeader) return true;

        return false;
    }

    @NonNull
    @Override
    public ListBaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = null;

        switch (viewType) {
            case TYPE_TOAST:
                view = inflater.inflate(R.layout.grid_item, parent, false);
                return new ListToastViewHolder(view);
            case TYPE_SNACK:
                view = inflater.inflate(R.layout.grid_item, parent, false);
                return new ListSnackbarViewHolder(view);
            case TYPE_DIALOG:
                view = inflater.inflate(R.layout.grid_item, parent, false);
                return new ListDialogViewHolder(view);
            default:
                view = inflater.inflate(R.layout.list_header, parent, false);
                return new ListHeaderViewHolder(view);
        }
    }
}
