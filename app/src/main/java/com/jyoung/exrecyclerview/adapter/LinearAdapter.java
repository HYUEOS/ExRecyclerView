package com.jyoung.exrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.adapter.viewholder.LinearDialogViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.LinearSnackbarViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.LinearToastViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListBaseViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListHeaderViewHolder;
import com.jyoung.exrecyclerview.databinding.LinearItemBinding;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class LinearAdapter extends ListAdapter {
    @NonNull
    @Override
    public ListBaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final LinearItemBinding binding = LinearItemBinding.inflate(inflater, parent, false);

        switch (viewType) {
            case TYPE_TOAST:
                return new LinearToastViewHolder(binding);
            case TYPE_SNACK:
                return new LinearSnackbarViewHolder(binding);
            case TYPE_DIALOG:
                return new LinearDialogViewHolder(binding);
            default:
                View view = inflater.inflate(R.layout.list_header, parent, false);
                return new ListHeaderViewHolder(view);
        }
    }
}
