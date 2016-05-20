package com.hfad.bitsandpieces;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    private String[] captions;
    private int [] imageIds;

    public CaptionedImagesAdapter(String[] captions, int [] imageIds) {
        this.captions = captions;
        this.imageIds = imageIds;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{  //here VH needs to store card views
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }

    //create the views
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(cv);
    }

    //set values inside the views
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView= holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.info_image);
        imageView.setImageResource(imageIds[position]); //if doesn't work, use imageDrawable + resources
        imageView.setContentDescription(captions[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.info_title);
        textView.setText(captions[position]);
    }

    //to return number of items in data set
    @Override
    public int getItemCount() {
        return captions.length;
    }


}
