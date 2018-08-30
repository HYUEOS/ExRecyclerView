package com.jyoung.exrecyclerview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jyoung.exrecyclerview.adapter.GridAdapter;
import com.jyoung.exrecyclerview.databinding.ActivityGridBinding;
import com.jyoung.exrecyclerview.model.DummyData;

public class GridActivity extends AppCompatActivity {
    private ActivityGridBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_grid);

        /**
         * LayoutManager 를 설정하지 않으면 다른 걸 다 잘 해도 RecyclerView 가 제대로 뜨지 않습니다!!
         * 꼭 잘 설정하시고 혹시나 다 잘 한 것 같은데 안 뜬다면 로그캣을 보세용.
         * 로그캣에 빨간 줄로 No layoutmanager attached; skipping layout (혹은 No adapter ~~) 라고 뜹니당
         * LayoutManager 를 xml 에서 바로 셋팅하는 방법도 있는데 혹시나 궁금하신 분들을 위해 activity_linear.xml 에다 추가해뒀어용
         */
        final GridLayoutManager manager = new GridLayoutManager(this, 2);
        binding.rvGrid.setLayoutManager(manager);
        /** 마찬가지로 adapter 도 까먹으면 안 됨 **/
        final GridAdapter adapter = new GridAdapter();
        binding.rvGrid.setAdapter(adapter);

        // set header for grid layout manager
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return adapter.isHeader(position) ? manager.getSpanCount() : 1;
            }
        });

        // set items
        binding.setItems(DummyData.items);
    }
}
