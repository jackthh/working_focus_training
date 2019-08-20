package com.example.working_focus.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.working_focus.R;

import java.util.ArrayList;

public class SoundListAdapter extends RecyclerView.Adapter<SoundListAdapter.SoundListViewHolder> {
    private Context mContext;
    private ArrayList<SoundListItem> mItems;

    public SoundListAdapter(Context context, ArrayList<SoundListItem> items) {
        mContext = context;
        mItems = items;
    }

    @NonNull
    @Override
    public SoundListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SoundListViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_sound_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SoundListViewHolder holder, int position) {
        holder.itemTitle.setText(mItems.get(position).getTittle());
        holder.itemImage.setImageResource(mItems.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class SoundListViewHolder extends RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView itemTitle;
        public SoundListViewHolder(View view) {
            super(view);
            itemImage = view.findViewById(R.id.item_sound_image);
            itemTitle = view.findViewById(R.id.item_sound_title);
        }
    }
}
