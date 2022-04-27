package com.example.myrecycleviewhorizonvertical.Role.Horizonal;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecycleviewhorizonvertical.R;
import com.example.myrecycleviewhorizonvertical.Role.Paul;
import com.example.myrecycleviewhorizonvertical.Role.PersonData;
import com.example.myrecycleviewhorizonvertical.Role.Vertical.VerticalCardAdapter;

import java.util.ArrayList;

public class RecycleHorizontalCardMain extends AppCompatActivity {
    RecyclerView mRecycleView;
    Button mAdd;
    VerticalCardAdapter mVerticalCardAdapter;
    ArrayList<PersonData> mCardArrayList = new ArrayList<>();
    LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_vertical_main);
        initView();
        initData();
    }

    private void initData() {
        AddData();

        mVerticalCardAdapter = new VerticalCardAdapter(this, mCardArrayList, null);

        GridLayoutManager iGridLayoutManager = new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false);
        mRecycleView.setLayoutManager(iGridLayoutManager);
//        mRecycleView.setHasFixedSize(true);


        //設定橫向佈局的兩步-------------------------------------------------------------
        mLinearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecycleView.setLayoutManager(mLinearLayoutManager);
        //-----------------------------------------------------------------------------

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
        mCardArrayList.add(new Paul("aaa", "13", "ewfw"));
        mCardArrayList.add(new Paul("vvv", "55", "sinoerwegpac"));
        mCardArrayList.add(new Paul("ccc", "325", "rger"));
        mCardArrayList.add(new Paul("eeee", "55", "erg"));
        mCardArrayList.add(new Paul("aaa", "13", "ewfw"));
        mCardArrayList.add(new Paul("vvv", "55", "sinoerwegpac"));
        mCardArrayList.add(new Paul("ccc", "325", "rger"));
        mCardArrayList.add(new Paul("eeee", "55", "erg"));
        mCardArrayList.add(new Paul("aaa", "13", "ewfw"));
        mCardArrayList.add(new Paul("vvv", "55", "sinoerwegpac"));
        mCardArrayList.add(new Paul("ccc", "325", "rger"));
        mCardArrayList.add(new Paul("eeee", "55", "erg"));
        mCardArrayList.add(new Paul("aaa", "13", "ewfw"));
        mCardArrayList.add(new Paul("vvv", "55", "sinoerwegpac"));
        mCardArrayList.add(new Paul("ccc", "325", "rger"));
        mCardArrayList.add(new Paul("eeee", "55", "erg"));
        mCardArrayList.add(new Paul("aaa", "13", "ewfw"));
        mCardArrayList.add(new Paul("vvv", "55", "sinoerwegpac"));
        mCardArrayList.add(new Paul("ccc", "325", "rger"));
        mCardArrayList.add(new Paul("eeee", "55", "erg"));
        mCardArrayList.add(new Paul("aaa", "13", "ewfw"));
        mCardArrayList.add(new Paul("vvv", "55", "sinoerwegpac"));
        mCardArrayList.add(new Paul("ccc", "325", "rger"));
        mCardArrayList.add(new Paul("eeee", "55", "erg"));


    }
}
