package com.example.myrecycleviewhorizonvertical.Role.HardNoGrid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecycleviewhorizonvertical.R;
import com.example.myrecycleviewhorizonvertical.Role.Paul;
import com.example.myrecycleviewhorizonvertical.Role.PersonData;

import java.util.ArrayList;

public class NoGridMain extends AppCompatActivity {
    RecyclerView mNoGridRecycleView;
    NoGridAdapter mNoGridAdapter;
    ArrayList<PersonData> mPersonArrayList = new ArrayList<>();
    LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);
    TextView mTitleView, mNoGridTextView;

    static boolean mAddOneOrTwo = true; // true 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_grid_main);
        if( mAddOneOrTwo) {
            AddData2();
        } else {
            AddData();
        }
        initView();
        initData();
    }

    private void initData() {
        mNoGridAdapter = new NoGridAdapter(this, mPersonArrayList);


        //Linearlayout 改變方向------------------------------------
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mNoGridRecycleView.setLayoutManager(mLinearLayoutManager);
        //----------------------------------------------------------------


        mNoGridRecycleView.setAdapter(mNoGridAdapter);
        mNoGridAdapter.setData(mPersonArrayList);

//        if(mNoGridTextView.getText().equals("") || mTitleView.getText().equals("")){
//        }

    }


    @SuppressLint("WrongViewCast")
    private void initView() {
        mNoGridRecycleView = findViewById(R.id.mNoGridRecycleView);

    }

    private void AddData2() {
        for (int i = 1; i <= 100; i++) {
            if( i == 1) {
                mPersonArrayList.add(new Paul(i + "", "1", "Section"));
            } else if( i == 8) {
                mPersonArrayList.add(new Paul(i + "", "2", "Section"));
            } else if( i == 11) {
                mPersonArrayList.add(new Paul(i + "", "3", "Section"));
            } else if( i == 50) {
                mPersonArrayList.add(new Paul(i + "", "4", "Section"));
            } else {
                mPersonArrayList.add(new Paul(i + "", "Empty", "Empty"));
            }
        }
    }


    private void AddData() {
        for (int i = 0; i < 50; i++) {
            mPersonArrayList.add(new Paul(i + "", "22", "22"));
        }
        mPersonArrayList.add(0, new Paul("Title", "35", "Section 1"));
        mPersonArrayList.add(8, new Paul("Title", "35", "Section 2"));
        mPersonArrayList.add(11, new Paul("Title", "35", "Section 3"));
    }
}
