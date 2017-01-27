package ua.andriypauk.myphotoflickr.model.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;



/**
 * Created by Andriy on 25.01.2017.
 */

public class ApiModule {


     static final String FLICKR_PHOTO_RECENT = "rest/?method=flickr.photos.getRecent&api_key=15fcd52bf33ab6a2cd1baef1c697a4a3&format=json&nojsoncallback=1&";

     private static final String FLICR_BASE_URL = "https://api.flickr.com/services/";


    public static ApiInterface buildRetrofitService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(FLICR_BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        return retrofit.create(ApiInterface.class);

    }









}
