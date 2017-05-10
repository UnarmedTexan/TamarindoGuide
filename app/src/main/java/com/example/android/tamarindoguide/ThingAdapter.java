package com.example.android.tamarindoguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mark on 1/30/2017.
 */

/**
 * {@link ThingAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Thing} objects.
 */
public class ThingAdapter extends ArrayAdapter<Thing> {

    //Resource ID for the background color for this list of things
    private int mColorResourceId;
    View listMenuView;

    /**
     * Create a new {@link ThingAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) where the adapter is being created.
     * @param things          is the list of {@link Thing}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public ThingAdapter(Context context, ArrayList<Thing> things, int colorResourceId) {
        super(context, 0, things);
        mColorResourceId = colorResourceId;
    }

    static class ViewHolder {
        TextView thingTextView;
        TextView descriptionTextView;
        ImageView imageView;
        View textContainer;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_menu, parent, false);
            viewHolder.thingTextView = (TextView) convertView.findViewById(R.id.thing_to_do);
            viewHolder.descriptionTextView = (TextView) convertView.findViewById(R.id.description_text_view);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.image);
            viewHolder.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //get the {@link Thing} object for this list position
        Thing currentThing = getItem(position);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        viewHolder.textContainer = (View) convertView.findViewById(R.id.list_bucket);
        viewHolder.textContainer.setBackgroundColor(color);

        viewHolder.thingTextView.setText(currentThing.getThing());
        viewHolder.descriptionTextView.setText(currentThing.getDescription());
        viewHolder.imageView.setImageResource(currentThing.getImageResourceId());

        return convertView;

    }
}
