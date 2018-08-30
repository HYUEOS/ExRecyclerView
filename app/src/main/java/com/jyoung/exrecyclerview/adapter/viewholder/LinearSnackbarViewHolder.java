package com.jyoung.exrecyclerview.adapter.viewholder;

import android.support.design.widget.Snackbar;

import com.jyoung.exrecyclerview.databinding.LinearItemBinding;
import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class LinearSnackbarViewHolder extends LinearDataViewHolder{
    public LinearSnackbarViewHolder(LinearItemBinding binding) {
        super(binding);
    }

    @Override
    public void clickItem(ListData item) {
        Snackbar.make(itemView, item.getMessage(), Snackbar.LENGTH_SHORT).show();
    }
}
