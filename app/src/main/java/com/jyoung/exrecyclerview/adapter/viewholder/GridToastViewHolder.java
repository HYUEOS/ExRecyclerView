package com.jyoung.exrecyclerview.adapter.viewholder;

import android.widget.Toast;

import com.jyoung.exrecyclerview.databinding.GridItemBinding;
import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class GridToastViewHolder extends GridDataViewHolder {
    public GridToastViewHolder(GridItemBinding binding) {
        super(binding);
    }

    @Override
    public void clickItem(ListData item) {
        Toast.makeText(context, item.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
