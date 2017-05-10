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
public class BeachesFragment extends Fragment {

    // Required empty public constructor
    public BeachesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.to_do_list, container, false);

        /**
         * List of Beaches to visit in Tamarindo, spelled out as Strings with String resource Id's
         * to pride descriptions of the Beaches, and an Image resource Id of the beach
         */
        final ArrayList<Thing> things = new ArrayList<Thing>();
        things.add(new Thing(R.string.beach_avellanas, R.string.beaches_description_avellanas,
                R.drawable.avellanas));
        things.add(new Thing(R.string.beach_brasilito, R.string.beaches_description_brasilito,
                R.drawable.brasilito));
        things.add(new Thing(R.string.beach_conchal, R.string.beaches_description_conchal,
                R.drawable.conchalwater));
        things.add(new Thing(R.string.beach_danta, R.string.beaches_description_danta,
                R.drawable.danta));
        things.add(new Thing(R.string.beach_flamingo, R.string.beaches_description_flamingo,
                R.drawable.flamingo));
        things.add(new Thing(R.string.beach_grande, R.string.beaches_description_grande,
                R.drawable.grande));
        things.add(new Thing(R.string.beach_langosta, R.string.beaches_description_langosta,
                R.drawable.langosta));
        things.add(new Thing(R.string.beach_bahia, R.string.beaches_description_bahia,
                R.drawable.bahia));
        things.add(new Thing(R.string.beach_tamarindo, R.string.beaches_description_tamarindo,
                R.drawable.tamarindo));

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