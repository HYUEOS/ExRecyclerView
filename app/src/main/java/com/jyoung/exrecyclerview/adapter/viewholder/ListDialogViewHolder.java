package com.jyoung.exrecyclerview.adapter.viewholder;

import android.view.View;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListDialogViewHolder extends ListItemViewHolder {
    public ListDialogViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(ListData item) {
        super.setData(item);

        setIcon(R.drawable.img_dialog);
    }
}
