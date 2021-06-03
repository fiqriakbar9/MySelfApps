package com.apps.myselfapps;
  /*

    TANGGAL PENGERJAAN : 29 Mei 2021 - 04 Juni 2021
    NIM     : 10118020
    NAMA    : Fiqri Akbar Pratama
    KELAS   : IF1
    */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.apps.myselfapps.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){

        this.context = context;
    }

    //Arrays
    public int[] slide_images = {
            R.drawable.me_icon,
            R.drawable.eat_icon,
            R.drawable.owl_icon
    };

    public String[] slide_headings = {
            "MYSELF APPS",
            "JANGAN LUPA MAKAN",
            "JANGAN LUPA BERISTIRAHAT"
    };

    public String[] slide_descs = {
            "Halooo, Selamat datang di MySelf Apps yang berisi tentang biodata saya.",
            "Biar sehat selalu jaga pola makan yah",
            "Jangan terlalu dipaksakan, badan kamu butuh istirahat"
    };

    @Override
    public int getCount() {
        return slide_headings.length;

    }

    @Override
    public boolean isViewFromObject(View view,Object o) {

        return view == (ConstraintLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_headings);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
