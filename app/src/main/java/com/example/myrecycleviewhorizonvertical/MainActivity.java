package com.example.myrecycleviewhorizonvertical;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myrecycleviewhorizonvertical.Role.FlexLayout.RecycleViewFlexManager;
import com.example.myrecycleviewhorizonvertical.Role.HardNoGrid.NoGridMain;
import com.example.myrecycleviewhorizonvertical.Role.Horizonal.RecycleHorizontalCardMain;
import com.example.myrecycleviewhorizonvertical.Role.ManyGrid.ManyGridCard;
import com.example.myrecycleviewhorizonvertical.Role.Vertical.RecycleVerticalCardMain;

public class MainActivity extends AppCompatActivity {
    //    ActivityMainBinding mActivityMainBinding;
    Button mVertical, mHorizontal, mManyGrid, mFlexBoxRecycleView, mHardNoGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mHorizontal = findViewById(R.id.mHorizontal);
        mVertical = findViewById(R.id.mVertical);
        mManyGrid = findViewById(R.id.mManyGrid);
        mFlexBoxRecycleView = findViewById(R.id.mFlexBoxRecycleView);
        mHardNoGrid = findViewById(R.id.mNoGrid);

        mHorizontal.setOnClickListener(v -> {
            Intent pIntent = new Intent(MainActivity.this, RecycleHorizontalCardMain.class);
            startActivity(pIntent);
        });


        mVertical.setOnClickListener(v -> {
            Intent pIntent = new Intent(MainActivity.this, RecycleVerticalCardMain.class);
            startActivity(pIntent);
        });

        mManyGrid.setOnClickListener(v -> {
            Intent pIntent = new Intent(MainActivity.this, ManyGridCard.class);
            startActivity(pIntent);
        });

        mFlexBoxRecycleView.setOnClickListener(v -> {
            Intent pIntent = new Intent(MainActivity.this, RecycleViewFlexManager.class);
            startActivity(pIntent);
        });


        mHardNoGrid.setOnClickListener(v -> {
            Intent pIntent = new Intent(MainActivity.this, NoGridMain.class);
            startActivity(pIntent);
        });
    }
}