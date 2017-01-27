package ua.andriypauk.myphotoflickr.model.api;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import ua.andriypauk.myphotoflickr.model.data.Photos;

import static ua.andriypauk.myphotoflickr.model.api.ApiModule.FLICKR_PHOTO_RECENT;

/**
 * Created by Andriy on 25.01.2017.
 */

public interface ApiInterface {

    @GET(FLICKR_PHOTO_RECENT)
    Observable<List<Photos>> getPhotosRecent(@Query("page") String page);
}
