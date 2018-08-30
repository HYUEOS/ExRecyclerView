package com.jyoung.exrecyclerview.adapter.viewholder;

import com.jyoung.exrecyclerview.databinding.GridItemBinding;
import com.jyoung.exrecyclerview.model.ListData;
import com.jyoung.exrecyclerview.viewmodel.ListItemViewModel;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class GridDataViewHolder extends ListBaseViewHolder<ListData>  {
    private final GridItemBinding binding;
    private final ListItemViewModel viewModel;

    public GridDataViewHolder(GridItemBinding binding, ListItemViewModel viewModel) {
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
