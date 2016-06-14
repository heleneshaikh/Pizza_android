package com.hfad.bitsandpieces;

import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    // RETRIEVE DATA
    private String[] captions;
    private int[] imageIds;
    private Listener listener;

    public CaptionedImagesAdapter(String[] captions, int[] imageIds) {
        this.captions = captions;
        this.imageIds = imageIds;
    }

    // DEFINE THE VIEW. Here VH needs to store card views
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }

    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {  // parent(pizza material fragment) => the Recycler View itself
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(cv);
    }

    // DISPLAY DATA. BIND DATA + VIEW
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.info_image);
       // deprecated: Drawable drawable = cardView.getResources().getDrawable(imageIds[position]);
        int image = imageIds[position];
        Drawable drawable = ResourcesCompat.getDrawable(cardView.getResources(), image, null);
        imageView.setImageDrawable(drawable);
        TextView textView = (TextView) cardView.findViewById(R.id.info_title);
        textView.setText(captions[position]);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(position);
            }
        });
    }

    //to return number of items in data set
    @Override
    public int getItemCount() {
        return captions.length;
    }

    public interface Listener {
        void onClick(int position);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }


}
