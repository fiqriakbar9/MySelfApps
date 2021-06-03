package com.apps.myselfapps;
  /*

    TANGGAL PENGERJAAN : 29 Mei 2021 - 04 Juni 2021
    NIM     : 10118020
    NAMA    : Fiqri Akbar Pratama
    KELAS   : IF1
    */
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewCustom extends BaseAdapter {

    private Context mContext;
    private final int[] gridView_Image;
    private final String[] gridView_Text;

    public GridViewCustom(Context context, int[] gridViewGambar, String[] gridViewTeks) {
        mContext = context;
        this.gridView_Image = gridViewGambar;
        this.gridView_Text = gridViewTeks;
    }

    @Override
    public int getCount() {
        return gridView_Text.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            gridViewAndroid = inflater.inflate(R.layout.grid_layout, null);
            ImageView imageViewAndroid = gridViewAndroid.findViewById(R.id.grid_image);
            TextView textViewAndroid = gridViewAndroid.findViewById(R.id.grid_text);
            imageViewAndroid.setImageResource(gridView_Image[i]);
            textViewAndroid.setText(gridView_Text[i]);
        } else {
            gridViewAndroid = convertView;
        }

        return gridViewAndroid;
    }
}