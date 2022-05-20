package com.example.layouts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BottomSheetAdapter extends RecyclerView.Adapter<BottomSheetAdapter.BottomSheetViewHolder> {

    @Override
    public BottomSheetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_view_item,parent,false);
        return new BottomSheetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BottomSheetViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 25;
    }

    public class BottomSheetViewHolder extends RecyclerView.ViewHolder {
        public BottomSheetViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
