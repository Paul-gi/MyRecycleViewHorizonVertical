package com.example.myrecycleviewhorizonvertical.Role.FlexLayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecycleviewhorizonvertical.R;
import com.example.myrecycleviewhorizonvertical.Role.Paul;
import com.example.myrecycleviewhorizonvertical.Role.PersonData;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;

import java.util.ArrayList;

public class RecycleViewFlexManager extends AppCompatActivity {
    RecyclerView mNoGridRecycleView;
    FlexBoxAdapter mNoGridAdapter;
    ArrayList<PersonData> mPersonArrayList = new ArrayList<>();
    LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);

    FlexboxLayoutManager mFlexboxLayoutManager = new FlexboxLayoutManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flex_box_main);
        initView();
        initData();
    }

    private void initData() {
        AddData();
        mNoGridAdapter = new FlexBoxAdapter(this, mPersonArrayList);


        mFlexboxLayoutManager.setFlexWrap(FlexWrap.WRAP);
//        //Linearlayout 改變方向------------------------------------
        //mLinearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mNoGridRecycleView.setLayoutManager(mFlexboxLayoutManager);
        // mNoGridRecycleView.setLayoutManager(new LinearLayoutManager(this));
//        //----------------------------------------------------------------


        mNoGridRecycleView.setAdapter(mNoGridAdapter);
        mNoGridAdapter.setData(mPersonArrayList);

    }


    private void initView() {
        mNoGridRecycleView = findViewById(R.id.mFlexBoxRecycleView);

    }


    private void AddData() {
        for (int i = 0; i < 500; i++) {
            mPersonArrayList.add(new Paul(i+"", "22", "22"));
        }
        mPersonArrayList.add(0, new Paul("Title", "35", "Section 1"));
        mPersonArrayList.add(8, new Paul("Title", "35", "Section 2"));
        mPersonArrayList.add(11, new Paul("Title", "35", "Section 3"));
    }


}
