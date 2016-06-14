package com.hfad.bitsandpieces.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.bitsandpieces.CaptionedImagesAdapter;
import com.hfad.bitsandpieces.R;
import com.hfad.bitsandpieces.domain.Burger;

/**
 * A simple {@link Fragment} subclass.
 */
public class BurgerMaterialFragment extends Fragment {
    Burger[] burgers = Burger.burgers;

    public BurgerMaterialFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_burger_material, container, false);

        String [] burgerNames = new String[burgers.length];
        for (int i = 0; i < burgerNames.length; i++) {
            burgerNames[i] = burgers[i].getName(); //change to burgers[i]
        }

        int [] burgerImages = new int[burgers.length];
        for (int i = 0; i < burgerImages.length; i++) {
           burgerImages[i] = burgers[i].getImageId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(burgerNames, burgerImages);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        return recyclerView;
    }

}
