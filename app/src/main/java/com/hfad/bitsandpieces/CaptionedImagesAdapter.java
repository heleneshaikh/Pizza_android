package com.hfad.bitsandpieces;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    //3. RETRIEVE DATA
    private String[] captions;
    private int[] imageIds;

    public CaptionedImagesAdapter(String[] captions, int[] imageIds) {
        this.captions = captions;
        this.imageIds = imageIds;
    }

    //1. DEFINE THE VIEW. Here VH needs to store card views
    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }

    //2. REPEATEDLY CALLED. How many VH it needs to maintain
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {  // parent(pizza material fragment) => the Recycler View itself
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(cv);
    }

    //4. DISPLAY DATA. BIND DATA + VIEW
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
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
