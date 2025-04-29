package com.example.willwood;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListLaguActivity extends AppCompatActivity {
    private ListView lvLagu;

    private TextView tvalbumName;

    private ImageView imgAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_lagu);

        lvLagu = findViewById(R.id.lv_lagu);

        AlbumClass album = (AlbumClass) getIntent().getSerializableExtra("album");
        assert album != null;
        ArrayList<LaguClass> daftarLagu = album.getDaftarLagu();

        String albumName = getIntent().getStringExtra("nama album");
        tvalbumName = findViewById(R.id.tv_album_name);


        int imgAlbumRes = getIntent().getIntExtra("img_album", 0);
        imgAlbum = findViewById(R.id.ImageLagu);

        tvalbumName.setText(albumName);
        imgAlbum.setImageResource(imgAlbumRes);

        LaguAdapter adapter = new LaguAdapter(this, daftarLagu);
        lvLagu.setAdapter(adapter);
    }
}