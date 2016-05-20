package com.hfad.bitsandpieces;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;


class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
                                        //ViewHolder: say which data the adapter should work with

    //create the views
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    //set values inside the views
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    //to return number of items in data set
    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
