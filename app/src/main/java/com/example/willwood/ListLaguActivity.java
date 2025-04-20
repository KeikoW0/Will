package com.example.willwood;

import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_lagu);

        lvLagu = findViewById(R.id.lv_lagu);

        AlbumClass album = (AlbumClass) getIntent().getSerializableExtra("album");
        ArrayList<LaguClass> daftarLagu = album.getDaftarLagu();

        String albumName = getIntent().getStringExtra("nama album");
        TextView tvalbumName = findViewById(R.id.namaAlbum);

        tvalbumName.setText(albumName);

        LaguAdapter adapter = new LaguAdapter(this, daftarLagu);
        lvLagu.setAdapter(adapter);
    }
}