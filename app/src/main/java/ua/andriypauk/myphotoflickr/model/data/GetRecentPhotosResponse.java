
package ua.andriypauk.myphotoflickr.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetRecentPhotosResponse {

    @SerializedName("photos")
    @Expose
    private Photos photos;

    public Photos getPhotos() {
        return photos;
    }

    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

}
