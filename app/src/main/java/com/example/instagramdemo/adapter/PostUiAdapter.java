package com.example.instagramdemo.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
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

public class PostUiAdapter extends RecyclerView.Adapter<PostUiAdapter.ViewHolder> {

    //    variables
    private ArrayList<String> imageUrlList;
    private ArrayList<String> postImageUrlList;
    private ArrayList<String> nameList;
    private ArrayList<String> addressList;
    private Context context;
    private ArrayList<Integer> mLikeCount;

    public PostUiAdapter(ArrayList<String> imageUrlList, ArrayList<String> postImageUrlList,
                         ArrayList<String> nameList, ArrayList<String> addressList, Context context,ArrayList<Integer> likeList) {
        this.imageUrlList = imageUrlList;
        this.nameList = nameList;
        this.postImageUrlList = postImageUrlList;
        this.addressList = addressList;
        this.context = context;
        this.mLikeCount = likeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_ui_layout, parent, false);
        return new PostUiAdapter.ViewHolder(view);
    }

    private static final String TAG = "Post Adapter";
    boolean isLiked = false;

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(imageUrlList.get(position)).into(holder.image);
        Glide.with(context).asBitmap().load(postImageUrlList.get(position)).into(holder.postImage);
        holder.name.setText(nameList.get(position));
        holder.address.setText(addressList.get(position));
        holder.likeCount.setText(mLikeCount.get(position)+" likes");
        holder.likeBtn.setClickable(true);
        holder.likeBtn.setOnClickListener(
                v -> {
                    holder.likeBtn.setBackgroundColor(isLiked == false ? Color.RED : Color.TRANSPARENT);
                    holder.likeBtn.setColorFilter(isLiked == false ? Color.RED : Color.BLACK);
                    isLiked=!isLiked;
                });
        holder.image.setOnClickListener(v -> Toast.makeText(context, nameList.get(position), Toast.LENGTH_SHORT));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView name;
        TextView address;
        ImageView postImage;
        ImageView likeBtn;
        TextView likeCount;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imgPostID);
            name = itemView.findViewById(R.id.postName);
            address = itemView.findViewById(R.id.postAddress);
            postImage = itemView.findViewById(R.id.imageView7);
            likeBtn = itemView.findViewById(R.id.bottomIconOneID);
            likeCount = itemView.findViewById(R.id.likeID);
        }
    }
}
