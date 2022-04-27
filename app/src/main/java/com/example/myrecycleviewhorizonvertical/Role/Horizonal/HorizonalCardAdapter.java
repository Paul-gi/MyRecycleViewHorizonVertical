//package com.example.myrecycleviewhorizonvertical.Role.Horizonal;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.myrecycleviewhorizonvertical.R;
//import com.example.myrecycleviewhorizonvertical.Role.PersonData;
//
//import java.util.ArrayList;
//
//public class HorizonalCardAdapter extends RecyclerView.Adapter<HorizonalCardAdapter.ViewHolder> {
//    private Context mContext;
//    private ArrayList<PersonData> mCardArrayList = new ArrayList<>();
//
//    public HorizonalCardAdapter(Context pContext, ArrayList<PersonData> pCardArrayList) {
//        this.mContext = pContext;
//        setData(pCardArrayList);
//    }
//
//    public void setData(ArrayList<PersonData> pCardArrayList) {
//        //mCardArrayList.clear();
//        mCardArrayList.addAll(pCardArrayList);
//        notifyDataSetChanged();
//    }
//
//    @NonNull
//    @Override
//    public HorizonalCardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
//        return new HorizonalCardAdapter.ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull HorizonalCardAdapter.ViewHolder holder, int position) {
//        holder.mName.setText(mCardArrayList.get(position).getName());
//        holder.mAge.setText(mCardArrayList.get(position).getAge());
//        holder.mCompany.setText(mCardArrayList.get(position).getCompany());
//
//    }
//
//
//    @Override
//    public int getItemCount() {
//        return mCardArrayList.size();
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder {
//        TextView mName, mAge, mCompany;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            mCompany = itemView.findViewById(R.id.mCompany);
//            mAge = itemView.findViewById(R.id.mAge);
//            mName = itemView.findViewById(R.id.mName);
//        }
//    }
//}
