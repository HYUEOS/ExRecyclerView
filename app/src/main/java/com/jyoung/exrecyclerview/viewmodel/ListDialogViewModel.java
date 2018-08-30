package com.jyoung.exrecyclerview.viewmodel;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;

import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListDialogViewModel extends ListItemViewModel {
    @Override
    public void clickItem(View view) {
        ListData item = getItem();

        if (item == null) return;

        final AlertDialog.Builder dialog = new AlertDialog.Builder(view.getContext());

        dialog.setTitle(item.getTitle())
                .setMessage(item.getMessage())
                .setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

        dialog.show();
    }
}
