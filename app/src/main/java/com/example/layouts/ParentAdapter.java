package com.example.layouts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ParentViewHolder> {

    private final List<ParentItem> itemList;

    ParentAdapter(List<ParentItem> itemList)
    {
        this.itemList = itemList;
    }
    private final RecyclerView.RecycledViewPool
            viewPool
            = new RecyclerView
            .RecycledViewPool();

    @Override
    public ParentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.parent_item,parent,false);
        return new ParentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentViewHolder holder, int position) {
        ParentItem parentItem
                = itemList.get(position);

        // For the created instance,
        // get the title and set it
        // as the text for the TextView
        holder.parentItemTitle.setText(parentItem.getParentItemTitle());

        // Create a layout manager
        // to assign a layout
        // to the RecyclerView.

        // Here we have assigned the layout
        // as LinearLayout with vertical orientatio
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(
                holder.recyclerView.getContext(),
                LinearLayoutManager.HORIZONTAL,
                false);

        // Since this is a nested layout, so
        // to define how many child items
        // should be prefetched when the
        // child RecyclerView is nested
        // inside the parent RecyclerView,
        // we use the following method
        layoutManager
                .setInitialPrefetchItemCount(
                        parentItem
                                .getChildItemList()
                                .size());

        // Create an instance of the child
        // item view adapter and set its
        // adapter, layout manager and RecyclerViewPool
        ChildAdapter childItemAdapter
                = new ChildAdapter(
                parentItem
                        .getChildItemList());
        holder.recyclerView
                .setLayoutManager(layoutManager);
        holder.recyclerView
                .setAdapter(childItemAdapter);
        holder.recyclerView
                .setRecycledViewPool(viewPool);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ParentViewHolder extends RecyclerView.ViewHolder {
        public ParentViewHolder(View itemView) {
            super(itemView);
        }
        TextView parentItemTitle = itemView.findViewById(R.id.parent_item_title);
        RecyclerView recyclerView = itemView.findViewById(R.id.child_recyclerview);
    }

}
