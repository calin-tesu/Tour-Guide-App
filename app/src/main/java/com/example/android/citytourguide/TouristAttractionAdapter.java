package com.example.android.citytourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class TouristAttractionAdapter extends ArrayAdapter<TouristAttraction> {

    /**
     * Constructor
     *
     * @param context            The current context.
     * @param touristAttractions A list of touristic attractions to display in a list
     */
    public TouristAttractionAdapter(@NonNull Context context, ArrayList<TouristAttraction> touristAttractions) {
        super(context, 0, touristAttractions);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the data item from this position
        TouristAttraction currentAttraction = getItem(position);

        //Find the text view in the list_item_xml with the Id attraction_name
        TextView tvAttractionName = listItemView.findViewById(R.id.attraction_name);
        //Set the touristic attraction name
        tvAttractionName.setText(currentAttraction.getAttractionName());

        //Find the image view in the list+item.eml with the id attraction_image
        ImageView imageView = listItemView.findViewById(R.id.attraction_image);
        imageView.setImageResource(currentAttraction.getAttractionImageResourceId());

        return listItemView;
    }
}
