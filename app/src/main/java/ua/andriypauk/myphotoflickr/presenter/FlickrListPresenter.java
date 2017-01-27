package ua.andriypauk.myphotoflickr.presenter;

import java.util.List;

import rx.Observer;
import rx.Subscription;
import rx.subscriptions.Subscriptions;
import ua.andriypauk.myphotoflickr.model.Model;
import ua.andriypauk.myphotoflickr.model.ModelImpl;
import ua.andriypauk.myphotoflickr.model.data.Photos;
import ua.andriypauk.myphotoflickr.view.IView;

/**
 * Created by Andriy on 27.01.2017.
 */

public class FlickrListPresenter implements Presenter {

    private Model model = new ModelImpl();

    private Subscription subscription = Subscriptions.empty();

    IView view;

    @Override
    public void onStop() {

    }

    @Override
    public void loadPicture() {

        subscription = model.getPhotosList(view.getUserName())
                .subscribe(new Observer<List<Photos>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                view.showError(e.getMessage());

            }

            @Override
            public void onNext(List<Photos> photoses) {

            }
        });

    }


}
