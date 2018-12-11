package com.google.techexchange.visitjax;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter{
    Context context;
    LayoutInflater inflater;


    //list of images
    public int[] lst_images={
      R.drawable.jacksonville,
      R.drawable.jax_dt,
      R.drawable.jax_beach,
      R.drawable.jax_surf_logo,
      R.drawable.jax_surf_paddle,
      R.drawable.jax_zoo,
      R.drawable.jax_zoo_feed
    };
    //list of titles
    public String[] lst_titles = {
            "@string/mosh_title",
            "@string/jags_title",
            "@string/zoo_title",
            "@string/beach_title"


};
    //list of description
    public String[] lst_descriptions = {
            "@string/mosh_description",
            "@string/jags_description",
            "@string/zoo_description",
            "@string/beach_description"

    };


    public SlideAdapter(Context context){
        this.context = context;

    }


    @Override
    public int getCount() {
        return lst_titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view == (LinearLayout)o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slides,container,false);
        LinearLayout layoutslide =(LinearLayout) view.findViewById(R.id.slidingLinearLayout);

        ImageView imgslide = (ImageView) view.findViewById(R.id.sliding_img);
        TextView txttitle = (TextView) view.findViewById(R.id.sliding_title);
        TextView description = (TextView) view.findViewById(R.id.sliding_description);

        //layoutside.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_titles[position]);
        description.setText(lst_descriptions[position]);
        container.addView(view);
        return view;



    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }


}









