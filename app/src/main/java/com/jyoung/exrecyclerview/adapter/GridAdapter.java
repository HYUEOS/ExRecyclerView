package com.jyoung.exrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.adapter.viewholder.GridDialogViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.GridSnackbarViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.GridToastViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListBaseViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListHeaderViewHolder;
import com.jyoung.exrecyclerview.databinding.GridItemBinding;
import com.jyoung.exrecyclerview.model.ListHeader;
import com.jyoung.exrecyclerview.model.ListItem;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class GridAdapter extends ListAdapter {
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
        final GridItemBinding binding = GridItemBinding.inflate(inflater, parent, false);

        switch (viewType) {
            case TYPE_TOAST:
                return new GridToastViewHolder(binding);
            case TYPE_SNACK:
                return new GridSnackbarViewHolder(binding);
            case TYPE_DIALOG:
                return new GridDialogViewHolder(binding);
            default:
                View view = inflater.inflate(R.layout.list_header, parent, false);
                return new ListHeaderViewHolder(view);
        }
    }
}
