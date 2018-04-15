package com.example.android.citytourguide;


import android.os.Bundle;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_attraction_list, container, false);

        //Create a list of touristic attractions
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<>();
        touristAttractions.add(new TouristAttraction("La Sepp", R.drawable.sepp));
        touristAttractions.add(new TouristAttraction("Ileana Wine Cellar", R.drawable.ileana));
        touristAttractions.add(new TouristAttraction("Pension Casa Frieda", R.drawable.frieda));
        touristAttractions.add(new TouristAttraction("Balkan Bistro", R.drawable.balkan));
        touristAttractions.add(new TouristAttraction("Ramada Atrium", R.drawable.ramada));

        /*
         * Create an {@link TouristAttractionAdapter} whose data source is a list of {@link TouristAttraction}s.
         * The adapter knows how to create list items for each item in the list.
         */
        TouristAttractionAdapter adapter = new TouristAttractionAdapter(getActivity(), touristAttractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tourist_attraction_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
