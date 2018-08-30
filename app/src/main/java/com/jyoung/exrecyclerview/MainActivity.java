package com.jyoung.exrecyclerview;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jyoung.exrecyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);
    }

    public void redirectLinear() {
        Intent linear = new Intent(this, LinearActivity.class);
        startActivity(linear);
    }

    public void redirectGrid() {
        Intent grid = new Intent(this, GridActivity.class);
        startActivity(grid);
    }
}
