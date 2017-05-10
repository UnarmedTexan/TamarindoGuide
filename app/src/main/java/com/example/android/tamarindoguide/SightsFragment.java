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
public class SightsFragment extends Fragment {


    // Required empty public constructor
    public SightsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.to_do_list, container, false);

        /**
         * List of Sights to visit in Tamarindo, spelled out as Strings with String resource Id's
         * to pride descriptions of the Sight, and an Image resource Id of the Sight
         */
        final ArrayList<Thing> things = new ArrayList<Thing>();
        things.add(new Thing(R.string.sights_llanos, R.string.sights_description_llanos,
                R.drawable.llanodecortezwaterfall));
        things.add(new Thing(R.string.sights_monkeyPark, R.string.sights_description_monkeyPark,
                R.drawable.monkeypark));
        things.add(new Thing(R.string.sights_paloVerde, R.string.sights_description_paloVerde,
                R.drawable.paloverde));
        things.add(new Thing(R.string.sights_rinconVieja, R.string.sights_description_rinconVieja,
                R.drawable.rinconvieja));
        things.add(new Thing(R.string.sights_rioCeleste, R.string.sights_description_rioCeleste,
                R.drawable.rioceleste));
        things.add(new Thing(R.string.sights_rioPerdido, R.string.sights_description_rioPerdido,
                R.drawable.rioperdido));
        things.add(new Thing(R.string.sights_turtles, R.string.sights_description_turtles,
                R.drawable.leatherback));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The adapter knows
         * how to create layouts for each item in the list, using the simple_list_item_1.xml layout
         * resource defined in the Android framework.  This list item layout contains a single
         * {@link TextView}, which the adapter will set to display a single Thing.
         */
        ThingAdapter adapter = new ThingAdapter(getActivity(), things, R.color.category_beaches);

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
