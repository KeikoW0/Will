package com.example.willwood;

import java.io.Serializable;

public class LaguClass implements Serializable {
    private String judulLagu;

    public LaguClass(String judulLagu) {
        this.judulLagu = judulLagu;
    }

    public String getJudulLagu() {
        return judulLagu;
    }
}