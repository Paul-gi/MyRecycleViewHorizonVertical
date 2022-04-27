package com.example.myrecycleviewhorizonvertical.Role.ManyGrid;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecycleviewhorizonvertical.R;
import com.example.myrecycleviewhorizonvertical.Role.Paul;
import com.example.myrecycleviewhorizonvertical.Role.PersonData;

import java.util.ArrayList;

public class ManyGridCard extends AppCompatActivity {
    RecyclerView mRecycleView;
    Button mAdd;
    ManyGridCardAdapter mManyGridCardAdapter;
    ArrayList<PersonData> mCardArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_vertical_main);
        initView();
        initData();
    }

    private void initData() {
        AddData();

        mManyGridCardAdapter = new ManyGridCardAdapter(this, mCardArrayList);


        GridLayoutManager iGridLayoutManager = new GridLayoutManager(this,6);
        iGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position <= 3) {
                    return 6;
                } else if (position <= 9) {
                    return 3;
                } else if (position <= 15) {
                    return 2;
                } else if (position <= 27) {
                    return 1;
                } else if (position <= 35) {
                    return 3;
                } else if (position <= 39) {
                    return 6;
                } else {
                    return 1;
                }
            }
        });

        mRecycleView.setLayoutManager(iGridLayoutManager);
        mRecycleView.setAdapter(mManyGridCardAdapter);
        mManyGridCardAdapter.setData(mCardArrayList);
    }


    private void initView() {
        mRecycleView = findViewById(R.id.mRecycleView);
        mAdd = findViewById(R.id.mAddButton);
        mAdd.setOnClickListener(v -> {
        });
    }


    private void AddData() {
        mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        mCardArrayList.add(new Paul("gbtr", "24", "wegweg"));
        mCardArrayList.add(new Paul("tbsef", "2534", "wegweg"));
        mCardArrayList.add(new Paul("wee", "35", "ewgewg"));
        mCardArrayList.add(new Paul("rth", "324", "wegwegq"));
        mCardArrayList.add(new Paul("pertpp", "234", "rgergerg"));
        mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        mCardArrayList.add(new Paul("gbtr", "24", "wegweg"));
        mCardArrayList.add(new Paul("tbsef", "2534", "wegweg"));
        mCardArrayList.add(new Paul("wee", "35", "ewgewg"));
        mCardArrayList.add(new Paul("rth", "324", "wegwegq"));
        mCardArrayList.add(new Paul("pertpp", "234", "rgergerg"));
        mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        mCardArrayList.add(new Paul("gbtr", "24", "wegweg"));
        mCardArrayList.add(new Paul("tbsef", "2534", "wegweg"));
        mCardArrayList.add(new Paul("wee", "35", "ewgewg"));
        mCardArrayList.add(new Paul("rth", "324", "wegwegq"));
        mCardArrayList.add(new Paul("pertpp", "234", "rgergerg"));
        mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        mCardArrayList.add(new Paul("gbtr", "24", "wegweg"));
        mCardArrayList.add(new Paul("tbsef", "2534", "wegweg"));
        mCardArrayList.add(new Paul("wee", "35", "ewgewg"));
        mCardArrayList.add(new Paul("rth", "324", "wegwegq"));
        mCardArrayList.add(new Paul("pertpp", "234", "rgergerg"));
        mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        mCardArrayList.add(new Paul("gbtr", "24", "wegweg"));
        mCardArrayList.add(new Paul("tbsef", "2534", "wegweg"));
        mCardArrayList.add(new Paul("wee", "35", "ewgewg"));
        mCardArrayList.add(new Paul("rth", "324", "wegwegq"));
        mCardArrayList.add(new Paul("pertpp", "234", "rgergerg"));
        mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        mCardArrayList.add(new Paul("gbtr", "24", "wegweg"));
        mCardArrayList.add(new Paul("tbsef", "2534", "wegweg"));
        mCardArrayList.add(new Paul("wee", "35", "ewgewg"));
        mCardArrayList.add(new Paul("rth", "324", "wegwegq"));
        mCardArrayList.add(new Paul("pertpp", "234", "rgergerg"));
        mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        mCardArrayList.add(new Paul("gbtr", "24", "wegweg"));
        mCardArrayList.add(new Paul("tbsef", "2534", "wegweg"));
        mCardArrayList.add(new Paul("wee", "35", "ewgewg"));
        mCardArrayList.add(new Paul("rth", "324", "wegwegq"));
        mCardArrayList.add(new Paul("pertpp", "234", "rgergerg"));
        mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        mCardArrayList.add(new Paul("gbtr", "24", "wegweg"));
        mCardArrayList.add(new Paul("tbsef", "2534", "wegweg"));
        mCardArrayList.add(new Paul("wee", "35", "ewgewg"));
        mCardArrayList.add(new Paul("rth", "324", "wegwegq"));
        mCardArrayList.add(new Paul("pertpp", "234", "rgergerg"));
        mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        mCardArrayList.add(new Paul("gbtr", "24", "wegweg"));
        mCardArrayList.add(new Paul("tbsef", "2534", "wegweg"));
        mCardArrayList.add(new Paul("wee", "35", "ewgewg"));
        mCardArrayList.add(new Paul("rth", "324", "wegwegq"));
        mCardArrayList.add(new Paul("pertpp", "234", "rgergerg"));
    }


}
