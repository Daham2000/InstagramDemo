package com.example.instagramdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instagramdemo.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryListAdaptor extends RecyclerView.Adapter<StoryListAdaptor.ViewHolder> {

    //    variables
    private ArrayList<String> imageUrlList;
    private ArrayList<String> nameList;
    private Context context;

    public StoryListAdaptor(ArrayList<String> imageUrlList, ArrayList<String> nameList, Context context) {
        this.imageUrlList = imageUrlList;
        this.nameList = nameList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.center_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(imageUrlList.get(position)).into(holder.image);
        holder.text.setText(nameList.get(position));
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, nameList.get(position), Toast.LENGTH_SHORT);
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageUrlList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img);
            text = itemView.findViewById(R.id.textId);
        }
    }
}
