package com.jyoung.exrecyclerview.adapter.viewholder;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.model.ListData;
import com.jyoung.exrecyclerview.model.ListDialog;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListDialogViewHolder extends ListItemViewHolder {
    public ListDialogViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // view.getTag 가 ListToast 의 인스턴스가 아닐 경우 error handling
                if (!ListDialog.class.isInstance(view.getTag())) return;

                final ListDialog item = (ListDialog) view.getTag();

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
        });
    }

    @Override
    public void setData(ListData item) {
        super.setData(item);

        setIcon(R.drawable.img_dialog);
    }
}
