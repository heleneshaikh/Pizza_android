package com.hfad.bitsandpieces;

/**
 * Created by heleneshaikh on 20/05/16.
 */
public class Pizza {
    private String name;
    private int imageId;

    public static final Pizza[] pizzas = {
            new Pizza("Daviolo", R.drawable.diavolo),
            new Pizza("Fungi", R.drawable.funghi)
    };

    public Pizza(String name, int imageId) {
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
