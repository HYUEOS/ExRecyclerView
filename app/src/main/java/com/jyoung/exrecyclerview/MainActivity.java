package com.jyoung.exrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLinear, btnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** initialize views **/
        btnLinear = findViewById(R.id.btn_linear);
        btnGrid = findViewById(R.id.btn_grid);

        btnLinear.setOnClickListener(this);
        btnGrid.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn_linear:
                Intent linear = new Intent(this, LinearActivity.class);
                startActivity(linear);
                break;
            case R.id.btn_grid:
                break;
        }
    }
}
