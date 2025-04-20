package com.example.willwood;

import java.io.Serializable;
import java.util.ArrayList;

public class AlbumClass implements Serializable {
    private String namaAlbum;
    private ArrayList<LaguClass> daftarLagu;

    private Integer imageAlbum;

    public AlbumClass(String namaAlbum, Integer imageAlbum) {
        this.namaAlbum = namaAlbum;
        this.daftarLagu = new ArrayList<>();
        this.imageAlbum = imageAlbum;
    }

    public String getNamaAlbum() {
        return namaAlbum;
    }

    public void tambahLagu(LaguClass lagu) {
        daftarLagu.add(lagu);
    }

    public ArrayList<LaguClass> getDaftarLagu() {
        return daftarLagu;
    }

    public Integer getImageAlbum()  {
        return imageAlbum;
    }
}