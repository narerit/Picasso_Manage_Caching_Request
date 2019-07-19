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
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId,parent,false);
        }
        Picasso.get().load(this.data.get(position)).fit().centerCrop().into((ImageView) convertView);
        return convertView;
    }
}
