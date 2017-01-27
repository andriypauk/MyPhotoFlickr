package ua.andriypauk.myphotoflickr.model;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import ua.andriypauk.myphotoflickr.model.api.ApiInterface;
import ua.andriypauk.myphotoflickr.model.api.ApiModule;
import ua.andriypauk.myphotoflickr.model.data.Photos;

/**
 * Created by Andriy on 26.01.2017.
 */

public class ModelImpl implements Model {

   ApiInterface apiInterface = ApiModule.buildRetrofitService();
    @Override
    public Observable<List<Photos>> getPhotosList(String photos) {
        return apiInterface.getPhotosRecent(photos)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
