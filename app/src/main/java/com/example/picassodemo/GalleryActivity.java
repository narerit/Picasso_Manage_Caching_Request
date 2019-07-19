package com.example.picassodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.GridView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
/**
 * Created by Narerit on 7/19/2019.
 */
//TODO 8 : Implement OnScrollListener for listen to user scrolling.
public class GalleryActivity extends AppCompatActivity implements AbsListView.OnScrollListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        //TODO 1 : Create array to store urls.
        ArrayList<String> imageUrls = new ArrayList<>();
        String baseUrl = "https://images.pexels.com/photos/";
        String compressUrl = "?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940";
        //TODO 2 : Add image urls.
        imageUrls.add(baseUrl+"415829/pexels-photo-415829.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"712513/pexels-photo-712513.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"769584/pexels-photo-769584.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"139829/pexels-photo-139829.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1386603/pexels-photo-1386603.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"821413/pexels-photo-821413.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"89779/girl-rustic-grass-meadow-89779.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1917785/pexels-photo-1917785.jpeg"+compressUrl);
        //TODO 3 : Set wrong url to see our error placeholder.
        imageUrls.add(baseUrl+"wrong url here");
        imageUrls.add(baseUrl+"wrong url here");
        imageUrls.add(baseUrl+"wrong url here");
        imageUrls.add(baseUrl+"wrong url here");


        imageUrls.add(baseUrl+"1036623/pexels-photo-1036623.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"733872/pexels-photo-733872.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"905913/pexels-photo-905913.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1124724/pexels-photo-1124724.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1239291/pexels-photo-1239291.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"789812/pexels-photo-789812.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1937394/pexels-photo-1937394.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1536619/pexels-photo-1536619.jpeg"+compressUrl);

        imageUrls.add(baseUrl+"573299/pexels-photo-573299.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1036620/pexels-photo-1036620.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1181690/pexels-photo-1181690.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"458381/pexels-photo-458381.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"884977/pexels-photo-884977.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"227294/pexels-photo-227294.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"372042/pexels-photo-372042.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"713108/pexels-photo-713108.jpeg"+compressUrl);

        imageUrls.add(baseUrl+"247304/pexels-photo-247304.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"962784/pexels-photo-962784.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1070030/pexels-photo-1070030.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"705821/pexels-photo-705821.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1090387/pexels-photo-1090387.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"789822/pexels-photo-789822.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"1102341/pexels-photo-1102341.jpeg"+compressUrl);
        imageUrls.add(baseUrl+"247322/pexels-photo-247322.jpeg"+compressUrl);
        //TODO 4 : Bind our GridView to GridView Layout
        GridView gridGallery = findViewById(R.id.grid_gallery);
        //TODO 5 : Call Gallery Adapter. Passing array and grid item layout as arguments.
        GalleryAdapter galleryAdapter = new GalleryAdapter(this, R.layout.gallery_item_layout, imageUrls);
        //TODO 6 : Binding adapter to grid view. This adapter will use to call image from an array of url.
        gridGallery.setAdapter(galleryAdapter);
        //TODO 7 : Bind scroll listener with grid view. This listener will use to tell picasso when to download images.
        gridGallery.setOnScrollListener(this);
    }
    //TODO 9 : Set Picasso tag to pause download when user scrolling and resume when user stop scrolling.
    @Override
    public void onScrollStateChanged(AbsListView absListView, int scrollState) {
        if (scrollState == SCROLL_STATE_IDLE || scrollState == SCROLL_STATE_TOUCH_SCROLL){
            Picasso.get().resumeTag("gallery");
        }else{
            Picasso.get().pauseTag("gallery");
        }
    }

    @Override
    public void onScroll(AbsListView absListView, int i, int i1, int i2) {

    }
}
