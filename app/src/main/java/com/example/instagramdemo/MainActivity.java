package com.example.instagramdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.instagramdemo.adapter.PostUiAdapter;
import com.example.instagramdemo.adapter.StoryListAdaptor;
import com.example.instagramdemo.page_activity.FavouriteActivity;
import com.example.instagramdemo.page_activity.ProfileActivity;
import com.example.instagramdemo.page_activity.SearchActivity;
import com.example.instagramdemo.page_activity.ShareActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageUrlPosts = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mAddress = new ArrayList<>();
    private ArrayList<Integer> mLikeCount = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate...");
        getImages();

        //variable setup
        BottomNavigationView navigationView = findViewById(R.id.bottomNavigationBar);

        //set home page selected
        navigationView.setSelectedItemId(R.id.layoutMainOne);

        navigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bottom_nav_search:
                    startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                    overridePendingTransition(0, 0);
                    return true;

                case R.id.bottom_nav_plus:
                    startActivity(new Intent(getApplicationContext(), ShareActivity.class));
                    overridePendingTransition(0, 0);
                    return true;

                case R.id.bottom_nav_favourite:
                    startActivity(new Intent(getApplicationContext(), FavouriteActivity.class));
                    overridePendingTransition(0, 0);
                    return true;

                case R.id.bottom_nav_profile:
                    startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                    overridePendingTransition(0, 0);
                    return true;

                case R.id.bottom_nav_home:
                    return true;
            }
            return false;
        });
    }

    private void getImages() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot." +
                "com/o/pexels-martin-p%C3%A9chy-2078265.jpg?alt=media&token=66234e6b-671f-42ef-" +
                "96c1-64858442e9cc");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mNames.add("John");
        mAddress.add("Oklahoma City");
        mLikeCount.add(122);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-tu%E1%BA%A5n-ki%E1%BB%87t-jr-1382731.jpg?alt=media&token=8e791d95-0d5a-4dfa-9ecb-526862874de3");
        mNames.add("Clark");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City 456");
        mLikeCount.add(3);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-cottonbro-4065187.jpg?alt=media&token=a00c65d6-4308-41ca-b7ca-81459c66ba21");
        mNames.add("Portugal");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        mLikeCount.add(11);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-cottonbro-4068300.jpg?alt=media&token=9ea67aff-47a5-4b02-90a9-f2baeedad3dc");
        mNames.add("Rockey");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        mLikeCount.add(988);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-pixabay-415829.jpg?alt=media&token=4a99ce18-37c3-48e5-a542-22eca83b552d");
        mNames.add("Mikey");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        mLikeCount.add(598);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-tu%E1%BA%A5n-ki%E1%BB%87t-jr-1382731.jpg?alt=media&token=8e791d95-0d5a-4dfa-9ecb-526862874de3");
        mNames.add("Frank");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        mLikeCount.add(222);

        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("Ross");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        mLikeCount.add(98);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-winston-lim-8365068.jpg?alt=media&token=d06b2765-4eac-44a4-a023-90860ed2de1f");
        mNames.add("Mouse");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        mLikeCount.add(13);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-chloe-1043471.jpg?alt=media&token=3758540d-8cff-4843-a282-dee48e8bb2b2");
        mNames.add("Munchkin");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        mLikeCount.add(765);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-andrea-piacquadio-943084.jpg?alt=media&token=3e8f2b20-33d0-4571-b9d2-75c16705335f");
        mNames.add("Emmy");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        mLikeCount.add(435);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-bruno-salvadori-2269872.jpg?alt=media&token=a364618b-358b-431c-a7d0-c4c4b26a00c9");
        mNames.add("Robert");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        mLikeCount.add(32);

        initRecyclerView();
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager
                (this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView view = findViewById(R.id.recyclerViewId);
        view.setLayoutManager(layoutManager);
        StoryListAdaptor storyListAdaptor = new StoryListAdaptor(mImageUrls, mNames, this);
        view.setAdapter(storyListAdaptor);

        LinearLayoutManager layoutManagerPostUi = new LinearLayoutManager
                (this, LinearLayoutManager.VERTICAL, false);
        RecyclerView viewNext = findViewById(R.id.recyclerViewScrollId);
        viewNext.setLayoutManager(layoutManagerPostUi);
        PostUiAdapter postUiAdapter = new PostUiAdapter(mImageUrls, mImageUrlPosts, mNames, mAddress, this,mLikeCount);
        viewNext.setAdapter(postUiAdapter);

    }

}