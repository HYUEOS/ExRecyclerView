package com.jyoung.exrecyclerview.adapter.viewholder;

import android.content.Context;

import com.jyoung.exrecyclerview.databinding.GridItemBinding;
import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public abstract class GridDataViewHolder extends ListBaseViewHolder<ListData>  {
    private final GridItemBinding binding;
    protected final Context context;

    public GridDataViewHolder(GridItemBinding binding) {
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
