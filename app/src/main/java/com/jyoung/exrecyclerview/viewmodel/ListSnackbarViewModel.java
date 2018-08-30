package com.jyoung.exrecyclerview.viewmodel;

import android.support.design.widget.Snackbar;
import android.view.View;

import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListSnackbarViewModel extends ListItemViewModel {
    @Override
    public void clickItem(View view) {
        ListData item = getItem();

        if (item == null) return;

        Snackbar.make(view, item.getMessage(), Snackbar.LENGTH_SHORT).show();
    }
}
