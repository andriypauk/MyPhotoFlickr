package ua.andriypauk.myphotoflickr.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import ua.andriypauk.myphotoflickr.R;
import ua.andriypauk.myphotoflickr.model.data.Photos;

/**
 * Created by Andriy on 25.01.2017.
 */

public class PhotoFlickrAdapter extends RecyclerView.Adapter<PhotoFlickrAdapter.MyViewHolder> {

    private Context mContext;

    private List<Photos> photoList ;

    public PhotoFlickrAdapter(ArrayList<Photos> photos){
        photoList = photos;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Photos photo = photoList.get(position);

        Glide.with(mContext).load(photo.getPhoto()).into(holder.imageFlickr);

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


