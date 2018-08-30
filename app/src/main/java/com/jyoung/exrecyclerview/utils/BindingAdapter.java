package com.jyoung.exrecyclerview.utils;

import android.support.v7.widget.RecyclerView;

import com.jyoung.exrecyclerview.adapter.ListAdapter;
import com.jyoung.exrecyclerview.model.ListItem;

import java.util.ArrayList;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class BindingAdapter {
    @android.databinding.BindingAdapter("items")
    public static void bindLinearItems(RecyclerView recyclerView, ArrayList<ListItem> items) {
        if (recyclerView == null || recyclerView.getAdapter() == null
                || !ListAdapter.class.isInstance(recyclerView.getAdapter())) return;

        final ListAdapter adapter = (ListAdapter) recyclerView.getAdapter();

        adapter.setItems(items);
    }
}
