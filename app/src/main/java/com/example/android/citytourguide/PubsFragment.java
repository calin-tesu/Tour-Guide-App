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
public class PubsFragment extends Fragment {


    public PubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_attraction_list, container, false);

        //Create a list of touristic attractions
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<>();
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.the_corner), R.drawable.corner));
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.cotton_pub), R.drawable.cotton));
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.geea), R.drawable.geea));
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.liquid_club), R.drawable.liquid));
        touristAttractions.add(new TouristAttraction(getString(com.example.android.citytourguide.R.string.oldies_pub), R.drawable.oldies));

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
