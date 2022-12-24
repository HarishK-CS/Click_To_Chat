package com.techcos.clicktochat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        this.mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        //  ImageView imageView;
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            gridViewAndroid = new View(mContext);
            gridViewAndroid = inflater.inflate(R.layout.gridview_layout, null);
            TextView textView = gridViewAndroid.findViewById(R.id.gridview_text);
            ImageView imageView = gridViewAndroid.findViewById(R.id.gridview_image);
            textView.setText(mString[i]);
            imageView.setImageResource(mThumbIds[i]);

        } else {
            gridViewAndroid = (View) convertView;
        }
        //  imageView.setImageResource(mThumbIds[i]);
        return gridViewAndroid;
    }

    public Integer[] mThumbIds = {
            R.drawable.wa_logo
    };
    public String[] mString ={
            "WhatsApp"
    };
}
