package com.jyoung.exrecyclerview.adapter.viewholder;

import com.jyoung.exrecyclerview.databinding.LinearItemBinding;
import com.jyoung.exrecyclerview.model.ListData;
import com.jyoung.exrecyclerview.viewmodel.ListItemViewModel;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class LinearDataViewHolder extends ListBaseViewHolder<ListData>  {
    private final LinearItemBinding binding;
    private final ListItemViewModel viewModel;

    public LinearDataViewHolder(LinearItemBinding binding, ListItemViewModel viewModel) {
        super(binding.getRoot());

        this.binding = binding;
        this.viewModel = viewModel;
    }

    @Override
    public void setData(ListData item) {
        viewModel.setItem(item);
        binding.setViewModel(viewModel);
        binding.executePendingBindings();
    }
}
