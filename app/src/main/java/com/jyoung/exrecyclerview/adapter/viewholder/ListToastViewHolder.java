package com.jyoung.exrecyclerview.adapter.viewholder;

import android.view.View;
import android.widget.Toast;

import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.model.ListData;
import com.jyoung.exrecyclerview.model.ListToast;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListToastViewHolder extends ListItemViewHolder {
    public ListToastViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // view.getTag 가 ListToast 의 인스턴스가 아닐 경우 error handling
                if (!ListToast.class.isInstance(view.getTag())) return;

                final ListToast item = (ListToast) view.getTag();

                Toast.makeText(context, item.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setData(ListData item) {
        super.setData(item);

        setIcon(R.drawable.img_toast);
    }
}
