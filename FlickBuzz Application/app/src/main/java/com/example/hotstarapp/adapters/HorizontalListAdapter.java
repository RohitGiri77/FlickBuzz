package com.example.hotstarapp.adapters;

import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hotstarapp.R;
import com.example.hotstarapp.activity.Title;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by rahuljanagouda on 04/11/17.
 */

public class HorizontalListAdapter extends RecyclerView.Adapter<HorizontalListAdapter.HorizontalViewHolder> {

    ArrayList<Title> titles = new ArrayList<>();
    Activity activity;

    public HorizontalListAdapter(Activity activity, ArrayList<Title> titles) {
        this.activity = activity;
        this.titles = titles;
    }

    @Override
    public HorizontalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_list_item, parent, false);
        return new HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HorizontalViewHolder holder, int position) {
     //   holder.cardImage.setImageResource(R.drawable.placeholder);
        holder.cardTitle.setText(titles.get(position).getTitle());
        String filteredCharacters;
        filteredCharacters = titles.get(position).getTitle();

        if (filteredCharacters.length() > 35) {
            Log.w("> 22", "< 35");
            holder.cardTitle.setText(filteredCharacters.substring(0, 34) + "...");
        }
        else {
            Log.w("< 22", "nolimit");
            holder.cardTitle.setText(filteredCharacters);
        }

        Log.e("Thumb nail ","-->> "+titles.get(position).getThumbnail_image());
        Picasso.get().load(titles.get(position).getThumbnail_image()).into(holder.cardImage);
        Picasso.get().setLoggingEnabled(true);
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    class HorizontalViewHolder extends RecyclerView.ViewHolder {
        ImageView cardImage;
        TextView cardTitle;

        public HorizontalViewHolder(View itemView) {
            super(itemView);
            cardImage = itemView.findViewById(R.id.image);
            cardTitle = itemView.findViewById(R.id.text);
        }
    }
}
