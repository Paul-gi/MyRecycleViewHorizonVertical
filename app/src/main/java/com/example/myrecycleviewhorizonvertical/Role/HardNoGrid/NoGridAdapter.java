package com.example.myrecycleviewhorizonvertical.Role.HardNoGrid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecycleviewhorizonvertical.R;
import com.example.myrecycleviewhorizonvertical.Role.PersonData;

import java.util.ArrayList;

public class NoGridAdapter extends RecyclerView.Adapter<NoGridAdapter.ViewHolder> {
    private ArrayList<PersonData> mPersonDataArraylist = new ArrayList<>();
    private Context mContext;
    private int mCut = 5;
    private int mArrayTotalSize = 0;
    private int mIndexAddress = 0;
    private int mSaveIndex = -1;

    public NoGridAdapter(Context pContext, ArrayList<PersonData> pPersonData) {
        this.mContext = pContext;
        setData(pPersonData);
    }

    public void setData(ArrayList<PersonData> pPersonDataArrayList) {
        mPersonDataArraylist.clear();
        mPersonDataArraylist.addAll(pPersonDataArrayList);
        mArrayTotalSize = mPersonDataArraylist.size();
        if( NoGridMain.mAddOneOrTwo) {
            mCut = 4;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NoGridAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.no_grid_item, parent, false);
        return new NoGridAdapter.ViewHolder(view);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mTitle.setVisibility(View.GONE);
        holder.mName1.setVisibility(View.INVISIBLE);
        holder.mName2.setVisibility(View.INVISIBLE);
        holder.mName3.setVisibility(View.INVISIBLE);
        holder.mName4.setVisibility(View.INVISIBLE);

        if( NoGridMain.mAddOneOrTwo) {
            int iIndex = (mCut * (position+1)) - mCut;
            int iStep = 4;
            Log.v("aaa","aaaaa=" + iIndex +", mSaveIndex="+mSaveIndex);
            if( mSaveIndex != -1) {
                iIndex  = mSaveIndex;
            }
            Log.v("aaa","bbbbb=" + iIndex +", mSaveIndex="+mSaveIndex);
            Log.v("aaa","======================== " + position +", mSaveIndex="+mSaveIndex);
            do {
                if( iIndex == mArrayTotalSize) {
                    break;
                }
                holder.mName1.setTag(iIndex);
                PersonData iPersonData = mPersonDataArraylist.get(iIndex);
                Log.v("aaa","--->" + iPersonData.getCompany());
                if( iPersonData.getCompany().equals("Section")) {
                    if( holder.mName1.getVisibility() == View.VISIBLE) {
                        mSaveIndex = iIndex;
                        break;
                    }
                    holder.mTitle.setVisibility(View.VISIBLE);
                    holder.mTitle.setText(iPersonData.getCompany()+iPersonData.getAge());
                }

                if( holder.mName1.getVisibility() == View.INVISIBLE) {
                    holder.mName1.setVisibility(View.VISIBLE);
                    holder.mName1.setText(iPersonData.getName());
                    holder.mName1.setTag(iIndex);
                } else if( holder.mName2.getVisibility() == View.INVISIBLE) {
                    holder.mName2.setVisibility(View.VISIBLE);
                    holder.mName2.setText(iPersonData.getName());
                    holder.mName2.setTag(iIndex);
                } else if( holder.mName3.getVisibility() == View.INVISIBLE) {
                    holder.mName3.setVisibility(View.VISIBLE);
                    holder.mName3.setText(iPersonData.getName());
                    holder.mName3.setTag(iIndex);
                } else if( holder.mName4.getVisibility() == View.INVISIBLE) {
                    holder.mName4.setVisibility(View.VISIBLE);
                    holder.mName4.setText(iPersonData.getName());
                    holder.mName4.setTag(iIndex);
                }
                iStep--;
                iIndex++;
                if( iStep == 0) {
                    break;
                }
            }while (true);
            if( mSaveIndex != -1) {
                mSaveIndex = iIndex ;
            }


        } else {
            int iTotal = ((position * mCut) + mCut) - 1;
            int iNeedStep = 4;
            Log.v("aaa","iTotal="+iTotal + ", mArrayTotalSize="+mArrayTotalSize);
            boolean iAlreadyInData = false;
            do{
                if( mArrayTotalSize <= mIndexAddress) {
                    break;
                }
                Log.v("aaa","mIndexAddress="+mIndexAddress +", name "+mPersonDataArraylist.get(mIndexAddress).getName());
                if( mPersonDataArraylist.get(mIndexAddress).getName().equals("Title") ){
                    if( iAlreadyInData) {
                        break;
                    }
                    holder.mTitle.setVisibility(View.VISIBLE);
                    holder.mTitle.setText(mPersonDataArraylist.get(mIndexAddress).getCompany());
                } else {
                    iNeedStep--;
                    if( holder.mName1.getVisibility() == View.INVISIBLE) {
                        holder.mName1.setVisibility(View.VISIBLE);
                        holder.mName1.setText(mPersonDataArraylist.get(mIndexAddress).mName);
                    } else if( holder.mName2.getVisibility() == View.INVISIBLE) {
                        holder.mName2.setVisibility(View.VISIBLE);
                        holder.mName2.setText(mPersonDataArraylist.get(mIndexAddress).mName);
                    } else if( holder.mName3.getVisibility() == View.INVISIBLE) {
                        holder.mName3.setVisibility(View.VISIBLE);
                        holder.mName3.setText(mPersonDataArraylist.get(mIndexAddress).mName);
                    } else if( holder.mName4.getVisibility() == View.INVISIBLE) {
                        holder.mName4.setVisibility(View.VISIBLE);
                        holder.mName4.setText(mPersonDataArraylist.get(mIndexAddress).mName);
                    }
                }
                mIndexAddress++;
                if( mIndexAddress > iTotal ) {
                    break;
                }
                if( iNeedStep == 0) {
                    break;
                }
                iAlreadyInData = true;
            }while (true);
        }


    }


    @Override
    public int getItemCount() {
        if( NoGridMain.mAddOneOrTwo) {
            return (mPersonDataArraylist.size() / mCut) + 1;
        } else {
            return (mPersonDataArraylist.size() / mCut) + 4;
        }

    }




    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle;
        TextView mName1, mName2, mName3, mName4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // mNoGridConstra = itemView.findViewById(R.id.mNoGridConstra);
            mTitle = itemView.findViewById(R.id.mTitle);
            mName1 = itemView.findViewById(R.id.mName1);
            mName2 = itemView.findViewById(R.id.mName2);
            mName3 = itemView.findViewById(R.id.mName3);
            mName4 = itemView.findViewById(R.id.mName4);
        }

    }
}
