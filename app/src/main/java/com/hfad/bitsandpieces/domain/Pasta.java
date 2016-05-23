package com.hfad.bitsandpieces.domain;

import com.hfad.bitsandpieces.R;

/**
 * Created by heleneshaikh on 23/05/16.
 */
public class Pasta {
    private String name;
    private int imageId;

    public static final Pasta[] pastas = {
            new Pasta("Bolognese", R.drawable.diavolo),
            new Pasta("Lasagne", R.drawable.funghi)
    };

    public Pasta(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
