package com.jyoung.exrecyclerview.viewmodel;

import android.databinding.Observable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.Nullable;
import android.view.View;

import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public abstract class ListItemViewModel {
    private final ObservableField<ListData> observableItem = new ObservableField<>();

    public final ObservableInt iconResource = new ObservableInt();
    public final ObservableField<String> title = new ObservableField<>();

    public ListItemViewModel() {
        observableItem.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                ListData item = getItem();

                if (item == null) return;

                iconResource.set(item.getIconResource());
                title.set(item.getTitle());
            }
        });
    }

    @Nullable
    public ListData getItem() {
        return observableItem.get();
    }

    public abstract void clickItem(View view);
}
