package com.example.hotstarapp.adapters;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hotstarapp.R;
import com.example.hotstarapp.activity.Item;

import java.util.ArrayList;

/**
 * Created by rahuljanagouda on 04/11/17.
 */

public class VerticalListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int BANNER_VIEW_TYPE = 100;
    private static final int ROW_VIEW_TYPE = 200;
    ArrayList<Item> items = new ArrayList<>();
    Activity activity;

    public VerticalListAdapter(Activity activity, ArrayList<Item> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_list, parent, false);
        return new HorizontalListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };

        HorizontalListViewHolder horizontalListViewHolder = (HorizontalListViewHolder) holder;
        horizontalListViewHolder.horizontalList.setLayoutManager(layoutManager);

        if (horizontalListViewHolder.horizontalList.getOnFlingListener() == null) {
            SnapHelper snapHelper = new LinearSnapHelper();
            snapHelper.attachToRecyclerView(horizontalListViewHolder.horizontalList);
        }
        horizontalListViewHolder.horizontalList.setHasFixedSize(true);
        horizontalListViewHolder.horizontalList.setNestedScrollingEnabled(false);
        horizontalListViewHolder.horizontalList.setAdapter(new HorizontalListAdapter(activity, items.get(position).getTitles()));
        horizontalListViewHolder.horizontalListTitle.setText(items.get(position).getCategory_name());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position==0?BANNER_VIEW_TYPE:ROW_VIEW_TYPE;
    }

    class HorizontalListViewHolder extends RecyclerView.ViewHolder {
        RecyclerView horizontalList;
        TextView horizontalListTitle;
        public HorizontalListViewHolder(View itemView) {
            super(itemView);
            horizontalList = itemView.findViewById(R.id.horizontalList);
            horizontalListTitle = itemView.findViewById(R.id.horizontalListTitle);
        }
    }

}
