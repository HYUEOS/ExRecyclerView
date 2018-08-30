package com.jyoung.exrecyclerview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.jyoung.exrecyclerview.adapter.LinearAdapter;
import com.jyoung.exrecyclerview.databinding.ActivityLinearBinding;
import com.jyoung.exrecyclerview.model.DummyData;

public class LinearActivity extends AppCompatActivity {
    private ActivityLinearBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_linear);

        /**
         * LayoutManager 를 설정하지 않으면 다른 걸 다 잘 해도 RecyclerView 가 제대로 뜨지 않습니다!!
         * 꼭 잘 설정하시고 혹시나 다 잘 한 것 같은데 안 뜬다면 로그캣을 보세용.
         * 로그캣에 빨간 줄로 skipping layout 어쩌구 layoutmanager (혹은 adapter) 가 설정되어있지 않다 고 영어로 다 보여줍니당
         * LayoutManager 를 xml 에서 바로 셋팅하는 방법도 있는데 혹시나 궁금하신 분들을 위해 activity_linear.xml 에다 추가해뒀어용
          */
        binding.rvLinear.setLayoutManager(new LinearLayoutManager(this));
        /** 마찬가지로 adapter 도 까먹으면 안 됨 **/
        binding.rvLinear.setAdapter(new LinearAdapter());

        // set items
        binding.setItems(DummyData.items);
    }
}
