package com.example.willwood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AlbumAdapter extends ArrayAdapter<AlbumClass> {
    public AlbumAdapter(Context context, ArrayList<AlbumClass> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AlbumClass album = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.recycler_album, parent, false);
        }
        TextView tvNamaAlbum = convertView.findViewById(R.id.TNA);
        tvNamaAlbum.setText(album.getNamaAlbum());
        ImageView ivImageAlbum = convertView.findViewById(R.id.ImgTNA);
        ivImageAlbum.setImageResource(album.getImageAlbum());
        return convertView;
    }
}