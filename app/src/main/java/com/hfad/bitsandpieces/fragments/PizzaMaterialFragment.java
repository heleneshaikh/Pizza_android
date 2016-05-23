package com.hfad.bitsandpieces.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.bitsandpieces.CaptionedImagesAdapter;
import com.hfad.bitsandpieces.R;
import com.hfad.bitsandpieces.domain.Pizza;


/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaMaterialFragment extends Fragment {

    Pizza[] pizzas = Pizza.pizzas;

    public PizzaMaterialFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView pizzaRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_pizza_material, container, false);

        String [] pizzaNames = new String[Pizza.pizzas.length];
        for (int i = 0; i < pizzas.length; i++) {
            pizzaNames[i] = Pizza.pizzas[i].getName();
        }

        int [] pizzaImages = new int[Pizza.pizzas.length];
        for (int i = 0; i < pizzas.length; i++) {
            pizzaImages[i]  = Pizza.pizzas[i].getImageId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(pizzaNames, pizzaImages);
        pizzaRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        pizzaRecycler.setLayoutManager(layoutManager);
        return pizzaRecycler;
    }

}
