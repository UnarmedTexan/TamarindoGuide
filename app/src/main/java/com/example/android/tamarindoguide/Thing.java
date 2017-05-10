package com.example.android.tamarindoguide;

/**
 * Created by Mark on 1/30/2017.
 */

public class Thing {

    //String resource Id for Type of thing
    private int mThing;

    //String resource Id for Thing description
    private int mAboutThing;

    //Variable for image location
    private int mImageResourceId;

    /**
     * Create a new Thing.
     *
     * @param thing           is an item to experience in Tamarindo
     * @param imageResourceId is the drawable image serving as a icon to match a particular Thing
     */
    public Thing(int thing, int aboutThing, int imageResourceId) {
        mThing = thing;
        mAboutThing = aboutThing;
        mImageResourceId = imageResourceId;
    }

    // Get the Thing to experience in Tamarindo.
    public int getThing() {
        return mThing;
    }

    // Get the String resource Id for the Thing description
    public int getDescription() {
        return mAboutThing;
    }

    // Get the resource Id for the Thing image
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
