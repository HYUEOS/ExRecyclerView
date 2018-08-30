package com.jyoung.exrecyclerview.adapter.viewholder;

import android.support.design.widget.Snackbar;

import com.jyoung.exrecyclerview.databinding.LinearItemBinding;
import com.jyoung.exrecyclerview.model.ListData;
import com.jyoung.exrecyclerview.viewmodel.ListSnackbarViewModel;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class LinearSnackbarViewHolder extends LinearDataViewHolder{
    public LinearSnackbarViewHolder(LinearItemBinding binding) {
        super(binding, new ListSnackbarViewModel());
    }

    @Override
    public void clickItem(ListData item) {
        Snackbar.make(itemView, item.getMessage(), Snackbar.LENGTH_SHORT).show();
    }
}
