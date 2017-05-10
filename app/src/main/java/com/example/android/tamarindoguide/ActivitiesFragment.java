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
public class ActivitiesFragment extends Fragment {

    // Required empty public constructor
    public ActivitiesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.to_do_list, container, false);

        /**
         * List of Activities to do in Tamarindo, spelled out as Strings with String resource Id's
         * to provide activity titles & descriptions of the activies, and an Image resource Id of
         * the activity
         */
        final ArrayList<Thing> things = new ArrayList<Thing>();
        things.add(new Thing(R.string.activity_atv, R.string.activity_description_atv,
                R.drawable.atv));
        things.add(new Thing(R.string.activity_fishing, R.string.activity_description_fishing,
                R.drawable.sportfishing));
        things.add(new Thing(R.string.activity_kayaking, R.string.activity_description_kayaking,
                R.drawable.kayaking));
        things.add(new Thing(R.string.activity_paddleBoarding,
                R.string.activity_description_paddleBoarding, R.drawable.paddleboarding));
        things.add(new Thing(R.string.activity_rafting, R.string.activity_description_rafting,
                R.drawable.rafting));
        things.add(new Thing(R.string.activity_sailing, R.string.activity_description_sailing,
                R.drawable.sailing));
        things.add(new Thing(R.string.activity_surfing, R.string.activity_description_surfing,
                R.drawable.surfing));
        things.add(new Thing(R.string.activity_zipline, R.string.activity_description_zipline,
                R.drawable.zipline));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The adapter knows
         * how to create layouts for each item in the list, using the simple_list_item_1.xml layout
         * resource defined in the Android framework.  This list item layout contains a single
         * {@link TextView}, which the adapter will set to display a single Thing.
         */
        ThingAdapter adapter = new ThingAdapter(getActivity(), things, R.color.category_activities);

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