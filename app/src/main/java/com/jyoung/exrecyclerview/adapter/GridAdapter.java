package com.jyoung.exrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.adapter.viewholder.GridDataViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListBaseViewHolder;
import com.jyoung.exrecyclerview.adapter.viewholder.ListHeaderViewHolder;
import com.jyoung.exrecyclerview.databinding.GridItemBinding;
import com.jyoung.exrecyclerview.model.ListHeader;
import com.jyoung.exrecyclerview.model.ListItem;
import com.jyoung.exrecyclerview.viewmodel.ListDialogViewModel;
import com.jyoung.exrecyclerview.viewmodel.ListItemViewModel;
import com.jyoung.exrecyclerview.viewmodel.ListSnackbarViewModel;
import com.jyoung.exrecyclerview.viewmodel.ListToastViewModel;

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
        ListItemViewModel viewModel;

        switch (viewType) {
            case TYPE_TOAST:
                viewModel = new ListToastViewModel();
                return new GridDataViewHolder(binding, viewModel);
            case TYPE_SNACK:
                viewModel = new ListSnackbarViewModel();
                return new GridDataViewHolder(binding, viewModel);
            case TYPE_DIALOG:
                viewModel = new ListDialogViewModel();
                return new GridDataViewHolder(binding, viewModel);
            default:
                View view = inflater.inflate(R.layout.list_header, parent, false);
                return new ListHeaderViewHolder(view);
        }
    }
}
