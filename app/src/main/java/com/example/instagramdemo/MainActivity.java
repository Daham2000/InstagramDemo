package com.example.instagramdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

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

    private ArrayList<String> mImageUrls;
    private ArrayList<String> mImageUrlPosts;
    private ArrayList<String> mNames;
    private ArrayList<String> mAddress;
    private ArrayList<Integer> mLikeCount;
    private ArrayList<String> postDesList;

    public MainActivity(ArrayList<String> mImageUrls, ArrayList<String> mImageUrlPosts,
                        ArrayList<String> mNames, ArrayList<String> mAddress, ArrayList<Integer>
                                mLikeCount, ArrayList<String> postDesList) {
        this.mImageUrls = mImageUrls;
        this.mImageUrlPosts = mImageUrlPosts;
        this.mNames = mNames;
        this.mAddress = mAddress;
        this.mLikeCount = mLikeCount;
        this.postDesList = postDesList;
    }

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
        postDesList.add("Crello offers 5,000 free photos");
        mLikeCount.add(122);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-tu%E1%BA%A5n-ki%E1%BB%87t-jr-1382731.jpg?alt=media&token=8e791d95-0d5a-4dfa-9ecb-526862874de3");
        mNames.add("Clark");
        mImageUrlPosts.add("https://www.techprevue.com/wp-content/uploads/2019/" +
                "04/best-instagram-captions-selfie-quotes-1024x683.jpg");
        mAddress.add("Oklahoma City 456");
        postDesList.add("use them in one of the design formats");
        mLikeCount.add(3);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-cottonbro-4065187.jpg?alt=media&token=a00c65d6-4308-41ca-b7ca-81459c66ba21");
        mNames.add("Portugal");
        mImageUrlPosts.add("https://i.pinimg.com/originals/9e/0e/12/9e0e1240a8a740cb75929e78f03ae30a.jpg");
        mAddress.add("Oklahoma City");
        postDesList.add("To spread awareness of your brand");
        mLikeCount.add(11);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-cottonbro-4068300.jpg?alt=media&token=9ea67aff-47a5-4b02-90a9-f2baeedad3dc");
        mNames.add("Rockey");
        mImageUrlPosts.add("https://image.freepik.com/free-photo/two-women-tourists-talking-whil" +
                "e-going-sightseeing-odessa-happy-friends-travelers-pointing-up_106029-100.jpg");
        mAddress.add("Oklahoma City");
        postDesList.add("Oklahoma City");
        mLikeCount.add(988);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-pixabay-415829.jpg?alt=media&token=4a99ce18-37c3-48e5-a542-22eca83b552d");
        mNames.add("Mikey");
        mImageUrlPosts.add("https://i2.wp.com/devlibrary.in/wp-content/uploads/2018/07/shutterstock_147059792.jpg");
        mAddress.add("Oklahoma City");
        postDesList.add("Oklahoma City");
        mLikeCount.add(598);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-tu%E1%BA%A5n-ki%E1%BB%87t-jr-1382731.jpg?alt=media&token=8e791d95-0d5a-4dfa-9ecb-526862874de3");
        mNames.add("Frank");
        mImageUrlPosts.add("https://media.istockphoto.com/photos/tourists-talking-on-street-picture-id689570016");
        mAddress.add("Oklahoma City");
        postDesList.add("Oklahoma City");
        mLikeCount.add(222);

        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("Ross");
        mImageUrlPosts.add("https://cdnpt01.viewbug.com/media/mediafiles/2018/03/01/77731431_large.jpg");
        mAddress.add("Oklahoma City");
        postDesList.add("Oklahoma City");
        mLikeCount.add(98);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-winston-lim-8365068.jpg?alt=media&token=d06b2765-4eac-44a4-a023-90860ed2de1f");
        mNames.add("Mouse");
        mImageUrlPosts.add("https://images.unsplash.com/photo-1484515991647-c5760fcecfc7?ixid=MnwxM" +
                "jA3fDB8MHxzZWFyY2h8MTZ8fG1lbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
        mAddress.add("Oklahoma City");
        postDesList.add("Oklahoma City");
        mLikeCount.add(13);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-chloe-1043471.jpg?alt=media&token=3758540d-8cff-4843-a282-dee48e8bb2b2");
        mNames.add("Munchkin");
        mImageUrlPosts.add("https://i.pinimg.com/736x/ab/70/e0/ab70e0917cec4fe2a5c64a8398fc6e62.jpg");
        mAddress.add("Oklahoma City");
        postDesList.add("Oklahoma City");
        mLikeCount.add(765);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-andrea-piacquadio-943084.jpg?alt=media&token=3e8f2b20-33d0-4571-b9d2-75c16705335f");
        mNames.add("Emmy");
        mImageUrlPosts.add("https://weraveyou.com/wp-content/uploads/2021/02/awwryarticle.jpg");
        mAddress.add("Oklahoma City");
        postDesList.add("Oklahoma City");
        mLikeCount.add(435);

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/library-demo-2b0f7.appspot.com/o/pexels-bruno-salvadori-2269872.jpg?alt=media&token=a364618b-358b-431c-a7d0-c4c4b26a00c9");
        mNames.add("Robert");
        mImageUrlPosts.add("https://images.summitmedia-digital.com/cosmo/images/2020/04/15/best-" +
                "selfie-poses-14-andrea-brillantes-1586944317.jpg");
        mAddress.add("Oklahoma City");
        postDesList.add("Oklahoma City");
        mLikeCount.add(32);

        initRecyclerView();
    }

    private void initRecyclerView() {

        LinearLayoutManager layoutManager = new LinearLayoutManager
                (this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView view = findViewById(R.id.recyclerViewId);
        view.setLayoutManager(layoutManager);
        StoryListAdaptor storyListAdaptor = new StoryListAdaptor(mImageUrls, mNames, this);
        view.setNestedScrollingEnabled(false);
        view.setAdapter(storyListAdaptor);

        LinearLayoutManager layoutManagerPostUi = new LinearLayoutManager
                (this, LinearLayoutManager.VERTICAL, false);
        RecyclerView viewNext = findViewById(R.id.recyclerViewScrollId);
        viewNext.setLayoutManager(layoutManagerPostUi);
        viewNext.setNestedScrollingEnabled(false);
        PostUiAdapter postUiAdapter = new PostUiAdapter(mImageUrls, mImageUrlPosts, mNames, mAddress, this, mLikeCount, this.postDesList);
        viewNext.setAdapter(postUiAdapter);
    }

}