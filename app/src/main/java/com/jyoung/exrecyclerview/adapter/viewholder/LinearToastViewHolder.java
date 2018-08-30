package com.jyoung.exrecyclerview.adapter.viewholder;

import android.widget.Toast;

import com.jyoung.exrecyclerview.databinding.LinearItemBinding;
import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class LinearToastViewHolder extends LinearDataViewHolder {
    public LinearToastViewHolder(LinearItemBinding binding) {
        super(binding);
    }

    @Override
    public void clickItem(ListData item) {
        Toast.makeText(context, item.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
