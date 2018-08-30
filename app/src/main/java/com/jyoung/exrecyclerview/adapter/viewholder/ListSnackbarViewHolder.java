package com.jyoung.exrecyclerview.adapter.viewholder;

import android.support.design.widget.Snackbar;
import android.view.View;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.model.ListData;
import com.jyoung.exrecyclerview.model.ListSnackbar;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListSnackbarViewHolder extends ListItemViewHolder {
    public ListSnackbarViewHolder(final View itemView) {
        super(itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // view.getTag 가 ListToast 의 인스턴스가 아닐 경우 error handling
                if (!ListSnackbar.class.isInstance(view.getTag())) return;

                final ListSnackbar item = (ListSnackbar) view.getTag();

                Snackbar.make(itemView, item.getMessage(), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setData(ListData item) {
        super.setData(item);

        setIcon(R.drawable.img_snack);
    }
}
