package com.jyoung.exrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.adapter.viewholder.LinearDataViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListBaseViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListHeaderViewHolder;
import com.jyoung.exrecyclerview.databinding.LinearItemBinding;
import com.jyoung.exrecyclerview.viewmodel.ListDialogViewModel;
import com.jyoung.exrecyclerview.viewmodel.ListItemViewModel;
import com.jyoung.exrecyclerview.viewmodel.ListSnackbarViewModel;
import com.jyoung.exrecyclerview.viewmodel.ListToastViewModel;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class LinearAdapter extends ListAdapter {
    @NonNull
    @Override
    public ListBaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final LinearItemBinding binding = LinearItemBinding.inflate(inflater, parent, false);
        ListItemViewModel viewModel;

        switch (viewType) {
            case TYPE_TOAST:
                viewModel = new ListToastViewModel();
                return new LinearDataViewHolder(binding, viewModel);
            case TYPE_SNACK:
                viewModel = new ListSnackbarViewModel();
                return new LinearDataViewHolder(binding, viewModel);
            case TYPE_DIALOG:
                viewModel = new ListDialogViewModel();
                return new LinearDataViewHolder(binding, viewModel);
            default:
                View view = inflater.inflate(R.layout.list_header, parent, false);
                return new ListHeaderViewHolder(view);
        }
    }
}
