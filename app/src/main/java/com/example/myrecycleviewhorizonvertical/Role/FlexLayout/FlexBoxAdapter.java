package com.example.myrecycleviewhorizonvertical.Role.FlexLayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecycleviewhorizonvertical.R;
import com.example.myrecycleviewhorizonvertical.Role.PersonData;

import java.util.ArrayList;

public class FlexBoxAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<PersonData> mPersonDataArraylist = new ArrayList<>();
    private Context mContext;
    private final int TypeTile = 1;

    public FlexBoxAdapter(Context pContext, ArrayList<PersonData> pPersonData) {
        this.mContext = pContext;
        setData(pPersonData);
    }

    public void setData(ArrayList<PersonData> pPersonDataArrayList) {
        mPersonDataArraylist.clear();
        mPersonDataArraylist.addAll(pPersonDataArrayList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        if (viewType == TypeTile) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.section_layout, parent, false);
            return new ViewHolderTitle(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flex_box_item, parent, false);
            return new ViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


        if (holder instanceof ViewHolder) {
            ViewHolder iHolder = (ViewHolder) holder;
            iHolder.mTextview.setText(mPersonDataArraylist.get(position).mName);
//            iHolder.mButton.setWidth(dp);
        } else {
            if (holder instanceof ViewHolderTitle) {
                ViewHolderTitle iHolder = (ViewHolderTitle) holder;
                iHolder.mTitle.setText(mPersonDataArraylist.get(position).getCompany());
            }
        }
    }

//    @Override
//    public void onBindViewHolder(@NonNull NoGridAdapter.ViewHolder holder, int position) {
//        holder.mButton.setText(mPersonDataArraylist.get(position).mName);
//    }


    @Override
    public int getItemCount() {
        return mPersonDataArraylist.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextview = itemView.findViewById(R.id.mTextView);
//            mLinerLayout = itemView.findViewById(R.id.mLinerLayout);
        }

    }

    class ViewHolderTitle extends RecyclerView.ViewHolder {
        TextView mTitle;

        public ViewHolderTitle(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.mTitle);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mPersonDataArraylist.get(position).mName.equals("Title")) {
            return TypeTile;
        } else {
            return 0;
        }
    }


}
