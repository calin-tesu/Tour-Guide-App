package com.example.android.citytourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link TouristAttraction} objects.
 */
class CategoryAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;

    /** Context of the app */
    private final Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EventsFragment();
            case 1:
                return new MuseumsFragment();
            case 2:
                return new PubsFragment();
            default:
                return new RestaurantsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_events);
            case 1:
                return mContext.getString(R.string.category_museums);
            case 2:
                return mContext.getString(R.string.category_pubs);
            default:
                return mContext.getString(R.string.category_restaurants);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}