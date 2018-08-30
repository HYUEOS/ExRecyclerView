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

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class LinearAdapter extends ListAdapter {
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
                return new ListSnackbarViewHolder(view);
            case TYPE_DIALOG:
                view = inflater.inflate(R.layout.linear_item, parent, false);
                return new ListDialogViewHolder(view);
            default:
                view = inflater.inflate(R.layout.list_header, parent, false);
                return new ListHeaderViewHolder(view);
        }
    }
}
