package com.jyoung.exrecyclerview.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;

import com.jyoung.exrecyclerview.model.ListItem;

import java.util.ArrayList;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListViewModel extends BaseObservable {
    public ObservableArrayList<ListItem> items = new ObservableArrayList<>();

    public void setItems(ArrayList<ListItem> items) {
        this.items.clear();
        this.items.addAll(items);
    }
}
