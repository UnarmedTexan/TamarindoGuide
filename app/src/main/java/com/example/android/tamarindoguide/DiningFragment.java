package com.example.android.tamarindoguide;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiningFragment extends Fragment {

    // Required empty public constructor
    public DiningFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.to_do_list, container, false);

        /**
         * List of places to eat in Tamarindo, spelled out as Strings with String resource Id's
         * to pride descriptions of the Restaurants, and an Image resource Id of the restaurant
         */
        final ArrayList<Thing> things = new ArrayList<Thing>();
        things.add(new Thing(R.string.dining_black, R.string.dining_description_black,
                R.drawable.black));
        things.add(new Thing(R.string.dining_dragon, R.string.dining_description_dragon,
                R.drawable.dragon));
        things.add(new Thing(R.string.dining_green, R.string.dining_description_green,
                R.drawable.greenpapaya));
        things.add(new Thing(R.string.dining_longboards, R.string.dining_description_longboards,
                R.drawable.longboards));
        things.add(new Thing(R.string.dining_baula, R.string.dining_description_baula,
                R.drawable.labaula));
        things.add(new Thing(R.string.dining_latitude, R.string.dining_description_latitude,
                R.drawable.latitudeblue));
        things.add(new Thing(R.string.dining_noguis, R.string.dining_description_noguis,
                R.drawable.noguis));
        things.add(new Thing(R.string.dining_shlomy, R.string.dining_description_shlomy,
                R.drawable.shlomy));
        things.add(new Thing(R.string.dining_sprout, R.string.dining_description_sprout,
                R.drawable.sprout));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The adapter knows
         * how to create layouts for each item in the list, using the simple_list_item_1.xml layout
         * resource defined in the Android framework.  This list item layout contains a single
         * {@link TextView}, which the adapter will set to display a single Thing.
         */
        ThingAdapter adapter = new ThingAdapter(getActivity(), things, R.color.category_dining);

        /** Find the {@link ListView} object in the view hierarchy of the {@link Activity}. There
         * should be a {@link ListView} with the view ID called list, which is declared in the
         * to_do_list.xml file.
         */
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /** Make the {@link ListView} using the {@link ArrayAdapter} created above, so the
         * {@link ListView} will display list menu for each word in the list of things.
         * Do this by calling the setAdapter method on the {@link ListView} object and pass in
         * the {@link ArrayAdapter} with the variable name adapter.
         */
        listView.setAdapter(adapter);

        return rootView;
    }
}