package ua.andriypauk.myphotoflickr.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import ua.andriypauk.myphotoflickr.R;

/**
 * Created by Andriy on 25.01.2017.
 */

public class PhotoFlickrAdapter extends RecyclerView.Adapter<PhotoFlickrAdapter.MyViewHolder> {

    private Context mContext;


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageFlickr;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageFlickr = (ImageView)itemView.findViewById(R.id.album_card_imageView);
        }
    }
}


