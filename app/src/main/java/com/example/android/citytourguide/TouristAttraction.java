package com.example.android.citytourguide;

/**
 * {@Link TouristAttraction} represents a touristic attraction that contains a name and an image of it
 */
class TouristAttraction {

    //Attraction name
    private final String mAttractionName;

    //Image resource id for the attraction
    private final int mAttractionImageResourceId;

    /**
     * Create a new TouristAttraction object
     */
    public TouristAttraction(String attractionName, int attractionImageResourceId) {
        mAttractionName = attractionName;
        mAttractionImageResourceId = attractionImageResourceId;
    }

    /**
     * Get the name of tourist attraction
     */
    public String getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the image resource id for the attraction
     */
    public int getAttractionImageResourceId() {
        return mAttractionImageResourceId;
    }
}
