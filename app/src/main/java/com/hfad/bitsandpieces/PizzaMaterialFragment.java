package com.hfad.bitsandpieces;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaMaterialFragment extends Fragment {

    Pizza[] pizzas = Pizza.pizzas;
    String [] pizzaNames;
    int [] pizzaImages;

    public PizzaMaterialFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView pizzaRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_pizza_material, container, false);

        for (int i = 0; i < pizzas.length; i++) {
            pizzaNames[i] = pizzas[i].getName();
        }

        for (int i = 0; i < pizzas.length; i++) {
            pizzaImages[i]  = pizzas[i].getImageId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(pizzaNames, pizzaImages);
        pizzaRecycler.setAdapter(adapter);
        return pizzaRecycler;
    }

}
