package com.hfad.bitsandpieces.domain;

import com.hfad.bitsandpieces.R;

/**
 * Created by heleneshaikh on 07/06/16.
 */
public class Pasta {
    private String name;
    private int imageId;

    public static Pasta[] pastas = {
            new Pasta("Lasagna", R.drawable.lasagna),
            new Pasta("Carbonara", R.drawable.carbonara)
    };

    public Pasta(String name, int imageId) {
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
}
