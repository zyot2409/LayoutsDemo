package com.shyn.zyot.wind.layoutsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLinear;
    private Button btnRelative;
    private Button btnConstraint;
    private Button btnFrame;
    private Button btnTable;
    private Button btnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);
        btnConstraint = findViewById(R.id.btnConstraint);
        btnFrame = findViewById(R.id.btnFrame);
        btnTable = findViewById(R.id.btnTable);
        btnGrid = findViewById(R.id.btnGrid);

        btnLinear.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnConstraint.setOnClickListener(this);
        btnFrame.setOnClickListener(this);
        btnTable.setOnClickListener(this);
        btnGrid.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLinear: {
                Intent intent = new Intent(getBaseContext(), LinearLayoutDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnRelative: {
                Intent intent = new Intent(getBaseContext(), RelativeLayoutDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnConstraint: {
                Intent intent = new Intent(getBaseContext(), ConstraintLayoutDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnFrame: {
                Intent intent = new Intent(getBaseContext(), FrameLayoutDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnTable: {
                Intent intent = new Intent(getBaseContext(),TableLayoutDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnGrid: {
                Intent intent = new Intent(getBaseContext(), GridLayoutDemoActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
