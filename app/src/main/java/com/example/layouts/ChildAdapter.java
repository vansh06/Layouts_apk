package com.example.layouts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ChildAdapterViewHolder> {
    private List<ChildItem> childItemList;

    public ChildAdapter(List<ChildItem> childItemList){
        this.childItemList = childItemList;
    }

    @Override
    public ChildAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler2_view_item,parent,false);
        return new ChildAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ChildAdapterViewHolder extends RecyclerView.ViewHolder {
        public ChildAdapterViewHolder( View itemView) {
            super(itemView);
        }
    }

}
