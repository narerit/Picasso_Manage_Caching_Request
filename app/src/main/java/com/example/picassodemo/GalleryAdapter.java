package com.example.picassodemo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Narerit on 7/19/2019.
 */
public class GalleryAdapter extends ArrayAdapter {
    private Context context;
    private int layoutResourceId;
    private ArrayList<String> data;

    public GalleryAdapter(Context context, int layoutResourceId, ArrayList<String> data) {
        super(context,layoutResourceId,data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Override
    public View getView(int position, View imageView, ViewGroup parent) {
        //TODO 1 : Inflate our imageView for gallery
        if (imageView == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            imageView = inflater.inflate(layoutResourceId,parent,false);
        }
        //TODO 2 : Load images from url in array we passed.
        Picasso.get().load(this.data.get(position))
                .fit().centerCrop() //TODO 3 : Set image as fit and crop only center.
                .placeholder(R.drawable.placeholder) //TODO 4 : Set placeholder to show before load finish.
                .error(R.drawable.error_placeholder) //TODO 5 : Set error placeholder for our wrong url.
                .tag("gallery") //TODO 6 : set tag for our onScroll listener.
                .into((ImageView) imageView);
        return imageView;
    }
}
