package com.jyoung.exrecyclerview.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jyoung.exrecyclerview.model.ListItem;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public abstract class ListBaseViewHolder<T extends ListItem> extends RecyclerView.ViewHolder {
    public ListBaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setData(T item);
}
