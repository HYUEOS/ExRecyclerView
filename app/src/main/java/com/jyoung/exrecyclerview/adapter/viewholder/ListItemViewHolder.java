package com.jyoung.exrecyclerview.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jyoung.exrecyclerview.R;
import com.jyoung.exrecyclerview.model.ListData;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListItemViewHolder extends ListBaseViewHolder<ListData> {
    private final ImageView ivIcon;
    private final TextView tvTitle;

    protected final Context context;

    public ListItemViewHolder(View itemView) {
        super(itemView);

        context = itemView.getContext();

        // initialize views
        ivIcon = itemView.findViewById(R.id.iv_item);
        tvTitle = itemView.findViewById(R.id.tv_item);
    }

    @Override
    public void setData(ListData item) {
        tvTitle.setText(item.getTitle());
    }

    protected void setIcon(int resourceId) {
        Glide.with(context.getApplicationContext()).load(resourceId).into(ivIcon);
    }
}
