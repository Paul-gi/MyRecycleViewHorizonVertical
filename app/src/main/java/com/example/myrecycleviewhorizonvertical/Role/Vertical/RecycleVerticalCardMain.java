package com.example.myrecycleviewhorizonvertical.Role.Vertical;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecycleviewhorizonvertical.R;
import com.example.myrecycleviewhorizonvertical.Role.Paul;
import com.example.myrecycleviewhorizonvertical.Role.PersonData;

import java.util.ArrayList;

public class RecycleVerticalCardMain extends AppCompatActivity {
    RecyclerView mRecycleView;
    Button mAdd;
    VerticalCardAdapter mVerticalCardAdapter;
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
        GridLayoutManager iGridLayoutManager = new GridLayoutManager(this, 4);
        mVerticalCardAdapter = new VerticalCardAdapter(this, mCardArrayList, iGridLayoutManager);


        //todo 一般的grid佈局
//        //設定grid佈局-----------------------------------------------------------------------------
//        GridLayoutManager iGridLayoutManager = new GridLayoutManager(this, 4);
//        mRecycleView.setLayoutManager(iGridLayoutManager);
//        // ---------------------------------------------------------------------------------------



        mRecycleView.setLayoutManager(iGridLayoutManager);
        mRecycleView.setAdapter(mVerticalCardAdapter);
        mVerticalCardAdapter.setData(mCardArrayList);
    }


    private void initView() {
        mRecycleView = findViewById(R.id.mRecycleView);
        mAdd = findViewById(R.id.mAddButton);
        mAdd.setOnClickListener(v -> {
        });

    }


    private void AddData() {
        for (int i=0; i < 9; i++){
            mCardArrayList.add(new Paul("weg", "124", "rggrg"));
        }
        mCardArrayList.add(0, new Paul("Title", "35", "Section 1"));
        mCardArrayList.add(8, new Paul("Title", "35", "Section 2"));
    }
}
