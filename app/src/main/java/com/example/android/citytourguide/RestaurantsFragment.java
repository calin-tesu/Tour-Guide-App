package com.example.android.citytourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_attraction_list, container, false);

        //Create a list of touristic attractions
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<>();
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.la_sepp), R.drawable.sepp));
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.ileana_wine_cellar), R.drawable.ileana));
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.pension_casa_frieda), R.drawable.frieda));
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.balkan_bistro), R.drawable.balkan));
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.ramada_atrium), R.drawable.ramada));

        /*
         * Create an {@link TouristAttractionAdapter} whose data source is a list of {@link TouristAttraction}s.
         * The adapter knows how to create list items for each item in the list.
         */
        TouristAttractionAdapter adapter = new TouristAttractionAdapter(getActivity(), touristAttractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tourist_attraction_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
