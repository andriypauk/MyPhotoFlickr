package ua.andriypauk.myphotoflickr.view;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import ua.andriypauk.myphotoflickr.R;
import ua.andriypauk.myphotoflickr.model.data.Photos;
import ua.andriypauk.myphotoflickr.presenter.FlickrListPresenter;
import ua.andriypauk.myphotoflickr.view.adapter.PhotoFlickrAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements IView {

    private RecyclerView recyclerView;
    private PhotoFlickrAdapter adapter;

    private FlickrListPresenter presenter;

    private ImageView imageView;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);



        recyclerView = (RecyclerView)view.findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


        presenter.loadPicture();

        return view;
    }

    @Override
    public void showList(List<Photos> FlickrPhotoList) {

    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void showEmptyList() {

    }

    @Override
    public String getUserName() {
        return null ;
    }
}
