package com.example.picassodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ArrayList<String> imageUrls = new ArrayList<>();
        imageUrls.add("https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        imageUrls.add("https://images.pexels.com/photos/712513/pexels-photo-712513.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        imageUrls.add("https://images.pexels.com/photos/769584/pexels-photo-769584.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        imageUrls.add("https://images.pexels.com/photos/139829/pexels-photo-139829.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        imageUrls.add("https://images.pexels.com/photos/1386603/pexels-photo-1386603.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        imageUrls.add("https://images.pexels.com/photos/821413/pexels-photo-821413.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        imageUrls.add("https://images.pexels.com/photos/89779/girl-rustic-grass-meadow-89779.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        imageUrls.add("https://images.pexels.com/photos/1917785/pexels-photo-1917785.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        GridView gridGallery = findViewById(R.id.grid_gallery);
        GalleryAdapter galleryAdapter = new GalleryAdapter(this, R.layout.gallery_item_layout, imageUrls);
        gridGallery.setAdapter(galleryAdapter);
    }
}
