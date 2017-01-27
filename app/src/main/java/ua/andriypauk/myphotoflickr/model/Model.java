package ua.andriypauk.myphotoflickr.model;

import java.util.List;

import rx.Observable;
import ua.andriypauk.myphotoflickr.model.data.Photos;

/**
 * Created by Andriy on 25.01.2017.
 */

public interface Model {

    Observable<List<Photos>> getPhotosList(String photos );
}
