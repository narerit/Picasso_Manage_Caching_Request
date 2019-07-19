package com.example.picassodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.net.URL;

/**
 * Created by Narerit on 7/19/2019.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView banner = findViewById(R.id.image_banner);
        Button btnGallery = findViewById(R.id.btn_gallery);
        //TODO 1 :  Set url for image.
        String imageUrl = "https://images.pexels.com/photos/1036622/pexels-photo-1036622.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940";
        //TODO 2 : Set logging in Debug Console to see how we retrieve images.
        Picasso.get().setLoggingEnabled(true);
        //TODO 3 : Set indicator to see where images load from.
        Picasso.get().setIndicatorsEnabled(true);

        //TODO 4 : Get image from url, here we can set caching and images behavior
        Picasso.get().load(imageUrl)
                .memoryPolicy(MemoryPolicy.NO_CACHE,MemoryPolicy.NO_STORE)
                .networkPolicy(NetworkPolicy.NO_CACHE, NetworkPolicy.NO_STORE)
                .fit().into(banner);

        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(intent);
            }
        });

    }
}
