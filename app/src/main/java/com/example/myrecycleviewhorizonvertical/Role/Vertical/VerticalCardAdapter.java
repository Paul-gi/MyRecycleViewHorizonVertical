package com.example.myrecycleviewhorizonvertical.Role.Vertical;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecycleviewhorizonvertical.R;
import com.example.myrecycleviewhorizonvertical.Role.PersonData;

import java.util.ArrayList;

public class VerticalCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final ArrayList<PersonData> mCardArrayList = new ArrayList<>();
    private final int TypeTile = 1;


    public VerticalCardAdapter(Context pContext, ArrayList<PersonData> pCardArrayList, GridLayoutManager pGridLayoutManager) {
        setData(pCardArrayList);

        if( pGridLayoutManager != null) {
            pGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    if (mCardArrayList.get(position).mName.equals("Title")) {
                        return 4;
                    } else {
                        return 1;
                    }
                }
            });
        }
    }

    public void setData(ArrayList<PersonData> pCardArrayList) {
        mCardArrayList.clear();
        mCardArrayList.addAll(pCardArrayList);
        notifyDataSetChanged();
    }


    @Override
    public int getItemViewType(int position) {
        if( mCardArrayList.get(position).mName.equals("Title")) {
            return TypeTile;
        } else {
            return 0;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if( viewType == TypeTile) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.section_layout, parent, false);
            return new ViewHolderTitle(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
            return new ViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if( holder instanceof ViewHolder) {
            ViewHolder iHolder = (ViewHolder) holder;

            iHolder.mName.setText(mCardArrayList.get(position).getName());
            iHolder.mAge.setText(mCardArrayList.get(position).getAge());
            iHolder.mCompany.setText(mCardArrayList.get(position).getCompany());
        } else {
            if( holder instanceof  ViewHolderTitle) {
                ViewHolderTitle iHolder = (ViewHolderTitle) holder;
                iHolder.mTitle.setText(mCardArrayList.get(position).getCompany());
            }
        }

    }


    @Override
    public int getItemCount() {
        return mCardArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mName, mAge, mCompany;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mCompany = itemView.findViewById(R.id.mCompany);
            mAge = itemView.findViewById(R.id.mAge);
            mName = itemView.findViewById(R.id.mName);
        }
    }

    class ViewHolderTitle extends RecyclerView.ViewHolder {
        TextView mTitle;

        public ViewHolderTitle(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.mTitle);
        }
    }
}
