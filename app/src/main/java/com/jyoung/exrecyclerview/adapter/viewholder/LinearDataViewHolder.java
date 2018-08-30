package com.jyoung.exrecyclerview.adapter.viewholder;

import android.content.Context;

import com.jyoung.exrecyclerview.databinding.LinearItemBinding;
import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public abstract class LinearDataViewHolder extends ListBaseViewHolder<ListData>  {
    private final LinearItemBinding binding;
    protected final Context context;

    public LinearDataViewHolder(LinearItemBinding binding) {
        super(binding.getRoot());

        this.binding = binding;
        this.context = binding.getRoot().getContext();
    }

    @Override
    public void setData(ListData item) {
        binding.setItem(item);
        binding.executePendingBindings();
    }

    public abstract void clickItem(ListData item);
}
