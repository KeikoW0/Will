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

public class LaguAdapter extends ArrayAdapter<LaguClass> {
    public LaguAdapter(Context context, ArrayList<LaguClass> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LaguClass song = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.recycler_lagu, parent, false);
        }
        TextView tvJudulLagu = convertView.findViewById(R.id.judulLagu);
        tvJudulLagu.setText(song.getJudulLagu());
        return convertView;
    }
}