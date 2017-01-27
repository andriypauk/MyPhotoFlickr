package ua.andriypauk.myphotoflickr.view;

import java.util.List;

import ua.andriypauk.myphotoflickr.model.data.Photos;

/**
 * Created by Andriy on 27.01.2017.
 */

public interface IView {

    void showList(List<Photos> FlickrPhotoList);
    void showError(String error);
    void showEmptyList();
    String getUserName();


}
