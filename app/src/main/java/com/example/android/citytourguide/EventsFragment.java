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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_attraction_list, container, false);

        //Create a list of touristic attractions
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<>();
        touristAttractions.add(new TouristAttraction("Sibiu International Theatre Festival", R.drawable.faust));
        touristAttractions.add(new TouristAttraction("Sibiu Jazz Festival", R.drawable.jazz));
        touristAttractions.add(new TouristAttraction("Medieval Festival \"Transylvanian Fortresses\"", R.drawable.medieval));
        touristAttractions.add(new TouristAttraction("ArtMania Rock Festival", R.drawable.artmania));
        touristAttractions.add(new TouristAttraction("Cibinfest", R.drawable.cibinfest));
        touristAttractions.add(new TouristAttraction("Red Bull roMANIACS", R.drawable.red_bull_romaniacs));

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
