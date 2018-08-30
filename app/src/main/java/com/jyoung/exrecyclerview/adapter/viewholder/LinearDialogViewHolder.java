package com.jyoung.exrecyclerview.adapter.viewholder;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.jyoung.exrecyclerview.databinding.LinearItemBinding;
import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class LinearDialogViewHolder extends LinearDataViewHolder {
    public LinearDialogViewHolder(LinearItemBinding binding) {
        super(binding);
    }

    @Override
    public void clickItem(ListData item) {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(context);

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
