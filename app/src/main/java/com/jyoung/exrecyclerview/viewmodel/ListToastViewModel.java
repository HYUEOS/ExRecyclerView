package com.jyoung.exrecyclerview.viewmodel;

import android.view.View;
import android.widget.Toast;

import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListToastViewModel extends ListItemViewModel {
    @Override
    public void clickItem(View view) {
        ListData item = getItem();

        if (item == null) return;

        Toast.makeText(view.getContext(), item.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
