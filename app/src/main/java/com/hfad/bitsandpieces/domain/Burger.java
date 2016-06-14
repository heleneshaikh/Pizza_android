package com.hfad.bitsandpieces.domain;

import com.hfad.bitsandpieces.R;

/**
 * Created by heleneshaikh on 07/06/16.
 */
public class Burger {
    private String name;
    private int imageId;

    public static Burger [] burgers = {
            new Burger("Cheeseburger", R.drawable.cheeseburger),
            new Burger("Hamburger", R.drawable.hamburger)
    };

    public Burger(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
